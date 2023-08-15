package com.prueba.prueba.Objetos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="PlayStation")
public class PlayStation {

    @Id
    @Column(name="noSerie",nullable = false,unique = true)
    private String noSerie;

    @Column(name="nombre", nullable = false, unique = false)
    private String nombre;

    @Column(name="paisOrigen",nullable = false, unique = false)
    private String paisOrigen;

    @Column(name="year", nullable = false, unique = false)
    private int year;
    
}
