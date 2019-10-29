

CREATE TABLE public."persona"(
    id_persona BIGSERIAL NOT NULL,
    id_tipo_persona INTEGER NOT NULL,
    persona_identificacion character varying(15),
    persona_nombres character varying(100) NOT NULL,
    persona_apellidos character varying(100) NOT NULL,
    persona_edad INTEGER NOT NULL,
    persona_celular INTEGER NOT NULL,
    persona_telefono INTEGER,
    persona_sexo character varying(20) NOT NULL,
    persona_direccion character varying(50) NOT NULL,
    persona_correo character varying(50),
    persona_fecha_registro TIMESTAMP NOT NULL now(),
    persona_activa BOOLEAN NOT NULL DEFAULT 'true',
    CONSTRAINT persona_pk PRIMARY KEY("id_persona"),
    CONSTRAINT id_tipo_persona FOREIGN KEY (id_tipo_persona)
        REFERENCES public."tipoPersona" (id_tipo_persona) MATCH SIMPLE
        ON UPDATE CASCADE
        ON DELETE CASCADE  
) WITH (OIDS = FALSE);
-- 13 atributos

CREATE TABLE public."tipoPersona"(
    id_tipo_persona BIGSERIAL NOT NULL,
    tipo_nombre character varying(100) NOT NULL,
    tipo_persona_activo BOOLEAN NOT NULL DEFAULT 'true',
    CONSTRAINT tipo_persona_pk PRIMARY KEY("id_tipo_persona")
) WITH (OIDS = FALSE);
-- 3 atributos

CREATE TABLE public."cliente"(
    id_cliente BIGSERIAL NOT NULL,
    id_persona INTEGER NOT NULL,
    cliente_fecha_registro TIMESTAMP NOT NULL DEFAULT now(),
    cliente_activo BOOLEAN NOT NULL DEFAULT 'true',
    CONSTRAINT cliente_pk PRIMARY KEY("id_cliente"),
    CONSTRAINT id_persona_cliente FOREIGN KEY (id_persona)
        REFERENCES public."persona" (id_persona) MATCH SIMPLE
        ON UPDATE CASCADE
        ON DELETE CASCADE  
)
-- 4 atributos

CREATE TABLE public."farmaceutico"(
    id_farmaceutico BIGSERIAL NOT NULL,
    id_persona INTEGER NOT NULL,
    num_dias_laborables INTEGER NOT NULL DEFAULT 0,
    horario_entrada character varying(10) NOT NULL,
    horario_salida  character varying(10) NOT NULL,
    farmaceutico_sueldo NUMERIC(6, 2) DEFAULT 0,
    farmaceutico_fecha_registro TIMESTAMP NOT NULL DEFAULT now(),
    farmaceutico_activo BOOLEAN NOT NULL DEFAULT 'true',
    CONSTRAINT farmaceutico_pk PRIMARY KEY("id_farmaceutico"),
    CONSTRAINT id_persona_farmaceutico FOREIGN KEY (id_persona)
        REFERENCES public."persona" (id_persona) MATCH SIMPLE
        ON UPDATE CASCADE
        ON DELETE CASCADE  
)
-- 8 atributos

CREATE TABLE public."usuario"(
    id_usuario BIGSERIAL NOT NULL,
    id_persona INTEGER NOT NULL,
    usuario_nombre character varying(15) NOT NULL,
    usuario_contrasena character varying(20) NOT NULL,
    usuario_tipo character varying(1) NOT NULL DEFAULT 'F',
    usuario_activo BOOLEAN NOT NULL DEFAULT 'true',
    CONSTRAINT usuario_pk PRIMARY KEY("id_usuario"),
    CONSTRAINT id_persona_usuario FOREIGN KEY (id_persona)
        REFERENCES public."persona" (id_persona) MATCH SIMPLE
        ON UPDATE CASCADE
        ON DELETE CASCADE
)

