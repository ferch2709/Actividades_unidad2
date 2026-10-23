package com.universidad.calificaciones.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Alumno {

	@Id
	private Long id;
	private String nombre;
	private boolean inscrito;

	public Alumno() {
	}

	public Alumno(Long id, String nombre, boolean inscrito) {
		this.id = id;
		this.nombre = nombre;
		this.inscrito = inscrito;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isInscrito() {
		return inscrito;
	}

	public void setInscrito(boolean inscrito) {
		this.inscrito = inscrito;
	}
}
