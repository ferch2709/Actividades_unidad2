package com.universidad.calificaciones.exception;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(AlumnoNoEncontradoException.class)
	public ResponseEntity<Map<String, String>> handleAlumnoNoEncontrado(AlumnoNoEncontradoException ex) {
		return ResponseEntity.status(HttpStatus.NOT_FOUND)
				.body(Map.of("error", "AlumnoNoEncontrado", "mensaje", ex.getMessage()));
	}

	@ExceptionHandler(SinCalificacionesException.class)
	public ResponseEntity<Map<String, String>> handleSinCalificaciones(SinCalificacionesException ex) {
		return ResponseEntity.status(HttpStatus.NOT_FOUND)
				.body(Map.of("error", "SinCalificaciones", "mensaje", ex.getMessage()));
	}

	@ExceptionHandler(AlumnoNoInscritoException.class)
	public ResponseEntity<Map<String, String>> handleAlumnoNoInscrito(AlumnoNoInscritoException ex) {
		return ResponseEntity.status(HttpStatus.FORBIDDEN)
				.body(Map.of("error", "AlumnoNoInscrito", "mensaje", ex.getMessage()));
	}
}
