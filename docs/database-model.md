# Modelo Inicial de Base de Datos

Este documento describe el modelo inicial planeado. No significa que todas las entidades deban implementarse en el primer entregable.

## Tablas

### `users`

Representa usuarios internos del sistema.

Campos planeados:

- `id`
- `name`
- `email`
- `password`
- `active`
- `created_at`
- `updated_at`

Relaciones:

- Un usuario puede registrar muchos movimientos de inventario.
- Un usuario puede tener muchos roles.

### `roles`

Representa permisos o perfiles generales.

Campos planeados:

- `id`
- `name`

Relaciones:

- Un rol puede pertenecer a muchos usuarios.

### `users_roles`

Tabla intermedia para la relacion N:M entre usuarios y roles.

Campos planeados:

- `user_id`
- `role_id`

Relacion:

- `user_id` referencia `users.id`.
- `role_id` referencia `roles.id`.

### `categories`

Agrupa productos por tipo.

Estado de implementación:

- Entidad JPA `Category` implementada.
- Tabla configurada como `categories`.

Campos implementados:

- `id`
- `name`
- `description`
- `active`
- `created_at`
- `updated_at`

Relaciones:

- Una categoria tiene muchos productos.
- La relación con `products` todavía no está implementada; se agregará cuando se cree la entidad `Product`.

### `products`

Representa productos vendidos o gestionados por la farmacia.

Campos planeados:

- `id`
- `name`
- `description`
- `sku`
- `price`
- `current_stock`
- `minimum_stock`
- `active`
- `category_id`
- `created_at`
- `updated_at`

Relaciones:

- Un producto pertenece a una categoria.
- Un producto tiene muchos movimientos de inventario.

### `inventory_movements`

Representa entradas y salidas de inventario.

Campos planeados:

- `id`
- `product_id`
- `user_id`
- `movement_type`
- `quantity`
- `reason`
- `created_at`

Relaciones:

- Un movimiento pertenece a un producto.
- Un movimiento pertenece al usuario que lo registro.

## Relaciones Principales

- `categories` 1:N `products`
- `products` 1:N `inventory_movements`
- `users` 1:N `inventory_movements`
- `users` N:M `roles`

## Decisiones Iniciales

- El stock actual puede vivir en `products.current_stock` para consultas simples.
- Los cambios de stock se auditan en `inventory_movements`.
- La relacion usuario-roles se modela con tabla intermedia para permitir mas de un rol por usuario.
- Las relaciones deben implementarse en JPA solo cuando su entregable lo requiera.

