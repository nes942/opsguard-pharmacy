
# Worklog - OpsGuard Pharmacy

Este archivo registra el avance real del proyecto. Debe actualizarse al final de cada sesión importante.

## Estado global actual

El proyecto tiene estructura base de Spring Boot, documentación inicial y módulos preparados.

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