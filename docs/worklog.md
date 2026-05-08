
# Worklog - OpsGuard Pharmacy

Este archivo registra el avance real del proyecto. Debe actualizarse al final de cada sesión importante.

## Estado global actual

El proyecto tiene estructura base de Spring Boot, documentación inicial, módulos preparados y la entidad `Category` implementada.

Todavía no hay CRUD implementado.

Entregable actual:

CRUD de categorías y productos.

## 2026-05-04

### Estado al iniciar
- Repositorio creado en GitHub.
- README general creado.
- Documentación inicial creada en `docs/`.
- Estructura modular creada en `src/main/java/com/opsguard/pharmacy`.
- `application.properties` configurado para PostgreSQL usando variables de entorno.
- No hay entidades implementadas todavía.
- No hay repositorios implementados todavía.
- No hay servicios implementados todavía.
- No hay controladores implementados todavía.

### Decisiones confirmadas
- Usar PostgreSQL.
- Usar arquitectura modular por feature:
    - category
    - product
    - inventory
    - user
    - auth
    - common
    - config
- Empezar con CRUD de categorías y productos.
- No implementar JWT todavía.
- No implementar Spring Security todavía.
- No implementar Docker todavía.
- No implementar frontend todavía.

### Próximo paso exacto
Implementar la entidad `Category`.

### Investigación dirigida para el próximo paso
- @Entity
- @Table
- @Id
- @GeneratedValue
- @Column
- LocalDateTime
- Boolean
- constructor vacío en JPA

## 2026-05-07

### Estado al iniciar
- El siguiente paso exacto era implementar la entidad `Category`.
- No había entidades implementadas todavía.

### Implementado
- Se creó `src/main/java/com/opsguard/pharmacy/category/entity/Category.java`.
- La entidad `Category` modela los campos:
    - `id`
    - `name`
    - `description`
    - `active`
    - `createdAt`
    - `updatedAt`
- Se agregaron anotaciones JPA básicas:
    - `@Entity`
    - `@Table(name = "categories")`
    - `@Id`
    - `@GeneratedValue(strategy = GenerationType.IDENTITY)`
    - `@Column`
- Se agregó constructor vacío requerido por JPA.
- Se agregaron getters y setters.

### Verificación
- El proyecto compila correctamente con:

```bash
./mvnw -q -DskipTests compile
```

### Commits realizados

```bash
976660c Add Category entity
1e85760 Update docs after Category entity implementation
```

### Problemas encontrados
- No hubo errores de compilación.
- No hay endpoints todavía, así que no aplica prueba manual en Postman.
- `.codex` aparece como archivo sin trackear y no debe incluirse salvo que se decida explícitamente.

### Pendiente
- Todavía no hay repositorio, servicio, controlador, DTOs ni endpoints para categorías.
- Todavía no hay entidad `Product`.

### Próximo paso exacto
Crear la entidad `Product` y relacionarla con `Category` usando JPA.

### Investigación dirigida para el próximo paso
- `BigDecimal` para precios.
- `Integer` para stock.
- `@ManyToOne`.
- `@JoinColumn`.
- Relación muchos productos a una categoría.
- Por qué evitar relaciones bidireccionales al inicio.
