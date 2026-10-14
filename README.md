
# Microservicio de Usuarios - Tienda PC

## Descripcion
Microservicio desarrollado con Java 21 y Spring Boot
para gestionar los usuarios de una tienda de
componentes de PC.

Permite registrar, consultar, actualizar y eliminar
usuarios mediante una API REST.

## Tecnologias
- Java 21
- Spring Boot 4.0.8
- Spring Data JPA
- Hibernate
- MySQL 8
- Maven
- Postman
- Git y GitHub

## Estructura del proyecto
- model: entidades JPA.
- repository: acceso a base de datos.
- service: logica de negocio.
- controller: endpoints REST.
- config: configuraciones adicionales.

## Base de datos
Nombre: tienda_usuarios_db

Tabla principal: usuarios

## Endpoints REST

| Metodo | Endpoint | Descripcion |
|--------|----------|-------------|
| POST | /api/usuarios | Crear usuario |
| GET | /api/usuarios | Listar usuarios |
| GET | /api/usuarios/{id} | Buscar usuario |
| PUT | /api/usuarios/{id} | Actualizar usuario |
| DELETE | /api/usuarios/{id} | Eliminar usuario |

## Configuracion
Puerto: 8081

La conexion a MySQL utiliza las variables:
- DB_USERNAME (por defecto root)
- DB_PASSWORD

## Ejecucion
Configurar la variable DB_PASSWORD en PowerShell.

Iniciar el microservicio:

./mvnw.cmd spring-boot:run

## Generar archivo JAR
./mvnw.cmd clean package

## Pruebas realizadas
- Crear usuario: 201 Created.
- Listar usuarios: 200 OK.
- Buscar usuario por ID: 200 OK.
- Actualizar usuario: 200 OK.
- Eliminar usuario: 204 No Content.
- Datos invalidos: 400 Bad Request.
- Persistencia comprobada en MySQL.

## Ramas Git
- main
- develop
- feature/documentacion

## Proyecto
Evaluacion 2 - Arquitectura de Microservicios.
Tienda de componentes de PC.
