
CREATE SCHEMA "product";

-- Tablas

CREATE TABLE product."marca"(
    id_marca BIGSERIAL NOT NULL,
    marca_nombre character varying(20) NOT NULL,
    marca_pais_origen character varying(15),
    marca_sitio_web character varying(35),
    marca_activa BOOLEAN DEFAULT 'true',
    CONSTRAINT marca_pk PRIMARY KEY("id_marca")
) WITH (OIDS = FALSE);

CREATE TABLE product."producto"(
    id_producto BIGSERIAL NOT NULL,
    id_marca INTEGER NOT NULL,
    producto_nombre character varying(30) NOT NULL,
    producto_codigo_barras INTEGER NOT NULL,
    producto_precio NUMERIC(5,2) NOT NULL DEFAULT 0,
    producto_precio_individual NUMERIC(5,2) DEFAULT 0,
    producto_descripcion TEXT NOT NULL,
    producto_num_unidades INTEGER NOT NULL DEFAULT 0,
    cantidad_minima INTEGER NOT NULL DEFAULT 0,
    cantidad_maxima INTEGER DEFAULT 0,
    producto_calificacion INTEGER NOT NULL DEFAULT 0,
    producto_tiene_iva BOOLEAN DEFAULT 'false',
    producto_activo BOOLEAN NOT NULL DEFAULT 'true',
    CONSTRAINT producto_pk PRIMARY KEY("id_producto")
) WITH (OIDS = FALSE);

CREATE TABLE product."clienteNoRegistrado"(
    id_cliente_no_registrado BIGSERIAL NOT NULL,
    cliente_no_registrado_referencia character varying(25) NOT NULL,
    cliente_no_registrado_fecha TIMESTAMP NOT NULL DEFAULT now(),
    cliente_no_registrado_activo BOOLEAN NOT NULL DEFAULT 'true',
    CONSTRAINT cliente_no_registrado_pk PRIMARY KEY("id_cliente_no_registrado")
) WITH (OIDS = FALSE);
-- 4 atributos

CREATE TABLE product."preferenciaNoRegistrado"(
    id_no_registrado_preferencia BIGSERIAL NOT NULL,
    id_producto INTEGER NOT NULL,
    id_cliente_no_registrado INTEGER NOT NULL,
    producto_cantidad INTEGER NOT NULL DEFAULT 0,
    producto_cantidad_unidades INTEGER NOT NULL DEFAULT 0,
    fecha_registro TIMESTAMP NOT NULL DEFAULT now(),
    no_registrado_preferencia_activo BOOLEAN NOT NULL DEFAULT 'true',
    CONSTRAINT no_registrado_preferencia_pk PRIMARY KEY("id_no_registrado_preferencia")
) WITH (OIDS = FALSE);
-- 7 atributos

CREATE TABLE product."inventario"(
    id_inventario BIGSERIAL NOT NULL,
    id_producto INTEGER NOT NULL,
    producto_stock INTEGER NOT NULL DEFAULT 0,
    producto_costo NUMERIC(5,2) DEFAULT 0,
    fecha_ingreso TIMESTAMP NOT NULL DEFAULT now(),
    fecha_caducidad TIMESTAMP,
    total_costo NUMERIC(5,2) DEFAULT 0,
    inventario_activo BOOLEAN DEFAULT 'true',
    CONSTRAINT inventario_pk PRIMARY KEY("id_inventario")
) WITH (OIDS = FALSE);
-- 8 atributos

CREATE TABLE product."usoProducto"(
    id_uso_producto BIGSERIAL NOT NULL,
    id_producto INTEGER NOT NULL,
    uso_nombre character varying(80) NOT NULL,
    uso_producto_activo BOOLEAN NOT NULL DEFAULT 'true',
    CONSTRAINT uso_producto_pk PRIMARY KEY("id_uso_producto")
) WITH (OIDS = FALSE);
-- 4 atributos

CREATE TABLE product."imagenProducto"(
    id_imagen_producto BIGSERIAL NOT NULL,
    id_producto INTEGER NOT NULL,
    imagen_direccion character varying(100) NOT NULL,
    imagen_principal BOOLEAN NOT NULL DEFAULT 'false',
    imagen_activa BOOLEAN DEFAULT 'true',
    CONSTRAINT imagen_producto_pk PRIMARY KEY("id_imagen_producto")
) WITH (OIDS = FALSE);
-- 5 atributos

CREATE TABLE product."categoria"(
    id_categoria BIGSERIAL NOT NULL,
    categoria_nombre character varying(50) NOT NULL,
    categoria_activa BOOLEAN NOT NULL DEFAULT 'true',
    CONSTRAINT categoria_pk PRIMARY KEY("id_categoria")
) WITH (OIDS = FALSE);
-- 3 atributos

CREATE TABLE product."productoCategoria"(
    id_producto_categoria BIGSERIAL NOT NULL,
    id_producto INTEGER NOT NULL,
    id_categoria INTEGER NOT NULL,
    producto_categoria_fecha TIMESTAMP NOT NULL DEFAULT now(),
    producto_categoria_activo BOOLEAN NOT NULL DEFAULT 'true',
    CONSTRAINT producto_categoria_pk PRIMARY KEY("id_producto_categoria")
) WITH (OIDS = FALSE);
-- 4 atributos

CREATE TABLE product."historialProducto"(
    id_historial_producto BIGSERIAL NOT NULL,
    id_producto INTEGER NOT NULL,
    historial_producto_fecha TIMESTAMP NOT NULL DEFAULT now(),
    historial_producto_activo BOOLEAN NOT NULL DEFAULT 'true',
    CONSTRAINT historial_producto_pk PRIMARY KEY("id_historial_producto")
) WITH (OIDS = FALSE);
-- 4 atributos

CREATE TABLE product."imagenBloqueada"(
    id_imagen_bloqueada BIGSERIAL NOT NULL,
    id_imagen_producto INTEGER NOT NULL,
    imagen_bloqueada_motivo TEXT NOT NULL DEFAULT '',
    imagen_fecha_bloqueo TIMESTAMP NOT NULL DEFAULT now(),
    imagen_bloqueada_activa BOOLEAN NOT NULL DEFAULT 'true',
    CONSTRAINT imagen_bloqueada_pk PRIMARY KEY("id_imagen_bloqueada")
) WITH (OIDS = FALSE);
-- 5 atributos

