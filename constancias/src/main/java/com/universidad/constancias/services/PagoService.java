package com.universidad.constancias.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class PagoService {

    private static final Logger log = LoggerFactory.getLogger(PagoService.class);

    public void realizarCobro(String matricula) {
        log.info("Cobro registrado para la matricula {}", matricula);
    }
}