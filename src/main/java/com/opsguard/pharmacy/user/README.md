# Modulo `user`

## Que Debe Contener

Este modulo debe contener usuarios del sistema:

- Entidad `User`.
- Entidad o relacion con `Role`.
- Repositorio JPA de usuarios.
- Servicio de usuarios.
- Controlador REST si se necesita administracion de usuarios.
- DTOs de usuario.
- Mapper entre entidad y DTO.
- Excepciones especificas de usuarios.

## Que NO Debe Contener

- Implementacion de JWT.
- Configuracion de Spring Security.
- Logica de login.
- Reglas de inventario.
- Codigo de frontend.

## Que Se Implementara Despues

- Modelo basico de usuarios.
- Relacion N:M con roles.
- Asociacion de usuarios con movimientos de inventario.
- Operaciones administrativas basicas en una etapa posterior.

## Preguntas de Defensa Tecnica

- Por que `User` no deberia exponer password en un DTO de respuesta?
- Como modelarias la relacion usuario-roles?
- Que diferencia hay entre usuario del dominio y credenciales de login?
- Por que autenticacion vive en `auth` y no directamente aqui?
- Que datos de usuario son sensibles?

