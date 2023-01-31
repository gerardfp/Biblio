package org.benigaslo.view;

import org.benigaslo.model.Llibre;

import java.util.List;
import java.util.Scanner;

public class View {
    Scanner scanner = new Scanner(System.in);

    void mostrarMenu() {
        System.out.println("MENU");
        System.out.println("1) ldfkjdfs");
    }

    Llibre pedirDatosLibroNuevo(){
        System.out.println("Titulo: ");
        String titulo = scanner.nextLine();
        int anyo = scanner.nextInt();

        return new Llibre(titulo, anyo);
    }

    void mostrarListaLibros(List<Llibre> llibres) {
        System.out.println("Llista llibres");

        llibres.forEach(llibre -> System.out.println(llibre.nom));
    }
}
