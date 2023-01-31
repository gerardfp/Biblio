package org.benigaslo.model;

import org.benigaslo.controller.BibliotecaDTO;

import java.util.ArrayList;
import java.util.List;

public class Modelo {

    List<Biblioteca> bibliotecas = new ArrayList<>();


    public void guardarBiblioteca(BibliotecaDTO datos){
        bibliotecas.add(new Biblioteca(datos.nombre, datos.ciudad));
    }


    public List<Biblioteca> obtenerListaBibliotecas() {
        return bibliotecas;
    }
}
