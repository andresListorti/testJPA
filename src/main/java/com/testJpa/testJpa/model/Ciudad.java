package com.testJpa.testJpa.model;

public enum Ciudad {

    BUENOS_AIRES(1),
    CORDOBA(2),
    MENDOZA(3),
    SAN_JUAN(4);

    private int numeroLocalidad;

    private Ciudad(int numeroLocalidad) {
        this.numeroLocalidad = numeroLocalidad;
    }

    public int getNumeroLocalidad() {
        return numeroLocalidad;
    }

    public static Ciudad buscarCiudadPorCodigo(int codigo) {
        for (Ciudad ciudad : Ciudad.values()) {
            if (ciudad.getNumeroLocalidad() == codigo) {
                return ciudad;
            }
        }
        throw new IllegalArgumentException("Código de ciudad inválido, solo se aceptan códigos del 1 al 4: " + codigo);
    }

}
