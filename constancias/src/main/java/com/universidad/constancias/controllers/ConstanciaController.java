package com.universidad.constancias.controllers;

import com.universidad.constancias.models.Solicitud;
import com.universidad.constancias.services.GestionConstanciasService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/constancias")
public class ConstanciaController {

    private final GestionConstanciasService servicio;

    public ConstanciaController(GestionConstanciasService servicio) {
        this.servicio = servicio;
    }

    @PostMapping
    public Solicitud solicitarConstancia(@RequestParam String matricula) {
        return servicio.solicitarConstancia(matricula);
    }
}
