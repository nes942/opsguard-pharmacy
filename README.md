# OpsGuard Farmacia

OpsGuard Farmacia es un proyecto backend de portafolio junior pensado para practicar el desarrollo de una API REST con Java, Spring Boot, Maven, PostgreSQL, Spring Data JPA y Bean Validation.

El objetivo no es construir un sistema empresarial completo desde el inicio, sino avanzar por entregables pequeños, defendibles y fáciles de explicar en entrevista.

## Problema que Resuelve

Una farmacia necesita registrar categorias, productos e inventario para tener una base ordenada de su operacion diaria. En versiones posteriores, el sistema podra registrar movimientos de inventario, usuarios y autenticacion.

## Stack

- Java
- Spring Boot
- Maven
- PostgreSQL
- Spring Data JPA
- Bean Validation
- Thymeleaf minimo en una etapa posterior
- Git/GitHub
- Postman

## Alcance V1

La primera version se trabajara como una API REST monolitica simple, organizada por modulos de negocio:

- `category`
- `product`
- `inventory`
- `user`
- `auth`
- `common`
- `config`

El primer entregable sera el CRUD de categorias y productos.

## Trabajo por Entregables

Cada entregable debe tener:

- Objetivo claro.
- Tareas pequenas.
- Endpoints esperados.
- Reglas de negocio.
- Criterios de aceptacion.
- Pruebas manuales en Postman.
- Documentacion actualizada.

La documentacion de entregables vive en [docs/implementation-roadmap.md](docs/implementation-roadmap.md).

## Todavia NO Implementado

- No hay CRUD implementado.
- No hay JWT.
- No hay Spring Security.
- No hay frontend.
- No hay Dockerfile.
- No hay microservicios.
- No hay arquitectura hexagonal.
- No hay logica completa de inventario.

Este repositorio es una base pedagogica para implementar paso a paso.

