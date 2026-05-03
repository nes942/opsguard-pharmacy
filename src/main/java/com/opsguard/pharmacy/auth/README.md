# Modulo `auth`

## Que Debe Contener

Este modulo debe contener la funcionalidad de autenticacion cuando llegue su entregable:

- DTOs de login y registro si aplican.
- Servicios de autenticacion.
- Controladores de autenticacion.
- Excepciones relacionadas con credenciales.

## Que NO Debe Contener

- JWT por ahora.
- Spring Security por ahora.
- Reglas de negocio de productos.
- Reglas de inventario.
- Persistencia propia que duplique al modulo `user`.

## Que Se Implementara Despues

- Flujo de login.
- Registro o alta controlada de usuarios, si aplica.
- Integracion con Spring Security.
- Generacion de tokens JWT en una etapa futura.

## Preguntas de Defensa Tecnica

- Por que no conviene implementar JWT antes de tener el dominio basico?
- Que responsabilidad deberia tener un servicio de autenticacion?
- Que datos deberia recibir un endpoint de login?
- Por que autenticacion no debe mezclarse con el CRUD de productos?
- Que riesgos existen al manejar passwords?

