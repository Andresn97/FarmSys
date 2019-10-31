
CREATE SCHEMA "person";

-- Tablas

CREATE TABLE person."persona"(
    id_persona BIGSERIAL NOT NULL,
    id_tipo_persona INTEGER NOT NULL,
    persona_identificacion character varying(15),
    persona_primer_nombre character varying(40) NOT NULL,
    persona_segundo_nombre character varying(40) NOT NULL,
    persona_primer_apellido character varying(40) NOT NULL,
    persona_segundo_apellido character varying(40) NOT NULL,
    persona_edad INTEGER NOT NULL,
    persona_celular character varying(15) NOT NULL,
    persona_telefono character varying(15) NOT NULL DEFAULT '',
    persona_sexo character varying(20) NOT NULL,
    persona_direccion character varying(50) NOT NULL,
    persona_correo character varying(50),
    persona_fecha_registro TIMESTAMP NOT NULL DEFAULT now(),
    persona_activa BOOLEAN NOT NULL DEFAULT 'true',
    CONSTRAINT persona_pk PRIMARY KEY("id_persona")
) WITH (OIDS = FALSE);
-- 13 atributos

CREATE TABLE person."tipoPersona"(
    id_tipo_persona BIGSERIAL NOT NULL,
    tipo_nombre character varying(100) NOT NULL,
    tipo_persona_activo BOOLEAN NOT NULL DEFAULT 'true',
    CONSTRAINT tipo_persona_pk PRIMARY KEY("id_tipo_persona")
) WITH (OIDS = FALSE);
-- 3 atributos

CREATE TABLE person."cliente"(
    id_cliente BIGSERIAL NOT NULL,
    id_persona INTEGER NOT NULL,
    cliente_fecha_registro TIMESTAMP NOT NULL DEFAULT now(),
    cliente_activo BOOLEAN NOT NULL DEFAULT 'true',
    CONSTRAINT cliente_pk PRIMARY KEY("id_cliente") 
) WITH (OIDS = FALSE);
-- 4 atributos

CREATE TABLE person."farmaceutico"(
    id_farmaceutico BIGSERIAL NOT NULL,
    id_persona INTEGER NOT NULL,
    num_dias_laborables INTEGER NOT NULL DEFAULT 0,
    horario_entrada character varying(10) NOT NULL DEFAULT 0,
    horario_salida  character varying(10) NOT NULL DEFAULT 0,
    farmaceutico_sueldo NUMERIC(6, 2) DEFAULT 0,
    farmaceutico_fecha_registro TIMESTAMP NOT NULL DEFAULT now(),
    farmaceutico_activo BOOLEAN NOT NULL DEFAULT 'true',
    CONSTRAINT farmaceutico_pk PRIMARY KEY("id_farmaceutico")
) WITH (OIDS = FALSE);
-- 8 atributos

CREATE TABLE person."usuario"(
    id_usuario BIGSERIAL NOT NULL,
    id_persona INTEGER NOT NULL,
    id_rol INTEGER NOT NULL,
    usuario_nombre character varying(15) NOT NULL,
    usuario_contrasena character varying(20) NOT NULL,
    usuario_tipo character varying(1) NOT NULL DEFAULT 'F',
    usuario_activo BOOLEAN NOT NULL DEFAULT 'true',
    CONSTRAINT usuario_pk PRIMARY KEY("id_usuario")
) WITH (OIDS = FALSE);
-- 6 atributos

CREATE TABLE person."rol"(
    id_rol BIGSERIAL NOT NULL,
    rol_nombre character varying(15) NOT NULL,
    rol_observacion TEXT NOT NULL,
    rol_activo BOOLEAN NOT NULL DEFAULT 'true',
    CONSTRAINT rol_pk PRIMARY KEY("id_rol")
) WITH (OIDS = FALSE);
-- 3 atributos

-- CREATE TABLE person."personaRol"(
--     id_persona_rol BIGSERIAL NOT NULL,
--     id_persona INTEGER NOT NULL,
--     id_rol INTEGER NOT NULL,
--     persona_rol_activo BOOLEAN NOT NULL,
--     CONSTRAINT persona_rol_pk PRIMARY KEY("id_persona_rol")
-- ) WITH (OIDS = FALSE);
-- 4 atributos

CREATE TABLE person."factura"(
    id_factura BIGSERIAL NOT NULL,
    id_sucursal INTEGER NOT NULL DEFAULT 1,
    id_farmaceutico INTEGER NOT NULL,
    factura_cantidad_unidades INTEGER DEFAULT 0,
    factura_cantidad INTEGER NOT NULL DEFAULT 0,
    factura_subtotal NUMERIC(7,2) DEFAULT 0,
    factura_iva NUMERIC(3,2) DEFAULT 12,
    factura_fecha_ingreso TIMESTAMP DEFAULT now(),
    factura_total NUMERIC(9,5) DEFAULT 0,
    factura_tiene_cliente BOOLEAN NOT NULL DEFAULT 'false',
    factura_activa  BOOLEAN DEFAULT 'true',
    CONSTRAINT factura_pk PRIMARY KEY("id_factura")
) WITH (OIDS = FALSE);
-- 11 atributos

CREATE TABLE person."detalleFactura"(
    id_detalle_factura BIGSERIAL NOT NULL,
    id_factura INTEGER NOT NULL,
    id_producto INTEGER NOT NULL,
    cantidad_producto INTEGER NOT NULL DEFAULT 0,
    cantidad_unidades INTEGER NOT NULL DEFAULT 0,
    total_detalle_factura NUMERIC(5,2) DEFAULT 0,
    detalle_factura_activo BOOLEAN DEFAULT 'true',
    CONSTRAINT detalle_factura_pk PRIMARY KEY("id_detalle_factura")
) WITH (OIDS = FALSE);
-- 7 atributos

