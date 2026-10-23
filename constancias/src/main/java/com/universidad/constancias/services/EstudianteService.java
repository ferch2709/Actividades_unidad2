package com.universidad.constancias.services;

import com.universidad.constancias.models.Estudiante;
import com.universidad.constancias.repositories.EstudianteRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EstudianteService {

    private final EstudianteRepository repositorio;

    public EstudianteService(EstudianteRepository repositorio) {
        this.repositorio = repositorio;
    }

    public List<Estudiante> listar() {
        return repositorio.findAll();
    }

    public Estudiante verificarEstudiante(String matricula) {
        Estudiante estudiante = repositorio.findById(matricula).orElseThrow(() -> new ReglaNegocioException("Estudiante no encontrado"));
        if (!estudiante.isActivo()) {
            throw new ReglaNegocioException("El estudiante no está activo");
        }
        return estudiante;
    }
}
