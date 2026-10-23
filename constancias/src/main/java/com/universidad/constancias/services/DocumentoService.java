package com.universidad.constancias.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class DocumentoService {

    private static final Logger log = LoggerFactory.getLogger(DocumentoService.class);

    public void generarPDF(String matricula) {
        log.info("PDF generado para la matricula {}", matricula);
    }
}
