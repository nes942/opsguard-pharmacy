# Modulo `category`

## Que Debe Contener

Este modulo debe contener la funcionalidad de categorias de productos:

- Entidad `Category`.
- Repositorio JPA de categorias.
- Servicio con reglas de negocio de categorias.
- Controlador REST de categorias.
- DTOs de entrada y salida.
- Mapper entre entidad y DTO.
- Excepciones especificas de categorias si son necesarias.

## Que NO Debe Contener

- Logica propia de productos.
- Logica de inventario.
- Logica de autenticacion.
- Configuracion global.
- Codigo de frontend.

## Que Se Implementara Despues

- CRUD de categorias.
- Validacion de nombre obligatorio.
- Regla para evitar nombres duplicados.
- Validacion antes de eliminar una categoria con productos asociados.

## Preguntas de Defensa Tecnica

- Por que una categoria es un modulo de negocio y no solo una carpeta generica?
- Que pasa si intento eliminar una categoria usada por productos?
- La relacion con productos deberia cargarse siempre o solo cuando se necesite?
- Donde colocarias la validacion de nombre duplicado?
- Que responderia la API si no encuentra una categoria?

