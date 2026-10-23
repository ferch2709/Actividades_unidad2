package com.universidad.calificaciones.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.universidad.calificaciones.model.Calificacion;

public interface CalificacionRepository extends JpaRepository<Calificacion, Long> {

	List<Calificacion> findByIdAlumno(Long idAlumno);
}
