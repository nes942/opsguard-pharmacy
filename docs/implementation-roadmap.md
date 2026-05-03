# Roadmap de Implementacion

El proyecto se construira por entregables pequenos. Cada entregable debe dejar codigo entendible, probado manualmente con Postman y documentado.

## Entregable 1: CRUD de Categorias y Productos

### Objetivo

Implementar una API REST basica para administrar categorias y productos.

### Tareas

- Crear entidades `Category` y `Product`.
- Crear repositorios JPA para ambas entidades.
- Crear DTOs de request y response.
- Crear mappers simples entre entidad y DTO.
- Crear servicios con reglas de negocio basicas.
- Crear controladores REST.
- Agregar validaciones con Bean Validation.
- Agregar excepciones para recursos no encontrados.
- Agregar manejo global de errores minimo.
- Probar endpoints con Postman.
- Actualizar documentacion si cambia algun endpoint o regla.

### Criterios de Aceptacion

- Se puede crear, listar, consultar, actualizar y eliminar/desactivar categorias.
- Se puede crear, listar, consultar, actualizar y eliminar/desactivar productos.
- Un producto debe estar asociado a una categoria existente.
- No se permite crear producto con precio negativo.
- No se permite crear producto con stock inicial negativo.
- No se permite crear categoria sin nombre.
- Las respuestas no exponen detalles internos innecesarios.
- Los errores comunes devuelven codigos HTTP coherentes.
- El proyecto compila y arranca.

### Endpoints Esperados

Categorias:

- `GET /api/categories`
- `GET /api/categories/{id}`
- `POST /api/categories`
- `PUT /api/categories/{id}`
- `DELETE /api/categories/{id}`

Productos:

- `GET /api/products`
- `GET /api/products/{id}`
- `POST /api/products`
- `PUT /api/products/{id}`
- `DELETE /api/products/{id}`

### Reglas de Negocio

- Una categoria debe tener nombre.
- El nombre de categoria no deberia duplicarse.
- Un producto debe tener nombre.
- Un producto debe pertenecer a una categoria existente.
- El precio de un producto debe ser cero o mayor.
- El stock actual y el stock minimo deben ser cero o mayores.
- No se debe eliminar una categoria si tiene productos asociados, salvo que se decida usar desactivacion logica.

### Que Investigar Antes de Implementar

- Diferencia entre `@Entity`, `@Table`, `@Id` y `@GeneratedValue`.
- Como usar `JpaRepository`.
- Diferencia entre `@ManyToOne` y `@OneToMany`.
- Que es carga LAZY en JPA.
- Como usar `@Valid`, `@NotBlank`, `@NotNull`, `@PositiveOrZero`.
- Como devolver `ResponseEntity`.
- Como manejar `404 Not Found` con excepciones.
- Diferencia entre entidad y DTO.

### Temas que NO Debo Tocar Todavia

- JWT.
- Spring Security.
- Login y registro.
- Roles y permisos.
- Docker.
- Frontend con Thymeleaf.
- Reportes.
- Paginacion avanzada.
- Busquedas complejas.
- Microservicios.
- Arquitectura hexagonal.

## Entregables Posteriores

- Entregable 2: Movimientos de inventario.
- Entregable 3: Usuarios y roles basicos.
- Entregable 4: Autenticacion y seguridad.
- Entregable 5: Vistas Thymeleaf minimas si se decide incluir UI.

