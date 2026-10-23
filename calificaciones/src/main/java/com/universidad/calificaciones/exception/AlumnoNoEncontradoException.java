package com.universidad.calificaciones.exception;

public class AlumnoNoEncontradoException extends RuntimeException {

	public AlumnoNoEncontradoException(Long idAlumno) {
		super("Alumno no encontrado: " + idAlumno);
	}
}
