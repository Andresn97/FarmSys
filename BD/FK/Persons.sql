
ALTER TABLE person."persona" 
ADD CONSTRAINT "id_tipo_persona" 
FOREIGN KEY ("id_tipo_persona") 
REFERENCES person."tipoPersona" ("id_tipo_persona") 
ON UPDATE CASCADE ON DELETE CASCADE;

ALTER TABLE person."cliente" 
ADD CONSTRAINT id_persona_cliente 
FOREIGN KEY (id_persona)
REFERENCES person."persona" (id_persona)
ON UPDATE CASCADE ON DELETE CASCADE;

ALTER TABLE person."farmaceutico" 
ADD CONSTRAINT id_persona_farmaceutico 
FOREIGN KEY (id_persona)
REFERENCES person."persona" (id_persona)
ON UPDATE CASCADE ON DELETE CASCADE;

ALTER TABLE person."usuario" 
ADD CONSTRAINT id_persona_usuario 
FOREIGN KEY (id_persona)
REFERENCES person."persona" (id_persona)
ON UPDATE CASCADE ON DELETE CASCADE;

ALTER TABLE person."personaRol" 
ADD CONSTRAINT id_persona_rol 
FOREIGN KEY (id_persona)
REFERENCES person."persona" (id_persona)
ON UPDATE CASCADE ON DELETE CASCADE;

ALTER TABLE person."personaRol" 
ADD CONSTRAINT id_rol_persona 
FOREIGN KEY (id_rol)
REFERENCES person."rol" (id_rol)
ON UPDATE CASCADE ON DELETE CASCADE;

ALTER TABLE person."factura" 
ADD CONSTRAINT id_farmaceutico_factura 
FOREIGN KEY (id_farmaceutico)
REFERENCES person."farmaceutico" (id_farmaceutico)
ON UPDATE CASCADE ON DELETE CASCADE;

ALTER TABLE person."detalleFactura" 
ADD CONSTRAINT id_factura_detalle 
FOREIGN KEY (id_factura)
REFERENCES person."factura" (id_factura)
ON UPDATE CASCADE ON DELETE CASCADE;

ALTER TABLE person."detalleFactura" 
ADD CONSTRAINT id_producto_detalle 
FOREIGN KEY (id_producto)
REFERENCES product."producto" (id_producto)
ON UPDATE CASCADE ON DELETE CASCADE;

ALTER TABLE person."facturaCliente" 
ADD CONSTRAINT id_cliente_factura 
FOREIGN KEY (id_cliente)
REFERENCES person."cliente" (id_cliente)
ON UPDATE CASCADE ON DELETE CASCADE;

ALTER TABLE person."facturaCliente" 
ADD CONSTRAINT id_factura_cliente 
FOREIGN KEY (id_factura)
REFERENCES person."factura" (id_factura)
ON UPDATE CASCADE ON DELETE CASCADE;

ALTER TABLE person."preferenciaCliente" 
ADD CONSTRAINT id_cliente_preferencia 
FOREIGN KEY (id_cliente)
REFERENCES person."cliente" (id_cliente)
ON UPDATE CASCADE ON DELETE CASCADE;

ALTER TABLE person."preferenciaCliente" 
ADD CONSTRAINT id_producto_preferencia 
FOREIGN KEY (id_producto)
REFERENCES product."producto" (id_producto)
ON UPDATE CASCADE ON DELETE CASCADE;

ALTER TABLE person."productoRecomendado" 
ADD CONSTRAINT id_farmaceutico_recomendado 
FOREIGN KEY (id_farmaceutico)
REFERENCES person."farmaceutico" (id_farmaceutico)
ON UPDATE CASCADE ON DELETE CASCADE;

ALTER TABLE person."farmaceuticoBloqueado" 
ADD CONSTRAINT id_farmaceutico_bloqueado 
FOREIGN KEY (id_farmaceutico)
REFERENCES person."farmaceutico" (id_farmaceutico)
ON UPDATE CASCADE ON DELETE CASCADE;

ALTER TABLE person."usuarioBloqueado" 
ADD CONSTRAINT id_usuario_bloqueado 
FOREIGN KEY (id_usuario)
REFERENCES person."usuario" (id_usuario)
ON UPDATE CASCADE ON DELETE CASCADE;

ALTER TABLE person."facturaBloqueada" 
ADD CONSTRAINT id_factura_bloqueada 
FOREIGN KEY (id_factura)
REFERENCES person."factura" (id_factura)
ON UPDATE CASCADE ON DELETE CASCADE;

ALTER TABLE person."historialFactura" 
ADD CONSTRAINT id_factura_historial 
FOREIGN KEY (id_factura)
REFERENCES person."factura" (id_factura)
ON UPDATE CASCADE ON DELETE CASCADE;

ALTER TABLE person."historialFactura" 
ADD CONSTRAINT id_historial_farmac 
FOREIGN KEY (id_farmaceutico)
REFERENCES person."farmaceutico" (id_farmaceutico)
ON UPDATE CASCADE ON DELETE CASCADE;

ALTER TABLE person."clienteBloqueado" 
ADD CONSTRAINT id_cliente_bloqueado 
FOREIGN KEY (id_cliente)
REFERENCES person."cliente" (id_cliente)
ON UPDATE CASCADE ON DELETE CASCADE;

ALTER TABLE person."historialUsuario" 
ADD CONSTRAINT id_usuario_historial 
FOREIGN KEY (id_usuario)
REFERENCES person."usuario" (id_usuario)
ON UPDATE CASCADE ON DELETE CASCADE;

ALTER TABLE person."usuario" 
ADD CONSTRAINT id_rol_usuario 
FOREIGN KEY (id_rol)
REFERENCES person."rol" (id_rol)
ON UPDATE CASCADE ON DELETE CASCADE;

ALTER TABLE person."factura" 
ADD CONSTRAINT id_sucursal_factura
FOREIGN KEY (id_sucursal)
REFERENCES product."sucursal" (id_sucursal)
ON UPDATE CASCADE ON DELETE CASCADE;