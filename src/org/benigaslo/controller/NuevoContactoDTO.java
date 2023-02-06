package org.benigaslo.controller;

public class NuevoContactoDTO {
    public String numerosAgenda;
    public String nombre;
    public String telefono;

    public NuevoContactoDTO(String numerosAgenda, String nombre, String telefono) {
        this.numerosAgenda = numerosAgenda;
        this.nombre = nombre;
        this.telefono = telefono;
    }
}
