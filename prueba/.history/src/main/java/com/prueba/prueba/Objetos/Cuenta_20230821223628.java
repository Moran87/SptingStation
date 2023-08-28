package com.prueba.prueba.Objetos;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="cuenta",schema = "targetSchemaName")
public class Cuenta {

    @Id
    @Column(name="nombreUsuario",unique = true,nullable = false)
    private String nombreUsuario;

    @Column(name="correo",unique = false,nullable = false)
    private String correo;

    @Column(name="password",unique = false, nullable = false)
    private String password;
    
    @Column(nullable = true, unique = true)
    @ManyToMany(mappedBy = "cuenta")
    @JsonIgnore
    Set<PlayStation> playStation;

    @OneToOne(mappedBy = "cuenta")
    @JsonIgnore
    private PlayStationPlus psPlus;
}
