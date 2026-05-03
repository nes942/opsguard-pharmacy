# Endpoints Planeados

Este documento lista endpoints esperados por version. Los marcados con `Entregable 1` pertenecen al primer bloque de implementacion.

## Categorias

| Metodo | Endpoint | Entregable | Descripcion |
| --- | --- | --- | --- |
| GET | `/api/categories` | Entregable 1 | Listar categorias |
| GET | `/api/categories/{id}` | Entregable 1 | Obtener una categoria por id |
| POST | `/api/categories` | Entregable 1 | Crear una categoria |
| PUT | `/api/categories/{id}` | Entregable 1 | Actualizar una categoria |
| DELETE | `/api/categories/{id}` | Entregable 1 | Eliminar o desactivar una categoria |

## Productos

| Metodo | Endpoint | Entregable | Descripcion |
| --- | --- | --- | --- |
| GET | `/api/products` | Entregable 1 | Listar productos |
| GET | `/api/products/{id}` | Entregable 1 | Obtener un producto por id |
| POST | `/api/products` | Entregable 1 | Crear un producto |
| PUT | `/api/products/{id}` | Entregable 1 | Actualizar un producto |
| DELETE | `/api/products/{id}` | Entregable 1 | Eliminar o desactivar un producto |

## Inventario

| Metodo | Endpoint | Entregable | Descripcion |
| --- | --- | --- | --- |
| POST | `/api/inventory/movements` | Futuro | Registrar entrada o salida de inventario |
| GET | `/api/inventory/movements` | Futuro | Listar movimientos |
| GET | `/api/products/{id}/inventory-movements` | Futuro | Ver movimientos de un producto |

## Usuarios

| Metodo | Endpoint | Entregable | Descripcion |
| --- | --- | --- | --- |
| GET | `/api/users` | Futuro | Listar usuarios |
| GET | `/api/users/{id}` | Futuro | Obtener usuario por id |
| POST | `/api/users` | Futuro | Crear usuario administrativo |
| PUT | `/api/users/{id}` | Futuro | Actualizar usuario |

## Autenticacion

| Metodo | Endpoint | Entregable | Descripcion |
| --- | --- | --- | --- |
| POST | `/api/auth/login` | Futuro | Login de usuario |
| POST | `/api/auth/register` | Futuro | Registro si se decide permitirlo |

## Notas

- Los endpoints de autenticacion no deben implementarse en el Entregable 1.
- Los endpoints de inventario dependen de tener productos funcionando.
- Spring Security y JWT quedan fuera del alcance inicial.