CREATE TABLE person."facturaCliente"(
    id_factura_cliente BIGSERIAL NOT NULL,
    id_cliente INTEGER NOT NULL,
    id_factura INTEGER NOT NULL,
    factura_cliente_fecha TIMESTAMP NOT NULL DEFAULT now(),
    factura_cliente_activo BOOLEAN NOT NULL DEFAULT 'true',
    CONSTRAINT factura_cliente_pk PRIMARY KEY("id_factura_cliente")
) WITH (OIDS = FALSE);
-- 5 atributos

CREATE TABLE person."preferenciaCliente"(
    id_preferencia_cliente BIGSERIAL NOT NULL,
    id_cliente INTEGER NOT NULL,
    id_producto INTEGER NOT NULL,
    producto_cantidad INTEGER NOT NULL DEFAULT 0,
    producto_cantidad_unidades INTEGER NOT NULL DEFAULT 0,
    preferencia_fecha_ingreso TIMESTAMP NOT NULL DEFAULT now(),
    preferencia_activa BOOLEAN NOT NULL DEFAULT 'true',
    CONSTRAINT preferencia_cliente_pk PRIMARY KEY("id_preferencia_cliente")
) WITH (OIDS = FALSE);
-- 7 atributos

CREATE TABLE person."productoRecomendado"(
    id_producto_recomendado BIGSERIAL NOT NULL,
    id_farmaceutico INTEGER NOT NULL,
    nombre_producto character varying(25) NOT NULL,
    descripcion_producto TEXT NOT NULL DEFAULT '',
    recomendado_fecha_ingreso TIMESTAMP NOT NULL DEFAULT now(),
    producto_recomendado_activo BOOLEAN NOT NULL DEFAULT 'true',
    CONSTRAINT producto_recomendado_pk PRIMARY KEY("id_producto_recomendado")
) WITH (OIDS = FALSE);
-- 6 atributos

CREATE TABLE person."farmaceuticoBloqueado"(
    id_farmac_bloqueado BIGSERIAL NOT NULL,
    id_farmaceutico INTEGER NOT NULL,
    farmac_motivo_bloqueo TEXT NOT NULL DEFAULT '',
    farmac_fecha_bloqueo TIMESTAMP NOT NULL DEFAULT now(),
    farmac_bloqueo_activo BOOLEAN NOT NULL DEFAULT 'true',
    CONSTRAINT farmaceutico_bloqueado_pk PRIMARY KEY("id_farmac_bloqueado")
) WITH (OIDS = FALSE);
-- 5 atributos

CREATE TABLE person."usuarioBloqueado"(
    id_usuario_bloqueado BIGSERIAL NOT NULL,
    id_usuario INTEGER NOT NULL,
    usuario_motivo_bloqueo TEXT NOT NULL DEFAULT '',
    usuario_fecha_bloqueo TIMESTAMP NOT NULL DEFAULT now(),
    usuario_bloqueo_activo BOOLEAN NOT NULL,
    CONSTRAINT usuario_bloqueado_pk PRIMARY KEY("id_usuario_bloqueado")
) WITH (OIDS = FALSE);
-- 5 atributos

CREATE TABLE person."facturaBloqueada"(
    id_factura_bloqueada BIGSERIAL NOT NULL,
    id_factura INTEGER NOT NULL,
    factura_motivo_bloqueo TEXT NOT NULL DEFAULT '',
    factura_fecha_bloqueo TIMESTAMP NOT NULL DEFAULT now(),
    factura_bloqueada_activa BOOLEAN NOT NULL DEFAULT 'true',
    CONSTRAINT factura_bloqueada_pk PRIMARY KEY("id_factura_bloqueada")
) WITH (OIDS = FALSE);
-- 5 atributos

CREATE TABLE person."historialFactura"(
    id_historial_factura BIGSERIAL NOT NULL,
    id_factura INTEGER NOT NULL,
    id_farmaceutico INTEGER NOT NULL,
    historial_factura_fecha TIMESTAMP NOT NULL DEFAULT now(),
    historial_factura_activo BOOLEAN NOT NULL DEFAULT 'true',
    CONSTRAINT historial_factura_pk PRIMARY KEY("id_historial_factura")
) WITH (OIDS = FALSE);
-- 5 atributos

CREATE TABLE person."clienteBloqueado"(
    id_cliente_bloqueado BIGSERIAL NOT NULL,
    id_cliente INTEGER NOT NULL,
    cliente_bloqueado_motivo TEXT NOT NULL DEFAULT '',
    cliente_fecha_bloqueado TIMESTAMP NOT NULL DEFAULT now(),
    cliente_bloqueado_activo BOOLEAN NOT NULL DEFAULT 'true',
    CONSTRAINT cliente_bloqueado_pk PRIMARY KEY("id_cliente_bloqueado")
) WITH (OIDS = FALSE);
-- 5 atributos

CREATE TABLE person."historialUsuario"(
    id_historial_usuario BIGSERIAL NOT NULL,
    id_usuario INTEGER NOT NULL,
    historial_usuario_fecha TIMESTAMP NOT NULL DEFAULT now(),
    historial_usuario_activo BOOLEAN NOT NULL DEFAULT 'true',
    CONSTRAINT historial_usuario_pk PRIMARY KEY("id_historial_usuario")
) WITH (OIDS = FALSE);
-- 4 atributos