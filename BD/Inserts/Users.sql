
INSERT INTO person."tipoPersona"( tipo_nombre, tipo_persona_activo)
VALUES( 'Farmaceutico', true);

INSERT INTO person."tipoPersona"( tipo_nombre, tipo_persona_activo)
VALUES( 'Cliente', true);

INSERT INTO person."persona"( id_tipo_persona, persona_identificacion,
persona_nombres, persona_apellidos, persona_edad, persona_celular, persona_telefono,
persona_sexo, persona_direccion, persona_correo, persona_fecha_registro, persona_activa)
VALUES( 1, '0104472014', 'Juan Antonio', 'Delgado Torres', 25, 0985241520, 2400847, 'M',
'Baños', 'juan25@gmail.com', now(), true);

INSERT INTO person."farmaceutico"( id_persona, num_dias_laborables, horario_entrada,
horario_salida, farmaceutico_sueldo, farmaceutico_fecha_registro, farmaceutico_activo)
VALUES( 1, 5, '10:00', '20:00', 450.00, now(), true);

INSERT INTO person."usuario"( id_persona, usuario_nombre, usuario_contrasena,
usuario_tipo, usuario_activo)
VALUES( 1, 'juan94', '12345', 'F', true);
