package org.benigaslo.model;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    public String nombre;
    public String ciudad;
    List<Libro> libros = new ArrayList<>();


    public Biblioteca(String nombre, String ciudad) {
        this.nombre = nombre;
        this.ciudad = ciudad;
    }
}
