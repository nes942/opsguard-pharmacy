# Modulo `common`

## Que Debe Contener

Este modulo debe contener elementos reutilizables y transversales:

- DTOs comunes de respuesta si se necesitan.
- Excepciones base.
- Manejo global de errores cuando se implemente.
- Utilidades pequenas que realmente sean compartidas.

## Que NO Debe Contener

- Clases de negocio especificas de productos, categorias, usuarios o inventario.
- Servicios genericos innecesarios.
- Logica que solo se use en un modulo.
- Abstracciones complejas prematuras.

## Que Se Implementara Despues

- Estructura de respuesta de error.
- `GlobalExceptionHandler`.
- Excepciones base como recurso no encontrado.
- Mensajes consistentes para errores REST.

## Preguntas de Defensa Tecnica

- Que significa que una clase sea transversal?
- Cuando algo deberia ir en `common` y cuando deberia quedarse en su modulo?
- Por que no conviene llenar `common` de utilidades desde el inicio?
- Como ayudaria `common` al manejo global de errores?
- Que riesgo tiene crear abstracciones demasiado pronto?

