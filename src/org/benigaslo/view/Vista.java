package org.benigaslo.view;

import org.benigaslo.controller.BibliotecaDTO;
import org.benigaslo.model.Biblioteca;

import java.util.List;
import java.util.Scanner;

public class Vista {
    Scanner scanner = new Scanner(System.in);

    public void mostrarMenu() {
        System.out.println("MENU");
        System.out.println("1) Añadir biblioteca");
        System.out.println("2) Ver bibliotecas");
    }

    public int pedirOpcion() {
        System.out.println("Opcion: ");
        int opcion = scanner.nextInt();
        scanner.nextLine();

        return opcion;
    }

    public void mostrarBibliotecas(List<Biblioteca> bibliotecas) {
        System.out.println("LISTA DE Bibliotecas");

        bibliotecas.forEach(biblioteca -> System.out.println(biblioteca.nombre + " : " + biblioteca.ciudad));
    }

    public BibliotecaDTO pedirDatosBibliotecaNueva() {
        System.out.println("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Ciudad: ");
        String ciudad = scanner.nextLine();

        return new BibliotecaDTO(nombre, ciudad);

    }
}
