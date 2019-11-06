package farmasys.modelo;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import com.zaxxer.hikari.pool.HikariPool;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.function.Consumer;

public class ConexDBHikari {

    private static HikariConfig config;
    private static HikariDataSource source;

    private PreparedStatement stmt;
    private ResultSet rslt;

    public ConexDBHikari() {
        
        if (config == null && source == null) {
            new ConexDBHikari(null);
        }

    }

    public ConexDBHikari(Object param) {

        try {

            config = new HikariConfig();
            config.setJdbcUrl(Config.BD_URL);

            config.setUsername(Config.getUser());

            config.setPassword(Config.BD_PASS);

            config.setMaximumPoolSize(2);
            config.addDataSourceProperty("cachePrepStmts", "true");
            config.addDataSourceProperty("prepStmtCacheSize", "250");
            config.addDataSourceProperty("prepStmtCacheSqlLimit", "2048");

            /*
                CONFIG A PROBAR
             */
            config.addDataSourceProperty("allowMultiQueries", "true");
            config.addDataSourceProperty("useServerPrepStmts", "true");
            source = new HikariDataSource(config);
        } catch (HikariPool.PoolInitializationException e) {
            System.out.println("No se pudo inicializar la conexión con Hikari " + e.getMessage());
        }
    }
    
    public Connection getConnection() {
        try {
//            
            return source.getConnection();
        } catch (SQLException e) {
            return null;
        }
    }
    
    public SQLException ejecutar(String sql, Connection conn, Map<Integer, Object> parametros) {
        //this.conn = conn;
        try {

            if (parametros == null) {
                stmt = conn.prepareStatement(sql);
            } else {
                stmt = prepararStatement(sql, conn, parametros);
            }

            stmt.executeUpdate();

            parametros = null;
            return null;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            close(conn);
            return e;
        } finally {
            closeStmt().close(conn);
        }
    }

    private PreparedStatement prepararStatement(String sql, Connection conn, Map<Integer, Object> parametros) throws SQLException {

        stmt = conn.prepareStatement(sql);

        try {
            int threads = 4;
            if (parametros.size() > 10) {
                threads = 6;
            }

            Config.getPool(threads).submit(() -> {
                parametros.entrySet().parallelStream().forEach(new Consumer<Map.Entry<Integer, Object>>() {

                    int posicion = 1;

                    @Override
                    public void accept(Map.Entry<Integer, Object> entry) {

                        try {
                            posicion = entry.getKey();
                            if (entry.getValue() instanceof String) {

                                stmt.setString(posicion, entry.getValue().toString());

                            } else if (entry.getValue() instanceof Integer) {

                                stmt.setInt(posicion, (int) entry.getValue());

                            } else if (entry.getValue() instanceof Double) {

                                stmt.setDouble(posicion, (double) entry.getValue());

                            } else if (entry.getValue() instanceof LocalTime) {

                                stmt.setTime(posicion, java.sql.Time.valueOf((LocalTime) entry.getValue()));

                            } else if (entry.getValue() instanceof LocalDate) {

                                stmt.setDate(posicion, java.sql.Date.valueOf((LocalDate) entry.getValue()));

                            } else if (entry.getValue() instanceof Boolean) {

                                stmt.setBoolean(posicion, (boolean) entry.getValue());

                            } else if (entry.getValue() instanceof Boolean) {

                                stmt.setBoolean(posicion, (boolean) entry.getValue());

                            } else if (entry.getValue() instanceof Byte[]) {

                                stmt.setBytes(posicion, (byte[]) entry.getValue());

                            }
                        } catch (SQLException ex) {
                            System.out.println(ex.getMessage());
                        }
                    }
                });
            }).get();
            Config.THREAD_POOL.shutdown();
        } catch (InterruptedException | ExecutionException ex) {
            System.out.println(ex.getMessage());
        }
        return stmt;
    }

    public ResultSet ejecutarQuery(String sql, Connection conn, Map<Integer, Object> parametros) {
        try {
            if (parametros == null) {
                stmt = conn.prepareStatement(sql);
            } else {
                stmt = prepararStatement(sql, conn, parametros);
            }
            rslt = stmt.executeQuery();

            parametros = null;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
        return rslt;
    }

    public ConexDBHikari close(Connection conn) {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return this;
    }

    public ConexDBHikari close(ResultSet rs) {
        try {
            rs.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return this;
    }

    public ConexDBHikari closeStmt() {
        try {
            stmt.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return this;
    }

    public PreparedStatement getStmt() {
        return stmt;
    }

    public ResultSet getRs() {
        return rslt;
    }
    
    public void closeHikari() {
        if (ConexDBHikari.source != null && !ConexDBHikari.source.isClosed()) {
            ConexDBHikari.source.close();
        }
    }

}
