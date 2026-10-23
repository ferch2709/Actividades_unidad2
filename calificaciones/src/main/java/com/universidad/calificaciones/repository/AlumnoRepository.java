package com.universidad.calificaciones.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.universidad.calificaciones.model.Alumno;

public interface AlumnoRepository extends JpaRepository<Alumno, Long> {
}
