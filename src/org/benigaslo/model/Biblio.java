package org.benigaslo.model;

import java.util.ArrayList;
import java.util.List;

public class Biblio {
    public String nom;
    String city;
    List<Llibre> llibres = new ArrayList<>();


    public Biblio(String nom, String city) {
        this.nom = nom;
        this.city = city;
    }
}
