# Modulo `product`

## Que Debe Contener

Este módulo debe contener todo lo relacionado con productos de farmacia:

- Entidad `Product`.
- Repositorio JPA de productos.
- Servicio con reglas de negocio de productos.
- Controlador REST de productos.
- DTOs de entrada y salida.
- Mapper entre entidad y DTO.
- Excepciones específicas de productos si son necesarias.

## Que NO Debe Contener

- Logica de categorias que pertenezca al modulo `category`.
- Logica de usuarios o autenticacion.
- Configuracion global de Spring.
- Reglas completas de inventario.
- Codigo de frontend.

## Que Se Implementara Despues

- CRUD de productos.
- Validaciones con Bean Validation.
- Relacion `Product` N:1 con `Category`.
- Busqueda por nombre o estado en una etapa posterior.
- Reglas basicas para evitar productos duplicados.

## Preguntas de Defensa Tecnica

- Por que `Product` esta separado de `Category`?
- Por que el controlador no deberia hablar directamente con el repositorio?
- Que diferencia hay entre `Product` entity y `ProductRequest` o `ProductResponse` DTO?
- Donde validarias que un producto no tenga precio negativo?
- Como representarias la relacion entre producto y categoria en JPA?

