package com.universidad.calificaciones.exception;

public class AlumnoNoInscritoException extends RuntimeException {

	public AlumnoNoInscritoException(Long idAlumno) {
		super("El alumno " + idAlumno + " no está inscrito");
	}
}
