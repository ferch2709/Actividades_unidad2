package com.universidad.constancias.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class NotificacionService {

    private static final Logger log = LoggerFactory.getLogger(NotificacionService.class);

    public void enviarArchivoPorCorreo(String correo) {
        log.info("Constancia enviada al correo {}", correo);
    }
}
