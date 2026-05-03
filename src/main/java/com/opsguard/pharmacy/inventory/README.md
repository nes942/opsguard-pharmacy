# Modulo `inventory`

## Que Debe Contener

Este modulo debe contener el registro de movimientos de inventario:

- Entidad `InventoryMovement`.
- Repositorio JPA de movimientos.
- Servicio con reglas de entrada y salida de stock.
- Controlador REST de inventario cuando toque implementarlo.
- DTOs para registrar movimientos.
- Mapper entre entidad y DTO.
- Excepciones especificas de inventario.

## Que NO Debe Contener

- CRUD completo de productos.
- CRUD completo de usuarios.
- Autenticacion.
- Reportes avanzados.
- Calculos contables o financieros.

## Que Se Implementara Despues

- Registro de entradas y salidas.
- Relacion con producto.
- Relacion con usuario responsable.
- Validacion para no permitir salidas mayores al stock disponible.
- Historial de movimientos por producto.

## Preguntas de Defensa Tecnica

- Por que inventario se modela como movimientos y no solo como un numero?
- Como evitarias stock negativo?
- Que relacion tiene inventario con producto?
- Que relacion tiene inventario con usuario?
- Que datos minimos debe guardar un movimiento para auditoria?

