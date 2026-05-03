# Modulo `config`

## Que Debe Contener

Este modulo debe contener configuraciones explicitas de Spring cuando sean necesarias:

- Configuracion de CORS si aplica.
- Configuracion de beans compartidos.
- Configuracion futura de seguridad.
- Configuraciones tecnicas que no pertenezcan a un modulo de negocio.

## Que NO Debe Contener

- Controladores.
- Servicios de negocio.
- Entidades JPA.
- DTOs de producto, categoria, usuario o inventario.
- Configuracion innecesaria generada antes de tiempo.

## Que Se Implementara Despues

- Configuracion minima necesaria para la API.
- Configuracion de seguridad cuando se implemente Spring Security.
- Ajustes tecnicos documentados y justificables.

## Preguntas de Defensa Tecnica

- Por que separar configuracion de los modulos de negocio?
- Que tipo de clases deberian vivir aqui?
- Por que no se configura Spring Security todavia?
- Que configuracion podria necesitar una API REST?
- Como evitarias agregar configuracion que no entiendes?

