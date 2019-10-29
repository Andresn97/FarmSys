
ALTER TABLE product."producto" 
ADD CONSTRAINT id_marca_producto 
FOREIGN KEY (id_marca)
REFERENCES product."marca" (id_marca)
ON UPDATE CASCADE ON DELETE CASCADE;

ALTER TABLE product."preferenciaNoRegistrado" 
ADD CONSTRAINT id_producto_no_registrado 
FOREIGN KEY (id_producto)
REFERENCES product."producto" (id_producto)
ON UPDATE CASCADE ON DELETE CASCADE;

ALTER TABLE product."preferenciaNoRegistrado" 
ADD CONSTRAINT id_cliente_no_registrado_prefencia 
FOREIGN KEY (id_cliente_no_registrado)
REFERENCES product."clienteNoRegistrado" (id_cliente_no_registrado)
ON UPDATE CASCADE ON DELETE CASCADE;

ALTER TABLE product."inventario" 
ADD CONSTRAINT id_producto_inventario 
FOREIGN KEY (id_producto)
REFERENCES product."producto" (id_producto)
ON UPDATE CASCADE ON DELETE CASCADE;

ALTER TABLE product."usoProducto" 
ADD CONSTRAINT id_producto_uso 
FOREIGN KEY (id_producto)
REFERENCES product."producto" (id_producto)
ON UPDATE CASCADE ON DELETE CASCADE;

ALTER TABLE product."imagenProducto" 
ADD CONSTRAINT id_producto_imagen 
FOREIGN KEY (id_producto)
REFERENCES product."producto" (id_producto)
ON UPDATE CASCADE ON DELETE CASCADE;

ALTER TABLE product."productoCategoria" 
ADD CONSTRAINT id_producto_categoria 
FOREIGN KEY (id_producto)
REFERENCES product."producto" (id_producto)
ON UPDATE CASCADE ON DELETE CASCADE;

ALTER TABLE product."productoCategoria" 
ADD CONSTRAINT id_categoria_producto 
FOREIGN KEY (id_categoria)
REFERENCES product."categoria" (id_categoria)
ON UPDATE CASCADE ON DELETE CASCADE;

ALTER TABLE product."historialProducto" 
ADD CONSTRAINT id_producto_historial 
FOREIGN KEY (id_producto)
REFERENCES product."producto" (id_producto)
ON UPDATE CASCADE ON DELETE CASCADE;

ALTER TABLE product."imagenBloqueada" 
ADD CONSTRAINT id_imagen_bloqueada 
FOREIGN KEY (id_imagen_producto)
REFERENCES product."imagenProducto" (id_imagen_producto)
ON UPDATE CASCADE ON DELETE CASCADE;
