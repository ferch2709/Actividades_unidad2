# Calificaciones

API  hecha con springinitializr para consultar las calificaciones de un alumno.

Cuando alguien pide las calificaciones de un alumno por su ID, la API:

1. Busca si el alumno existe.
2. Verifica que esté inscrito.
3. Busca sus calificaciones.
4. Devuelve solo el nombre de la materia y la nota (no todo el objeto interno).

Si algo falla, responde con un error claro:


 El alumno no existe  `404`  No hay registro con ese ID 
 El alumno no está inscrito  `403`  Existe, pero no puede consultar calificaciones 
 No tiene calificaciones `404`  Está inscrito, pero aún no hay notas 

## Requisitos

- Java 21 

## Cómo correr el proyecto

presionando run dentro del IDE


Cuando arranque bien, la API queda en:

`http://localhost:8080`


## Endpoint principal

### Consultar calificaciones de un alumno

```http
GET /api/calificaciones/{idAlumno}
```

Ejemplo:

```bash
curl http://localhost:8080/api/calificaciones/1
```

Respuesta exitosa (ejemplo):

```json
[
  {
    "nombreMateria": "Matemáticas",
    "calificacion": 9.5
  },
  {
    "nombreMateria": "Historia",
    "calificacion": 8.0
  }
]
```

Respuesta de error (ejemplo):

```json
{
  "error": "AlumnoNoEncontrado",
  "mensaje": "Alumno no encontrado: 999"
}
```

## Tecnologías que usa


 Spring Boot | Crear la API más fácil 
 Spring Web | Endpoints REST (`@RestController`, `@GetMapping`) 
 Spring Data JPA | Guardar/consultar datos sin escribir mucho SQL 
 MySQL connector | Está en el `pom.xml`
 Maven (`mvnw`) | Descarga dependencias y corre el proyecto 

## Autor

Eduardo Oropeza Viola
