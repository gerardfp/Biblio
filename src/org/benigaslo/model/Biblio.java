package org.benigaslo.model;

import java.util.ArrayList;
import java.util.List;

public class Biblio {
    public String nom;
    public String city;
    List<Llibre> llibres = new ArrayList<>();
    int id;
    int numeroLibros;



    public Biblio(String nom, String city) {
        this.nom = nom;
        this.city = city;
    }
}