CREATE TABLE public."clienteNoRegistrado"(
    id_cliente_no_registrado BIGSERIAL NOT NULL,
    cliente_no_registrado_referencia character varying(25) NOT NULL,
    cliente_no_registrado_fecha TIMESTAMP NOT NULL DEFAULT now(),
    cliente_no_registrado_activo BOOLEAN NOT NULL DEFAULT 'true',
    CONSTRAINT cliente_no_registrado_pk PRIMARY KEY("id_cliente_no_registrado")
)
-- 4 atributos

CREATE TABLE public."rol"(
    id_rol BIGSERIAL NOT NULL,
    rol_nombre character varying(15) NOT NULL,
    rol_activo BOOLEAN NOT NULL DEFAULT 'true',
    CONSTRAINT rol_pk PRIMARY KEY("id_rol")
)
-- 3 atributos

CREATE TABLE public."personaRol"(
    id_persona_rol BIGSERIAL NOT NULL,
    id_persona INTEGER NOT NULL,
    id_rol INTEGER NOT NULL,
    persona_rol_activo BOOLEAN NOT NULL,
    CONSTRAINT persona_rol_pk PRIMARY KEY("id_persona_rol"),
    CONSTRAINT id_persona_rol FOREIGN KEY (id_persona)
        REFERENCES public."persona" (id_persona) MATCH SIMPLE
        ON UPDATE CASCADE
        ON DELETE CASCADE,
    CONSTRAINT id_rol_persona FOREIGN KEY (id_rol)
        REFERENCES public."rol" (id_rol) MATCH SIMPLE
        ON UPDATE CASCADE
        ON DELETE CASCADE
)
-- 4 atributos

CREATE TABLE public."preferenciaNoRegistrado"(
    id_no_registrado_preferencia BIGSERIAL NOT NULL,
    id_producto INTEGER NOT NULL,
    id_cliente_no_registrado INTEGER NOT NULL,
    producto_cantidad INTEGER NOT NULL DEFAULT 0,
    producto_cantidad_unidades INTEGER NOT NULL DEFAULT 0,
    fecha_registro TIMESTAMP NOT NULL now(),
    no_registrado_preferencia_activo BOOLEAN NOT NULL DEFAULT 'true',
    CONSTRAINT no_registrado_preferencia_pk PRIMARY KEY("id_no_registrado_preferencia"),
    CONSTRAINT id_producto_no_registrado FOREIGN KEY (id_producto)
        REFERENCES public."producto" (id_producto) MATCH SIMPLE
        ON UPDATE CASCADE
        ON DELETE CASCADE,
    CONSTRAINT id_cliente_no_registrado_prefencia FOREIGN KEY (id_cliente_no_registrado)
        REFERENCES public."clienteNoRegistrado" (id_cliente_no_registrado) MATCH SIMPLE
        ON UPDATE CASCADE
        ON DELETE CASCADE
)
-- 7 atributos

CREATE TABLE public."producto"(
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
    CONSTRAINT producto_pk PRIMARY KEY("id_producto"),
    CONSTRAINT id_marca_producto FOREIGN KEY (id_marca)
        REFERENCES public."marca" (id_marca) MATCH SIMPLE
        ON UPDATE CASCADE
        ON DELETE CASCADE
)
-- 11 atributos

CREATE TABLE public."factura"(
    id_factura BIGSERIAL NOT NULL,
    id_farmaceutico INTEGER NOT NULL,
    factura_cantidad_unidades INTEGER DEFAULT 0,
    factura_cantidad INTEGER NOT NULL DEFAULT 0,
    factura_subtotal NUMERIC(7,2) DEFAULT 0,
    factura_iva NUMERIC(3,2) DEFAULT 12,
    factura_fecha_ingreso TIMESTAMP DEFAULT now(),
    factura_total NUMERIC(9,5) DEFAULT 0,
    factura_tiene_cliente BOOLEAN NOT NULL DEFAULT 'false',
    factura_activa  BOOLEAN DEFAULT 'true',
    CONSTRAINT factura_pk PRIMARY KEY("id_factura"),
    CONSTRAINT id_farmaceutico_factura FOREIGN KEY (id_farmaceutico)
        REFERENCES public."farmaceutico" (id_farmaceutico) MATCH SIMPLE
        ON UPDATE CASCADE
        ON DELETE CASCADE  
)
-- 11 atributos

