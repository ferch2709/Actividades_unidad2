package com.universidad.calificaciones.exception;

public class SinCalificacionesException extends RuntimeException {

	public SinCalificacionesException(Long idAlumno) {
		super("El alumno " + idAlumno + " no tiene calificaciones registradas");
	}
}
