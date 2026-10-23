package com.universidad.biblioteca.repositories;

import com.universidad.biblioteca.models.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibroRepository extends JpaRepository<Libro, String> {
}