CREATE TABLE public."detalleFactura"(
    id_detalle_factura BIGSERIAL NOT NULL,
    id_factura INTEGER NOT NULL,
    id_producto INTEGER NOT NULL,
    cantidad_producto INTEGER NOT NULL DEFAULT 0,
    cantidad_unidades INTEGER NOT NULL DEFAULT 0,
    total_detalle_factura NUMERIC(5,2) DEFAULT 0,
    detalle_factura_activo BOOLEAN DEFAULT 'true',
    CONSTRAINT detalle_factura_pk PRIMARY KEY("id_detalle_factura"),
    CONSTRAINT id_factura_detalle FOREIGN KEY (id_factura)
        REFERENCES public."factura" (id_factura) MATCH SIMPLE
        ON UPDATE CASCADE
        ON DELETE CASCADE,
    CONSTRAINT id_producto_detalle FOREIGN KEY (id_producto)
        REFERENCES public."producto" (id_producto) MATCH SIMPLE
        ON UPDATE CASCADE
        ON DELETE CASCADE
)
-- 7 atributos

CREATE TABLE public."facturaCliente"(
    id_factura_cliente BIGSERIAL NOT NULL,
    id_cliente INTEGER NOT NULL,
    id_factura INTEGER NOT NULL,
    factura_cliente_fecha TIMESTAMP NOT NULL DEFAULT now(),
    factura_cliente_activo BOOLEAN NOT NULL DEFAULT 'true',
    CONSTRAINT factura_cliente_pk PRIMARY KEY("id_factura_cliente"),
    CONSTRAINT id_cliente_factura FOREIGN KEY (id_cliente)
        REFERENCES public."cliente" (id_cliente) MATCH SIMPLE
        ON UPDATE CASCADE
        ON DELETE CASCADE,
    CONSTRAINT id_factura_cliente FOREIGN KEY (id_factura)
        REFERENCES public."factura" (id_factura) MATCH SIMPLE
        ON UPDATE CASCADE
        ON DELETE CASCADE
)
-- 5 atributos

CREATE TABLE public."marca"(
    id_marca BIGSERIAL NOT NULL,
    marca_nombre character varying(20) NOT NULL,
    marca_pais_origen character varying(15),
    marca_sitio_web character varying(35),
    marca_activa BOOLEAN DEFAULT 'true',
    CONSTRAINT marca_pk PRIMARY KEY("id_marca")
)
-- 5 atributos

CREATE TABLE public."inventario"(
    id_inventario BIGSERIAL NOT NULL,
    id_producto INTEGER NOT NULL,
    producto_stock INTEGER NOT NULL DEFAULT 0,
    producto_costo NUMERIC(5,2) DEFAULT 0,
    fecha_ingreso TIMESTAMP NOT NULL DEFAULT now(),
    fecha_caducidad TIMESTAMP,
    total_costo NUMERIC(5.2) DEFAULT 0,
    inventario_activo BOOLEAN DEFAULT 'true',
    CONSTRAINT inventario_pk PRIMARY KEY("id_inventario"),
    CONSTRAINT id_producto_inventario FOREIGN KEY (id_producto)
        REFERENCES public."producto" (id_producto) MATCH SIMPLE
        ON UPDATE CASCADE
        ON DELETE CASCADE
)
-- 8 atributos

