package com.universidad.constancias.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "solicitud")

public class Solicitud {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
 private Long id;

 @Column(nullable = false)
    private String matricula;

    @Column(nullable = false)
    private String estado;
    
    public Solicitud() {}
    public Solicitud(String matricula, String estado) {
        this.matricula = matricula;
        this.estado = estado;
    }

    public Long getId() { return id; }

    public String getMatricula() { return matricula; }
    public void setMatricula(String matricula) { this.matricula = matricula; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }
}
