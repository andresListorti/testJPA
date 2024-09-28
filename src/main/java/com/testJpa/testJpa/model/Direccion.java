package com.testJpa.testJpa.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "direccion")
public class Direccion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String calle;

    @Column(nullable = false)
    private String altura;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Ciudad ciudad;

    private Integer piso;

    public Direccion(String calle, String altura, Ciudad ciudad, Integer piso) {
        this.calle = calle;
        this.altura = altura;
        this.ciudad = ciudad;
        this.piso = piso;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((calle == null) ? 0 : calle.hashCode());
        result = prime * result + ((altura == null) ? 0 : altura.hashCode());
        result = prime * result + ((ciudad == null) ? 0 : ciudad.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Direccion other = (Direccion) obj;
        if (calle == null) {
            if (other.calle != null)
                return false;
        } else if (!calle.equals(other.calle))
            return false;
        if (altura == null) {
            if (other.altura != null)
                return false;
        } else if (!altura.equals(other.altura))
            return false;
        if (ciudad != other.ciudad)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Direccion [id=" + id + ", calle=" + calle + ", altura=" + altura + ", ciudad=" + ciudad
                + ", piso=" + piso + "]";
    }

}
