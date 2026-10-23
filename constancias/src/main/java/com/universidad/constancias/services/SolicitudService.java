package com.universidad.constancias.services;

import org.springframework.stereotype.Service;

import com.universidad.constancias.models.Solicitud;
import com.universidad.constancias.repositories.SolicitudRepository;

@Service
public class SolicitudService {
    private final SolicitudRepository repositorio;


    public SolicitudService(SolicitudRepository repositorio){
        this.repositorio =repositorio;
    }

    public Solicitud registrarSolicitud(String matricula){
        Solicitud solicitud = new Solicitud(matricula, "REGISTRADA");
        return repositorio.save(solicitud);
    }

    public Solicitud actualizarEstado(Solicitud solicitud, String estado) {
        solicitud.setEstado(estado);
        return repositorio.save(solicitud);
    }
}
