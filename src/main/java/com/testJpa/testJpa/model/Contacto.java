package com.testJpa.testJpa.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Entity
@PrimaryKeyJoinColumn(name = "id")
@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
public class Contacto extends Persona {

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "empresa_id")
    private Empresa empresa;

    public Contacto(String nombre, String apellido, Direccion direccion, String telefono, String email, String dni,
            Empresa empresa) {
        super(nombre, apellido, direccion, telefono, email, dni);
        this.empresa = empresa;
    }
}