CREATE TABLE public."preferenciaCliente"(
    id_preferencia_cliente BIGSERIAL NOT NULL,
    id_cliente INTEGER NOT NULL,
    id_producto INTEGER NOT NULL,
    producto_cantidad INTEGER NOT NULL DEFAULT 0,
    producto_cantidad_unidades INTEGER NOT NULL DEFAULT 0,
    preferencia_fecha_ingreso TIMESTAMP NOT NULL DEFAULT now(),
    preferencia_activa BOOLEAN NOT NULL DEFAULT 'true',
    CONSTRAINT preferencia_cliente_pk PRIMARY KEY("id_preferencia_cliente"),
    CONSTRAINT id_cliente_preferencia FOREIGN KEY (id_cliente)
        REFERENCES public."cliente" (id_cliente) MATCH SIMPLE
        ON UPDATE CASCADE
        ON DELETE CASCADE,
    CONSTRAINT id_producto_preferencia FOREIGN KEY (id_producto)
        REFERENCES public."producto" (id_producto) MATCH SIMPLE
        ON UPDATE CASCADE
        ON DELETE CASCADE
)
-- 7 atributos

CREATE TABLE public."usoProducto"(
    id_uso_producto BIGSERIAL NOT NULL,
    id_producto INTEGER NOT NULL,
    uso_nombre character varying(80) NOT NULL,
    uso_producto_activo BOOLEAN NOT NULL DEFAULT 'true',
    CONSTRAINT uso_producto_pk PRIMARY KEY("id_uso_producto"),
    CONSTRAINT id_producto_uso FOREIGN KEY (id_producto)
        REFERENCES public."producto" (id_producto) MATCH SIMPLE
        ON UPDATE CASCADE
        ON DELETE CASCADE
)
-- 4 atributos

CREATE TABLE public."imagenProducto"(
    id_imagen_producto BIGSERIAL NOT NULL,
    id_producto INTEGER NOT NULL,
    imagen_direccion character varying(100) NOT NULL,
    imagen_principal BOOLEAN NOT NULL DEFAULT 'false',
    imagen_activa BOOLEAN DEFAULT 'true',
    CONSTRAINT imagen_producto_pk PRIMARY KEY("id_imagen_producto"),
    CONSTRAINT id_producto_imagen FOREIGN KEY (id_producto)
        REFERENCES public."producto" (id_producto) MATCH SIMPLE
        ON UPDATE CASCADE
        ON DELETE CASCADE
)
-- 5 atributos

-- CREATE TABLE public."calificacion_producto"(
--     id_calificacion_producto BIGSERIAL NOT NULL,
--     id_producto INTEGER NOT NULL,
--     calificacion_valor INTEGER NOT NULL,
--     calificacion_activa BOOLEAN NOT NULL DEFAULT 'true',
--     CONSTRAINT calificacion_producto_pk PRIMARY KEY("id_calificacion_producto"),
--     CONSTRAINT id_producto FOREIGN KEY (id_producto)
--         REFERENCES public."producto" (id_producto) MATCH SIMPLE
--         ON UPDATE CASCADE
--         ON DELETE CASCADE
-- )

CREATE TABLE public."categoria"(
    id_categoria BIGSERIAL NOT NULL,
    categoria_nombre character varying(50) NOT NULL,
    categoria_activa BOOLEAN NOT NULL DEFAULT 'true',
    CONSTRAINT categoria_pk PRIMARY KEY("id_categoria")
)
-- 3 atributos

CREATE TABLE public."productoCategoria"(
    id_producto_categoria BIGSERIAL NOT NULL,
    id_producto INTEGER NOT NULL,
    id_categoria INTEGER NOT NULL,
    producto_categoria_fecha TIMESTAMP NOT NULL DEFAULT now(),
    producto_categoria_activo BOOLEAN NOT NULL DEFAULT 'true',
    CONSTRAINT producto_categoria_pk PRIMARY KEY("id_producto_categoria"),
    CONSTRAINT id_producto_categoria FOREIGN KEY (id_producto)
        REFERENCES public."producto" (id_producto) MATCH SIMPLE
        ON UPDATE CASCADE
        ON DELETE CASCADE,
    CONSTRAINT id_categoria_producto FOREIGN KEY (id_categoria)
        REFERENCES public."categoria" (id_categoria) MATCH SIMPLE
        ON UPDATE CASCADE
        ON DELETE CASCADE
)
-- 4 atributos

