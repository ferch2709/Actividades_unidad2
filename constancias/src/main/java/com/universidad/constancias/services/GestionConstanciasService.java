package com.universidad.constancias.services;

import org.springframework.stereotype.Service;

import com.universidad.constancias.models.Estudiante;
import com.universidad.constancias.models.Solicitud;

@Service
public class GestionConstanciasService {

    private final SolicitudService solicitudService;
    private final EstudianteService estudianteService;
    private final PagoService pagoService;
    private final DocumentoService documentoService;
    private final NotificacionService notificacionService;

    public GestionConstanciasService(SolicitudService solicitudService,
EstudianteService estudianteService,
PagoService pagoService,
DocumentoService documentoService,
NotificacionService notificacionService) {
        this.solicitudService = solicitudService;
        this.estudianteService = estudianteService;
        this.pagoService = pagoService;
        this.documentoService = documentoService;
        this.notificacionService = notificacionService;
    }

    public Solicitud solicitarConstancia(String matricula) {
        Solicitud solicitud = solicitudService.registrarSolicitud(matricula);
        Estudiante estudiante = estudianteService.verificarEstudiante(matricula);
        pagoService.realizarCobro(matricula);
        documentoService.generarPDF(matricula);
        notificacionService.enviarArchivoPorCorreo(estudiante.getCorreo());
        return solicitudService.actualizarEstado(solicitud, "ENVIADA");
    }
}
