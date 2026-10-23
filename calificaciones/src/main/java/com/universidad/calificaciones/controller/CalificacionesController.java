package com.universidad.calificaciones.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import com.universidad.calificaciones.service.CalificacionesService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.List;
import com.universidad.calificaciones.dto.CalificacionResponse;

@RestController
@RequestMapping("/api/calificaciones")
public class CalificacionesController {
    private final CalificacionesService calificacionesService;
    public CalificacionesController(CalificacionesService calificacionesService){
        this.calificacionesService = calificacionesService;
    }

    @GetMapping("/{idAlumno}")
    public List<CalificacionResponse> consultarCalificaciones(@PathVariable Long idAlumno){
        return calificacionesService.consultarCalificaciones(idAlumno);
    }
    
}