CREATE TABLE public."productoRecomendado"(
    id_producto_recomendado BIGSERIAL NOT NULL,
    id_farmaceutico INTEGER NOT NULL,
    nombre_producto character varying(25) NOT NULL,
    descripcion_producto TEXT NOT NULL DEFAULT '',
    recomendado_fecha_ingreso TIMESTAMP NOT NULL now(),
    producto_recomendado_activo BOOLEAN NOT NULL DEFAULT 'true',
    CONSTRAINT producto_recomendado_pk PRIMARY KEY("id_producto_recomendado"),
    CONSTRAINT id_farmaceutico_recomendado FOREIGN KEY (id_farmaceutico)
        REFERENCES public."farmaceutico" (id_farmaceutico) MATCH SIMPLE
        ON UPDATE CASCADE
        ON DELETE CASCADE
)
-- 6 atributos

CREATE TABLE public."farmaceuticoBloqueado"(
    id_farmac_bloqueado BIGSERIAL NOT NULL,
    id_farmaceutico INTEGER NOT NULL,
    farmac_motivo_bloqueo TEXT NOT NULL DEFAULT '',
    farmac_fecha_bloqueo TIMESTAMP NOT NULL DEFAULT now(),
    farmac_bloqueo_activo BOOLEAN NOT NULL DEFAULT 'true',
    CONSTRAINT farmaceutico_bloqueado_pk PRIMARY KEY("id_farmac_bloqueado"),
    CONSTRAINT id_farmaceutico_bloqueado FOREIGN KEY (id_farmaceutico)
        REFERENCES public."farmaceutico" (id_farmaceutico) MATCH SIMPLE
        ON UPDATE CASCADE
        ON DELETE CASCADE
)
-- 5 atributos

CREATE TABLE public."usuarioBloqueado"(
    id_usuario_bloqueado BIGSERIAL NOT NULL,
    id_usuario INTEGER NOT NULL,
    usuario_motivo_bloqueo TEXT NOT NULL DEFAULT '',
    usuario_fecha_bloqueo TIMESTAMP NOT NULL DEFAULT now(),
    usuario_bloqueo_activo BOOLEAN NOT NULL,
    CONSTRAINT usuario_bloqueado_pk PRIMARY KEY("id_usuario_bloqueado"),
    CONSTRAINT id_usuario_bloqueado FOREIGN KEY (id_usuario)
        REFERENCES public."usuario" (id_usuario) MATCH SIMPLE
        ON UPDATE CASCADE
        ON DELETE CASCADE
)
-- 5 atributos

CREATE TABLE public."facturaBloqueada"(
    id_factura_bloqueada BIGSERIAL NOT NULL,
    id_factura INTEGER NOT NULL,
    factura_motivo_bloqueo TEXT NOT NULL DEFAULT '',
    factura_fecha_bloqueo TIMESTAMP NOT NULL DEFAULT now(),
    factura_bloqueada_activa BOOLEAN NOT NULL DEFAULT 'true',
    CONSTRAINT factura_bloqueada_pk PRIMARY KEY("id_factura_bloqueada"),
    CONSTRAINT id_factura_bloqueada FOREIGN KEY (id_factura)
        REFERENCES public."factura" (id_factura) MATCH SIMPLE
        ON UPDATE CASCADE
        ON DELETE CASCADE
)
-- 5 atributos

