# Defensa Tecnica para Entrevista

Este documento contiene preguntas que deberias poder responder antes de presentar el proyecto.

## Arquitectura por Modulos

- Por que organizaste el proyecto por modulos de negocio?
- Que ventaja tiene `product/controller` frente a una carpeta global `controller`?
- Como evita esta estructura que el proyecto se vuelva dificil de navegar?
- Por que esto sigue siendo un monolito y no microservicios?
- Que criterio usarias para crear un nuevo modulo?

## Controller, Service y Repository

- Que responsabilidad tiene un controller?
- Que responsabilidad tiene un service?
- Que responsabilidad tiene un repository?
- Por que el controller no deberia usar directamente `JpaRepository`?
- Donde pondrias una regla como "no permitir precio negativo"?

## Entity vs DTO

- Que es una entidad JPA?
- Que es un DTO?
- Por que no conviene exponer entidades directamente en la API?
- Que diferencia hay entre DTO de request y DTO de response?
- Que campos no deberian exponerse nunca en una respuesta?

### Entidad `Category`

Deberias poder explicar:

- Por que `Category` lleva `@Entity`.
- Por que se usa `@Table(name = "categories")` para mapear la clase a la tabla.
- Por que `id` lleva `@Id` y `@GeneratedValue(strategy = GenerationType.IDENTITY)`.
- Por que `name` se marcó como `nullable = false`.
- Por que `createdAt` se mapea a `created_at` y `updatedAt` a `updated_at`.
- Por que JPA necesita un constructor vacío.

## Validaciones

- Para que sirve Bean Validation?
- Que diferencia hay entre validar formato y validar una regla de negocio?
- Donde usarias `@NotBlank`?
- Donde usarias `@PositiveOrZero`?
- Que respuesta deberia devolver la API si falla una validacion?

## JPA Relationships

- Como modelarias categoria 1:N productos?
- Que lado tendria `@ManyToOne` entre producto y categoria?
- Por que se debe tener cuidado con relaciones bidireccionales?
- Que significa carga LAZY?
- Como modelarias usuarios N:M roles?

## Manejo de Errores

- Que es un `GlobalExceptionHandler`?
- Cuando devolverias `404 Not Found`?
- Cuando devolverias `400 Bad Request`?
- Como harias consistente la respuesta de error?
- Por que no deberias mostrar stack traces al cliente?

## Flujo REST

- Que hace `GET /api/products`?
- Que diferencia hay entre `POST` y `PUT`?
- Que codigo HTTP devolverias al crear un recurso?
- Que codigo HTTP devolverias al no encontrar un recurso?
- Como probarias estos endpoints en Postman?

## Decisiones de Diseno

- Por que no implementaste JWT desde el inicio?
- Por que no agregaste Dockerfile todavia?
- Por que elegiste una arquitectura simple?
- Que harias primero si el proyecto creciera?
- Como justificarias que el proyecto es adecuado para un perfil junior?

