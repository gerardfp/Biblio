package org.benigaslo.model;

import org.benigaslo.controller.BiblioDTO;

import java.util.ArrayList;
import java.util.List;

public class Model {

    List<Biblio> biblios = new ArrayList<>();


    public void guardarBiblioteca(BiblioDTO datos){
        biblios.add(new Biblio(datos.nombre, datos.ciudad));
    }


    public List<Biblio> obtenerListaBibliotecas() {
        return biblios;
    }
}