CREATE TABLE public."historialProducto"(
    id_historial_producto BIGSERIAL NOT NULL,
    id_producto INTEGER NOT NULL,
    historial_producto_fecha TIMESTAMP NOT NULL DEFAULT now(),
    historial_producto_activo BOOLEAN NOT NULL DEFAULT 'true',
    CONSTRAINT historial_producto_pk PRIMARY KEY("id_historial_producto"),
    CONSTRAINT id_producto_historial FOREIGN KEY (id_producto)
        REFERENCES public."producto" (id_producto) MATCH SIMPLE
        ON UPDATE CASCADE
        ON DELETE CASCADE
)
-- 4 atributos

CREATE TABLE public."imagenBloqueada"(
    id_imagen_bloqueada BIGSERIAL NOT NULL,
    id_imagen_producto INTEGER NOT NULL,
    imagen_bloqueada_motivo TEXT NOT NULL DEFAULT '',
    imagen_fecha_bloqueo TIMESTAMP NOT NULL DEFAULT now(),
    imagen_bloqueada_activa BOOLEAN NOT NULL DEFAULT 'true',
    CONSTRAINT imagen_bloqueada_pk PRIMARY KEY("id_imagen_bloqueada"),
    CONSTRAINT id_imagen_bloqueada FOREIGN KEY (id_imagen_producto)
        REFERENCES public."imagenProducto" (id_imagen_producto) MATCH SIMPLE
        ON UPDATE CASCADE
        ON DELETE CASCADE
)
-- 5 atributos

CREATE TABLE public."historialFactura"(
    id_historial_factura BIGSERIAL NOT NULL,
    id_factura INTEGER NOT NULL,
    id_farmaceutico INTEGER NOT NULL,
    historial_factura_fecha TIMESTAMP NOT NULL DEFAULT now(),
    historial_factura_activo BOOLEAN NOT NULL DEFAULT 'true',
    CONSTRAINT historial_factura_pk PRIMARY KEY("id_historial_factura"),
    CONSTRAINT id_factura_historial FOREIGN KEY (id_factura)
        REFERENCES public."factura" (id_factura) MATCH SIMPLE
        ON UPDATE CASCADE
        ON DELETE CASCADE,
    CONSTRAINT id_historial_farmac FOREIGN KEY (id_farmaceutico)
        REFERENCES public."farmaceutico" (id_farmaceutico) MATCH SIMPLE
        ON UPDATE CASCADE
        ON DELETE CASCADE
)
-- 5 atributos

CREATE TABLE public."clienteBloqueado"(
    id_cliente_bloqueado BIGSERIAL NOT NULL,
    id_cliente INTEGER NOT NULL,
    cliente_bloqueado_motivo TEXT NOT NULL DEFAULT '',
    cliente_fecha_bloqueado TIMESTAMP NOT NULL DEFAULT now(),
    cliente_bloqueado_activo BOOLEAN NOT NULL DEFAULT 'true',
    CONSTRAINT cliente_bloqueado_pk PRIMARY KEY("id_cliente_bloqueado"),
    CONSTRAINT id_cliente_bloqueado FOREIGN KEY (id_cliente)
        REFERENCES public."cliente" (id_cliente) MATCH SIMPLE
        ON UPDATE CASCADE
        ON DELETE CASCADE
)
-- 5 atributos

CREATE TABLE public."historialUsuario"(
    id_historial_usuario BIGSERIAL NOT NULL,
    id_usuario INTEGER NOT NULL,
    historial_usuario_fecha TIMESTAMP NOT NULL DEFAULT now(),
    historial_usuario_activo BOOLEAN NOT NULL DEFAULT 'true',
    CONSTRAINT historial_usuario_pk PRIMARY KEY("id_historial_usuario"),
    CONSTRAINT id_usuario_historial FOREIGN KEY (id_usuario)
        REFERENCES public."usuario" (id_usuario) MATCH SIMPLE
        ON UPDATE CASCADE
        ON DELETE CASCADE
)
-- 4 atributos



