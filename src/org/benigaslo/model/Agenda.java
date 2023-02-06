package org.benigaslo.model;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    public String nombre;
    public String descripcion;
    List<Contacto> contactos = new ArrayList<>();


    public Agenda(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
}
