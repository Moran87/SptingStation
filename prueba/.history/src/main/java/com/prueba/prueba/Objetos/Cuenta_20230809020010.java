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
@Table(name="Cuenta")
public class Cuenta {

    @Id
    @Column(name="nombreUsuario",unique = true,nullable = false)
    private String nombreUsuario;

    @Column(name="correo",unique = false,nullable = false)
    private String correo;

    @Column(name="password",unique = false, nullable = false)
    private String password;
    
}
