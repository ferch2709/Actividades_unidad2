package com.universidad.calificaciones.dto;

/**
este archivo lo ocupamos para solo mandar las calificaciones y no el objeto completo del modelo
 */
public class CalificacionResponse {

	private String nombreMateria;
	private Double calificacion;

	public CalificacionResponse(String nombreMateria, Double calificacion) {
		this.nombreMateria = nombreMateria;
		this.calificacion = calificacion;
	}

	public String getNombreMateria() {
		return nombreMateria;
	}

	public Double getCalificacion() {
		return calificacion;
	}
}
