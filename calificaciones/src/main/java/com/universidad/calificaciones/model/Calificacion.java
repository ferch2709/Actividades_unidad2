package com.universidad.calificaciones.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Calificacion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Long idAlumno;
	private String nombreMateria;
	private Double calificacion;

	public Calificacion() {
	}

	public Calificacion(Long idAlumno, String nombreMateria, Double calificacion) {
		this.idAlumno = idAlumno;
		this.nombreMateria = nombreMateria;
		this.calificacion = calificacion;
	}

	public Long getId() {
		return id;
	}

	public Long getIdAlumno() {
		return idAlumno;
	}

	public void setIdAlumno(Long idAlumno) {
		this.idAlumno = idAlumno;
	}

	public String getNombreMateria() {
		return nombreMateria;
	}

	public void setNombreMateria(String nombreMateria) {
		this.nombreMateria = nombreMateria;
	}

	public Double getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(Double calificacion) {
		this.calificacion = calificacion;
	}
}
