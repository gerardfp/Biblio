package org.benigaslo;


import java.util.List;

class Biblio {
    String nom;
    String city;
    List<Llibre> llibres;

    public Biblio(String nom, String city) {
        this.nom = nom;
        this.city = city;
    }
}

class Llibre {
    String nom;
    int any;

    Llibre(String elprmerdato, int elsegondato){
        nom = elprmerdato;
        any = elsegondato;
    }
}

public class Main {
    public static void main(String[] args) {
        Llibre llibre1 = new Llibre("Libro1", 1980);
        Llibre llibre2 = new Llibre("Libro2", 1200);
        Llibre llibre3 = new Llibre("Libro3", 1200);

        Biblio biblio1 = new Biblio("Biblio1", "La Vall");
        Biblio biblio2 = new Biblio("Biblio1", "Fondeguilla");


        biblio1.llibres.add(llibre1);
    }
}