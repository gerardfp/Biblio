package org.benigaslo.view;

import java.util.Scanner;

public class View {
    Scanner scanner = new Scanner(System.in);

    public void mostrarMenu() {
        System.out.println("MENU");
        System.out.println("1) Añadir nuevo contacto");
        System.out.println("2) Ver contactos");
    }

    public int pedirOpcion() {
        System.out.println("Opcion: ");
        int opcion = scanner.nextInt();

        return opcion;
    }

    public void mostrarContactos() {
        System.out.println("LISTA DE CONTACTOS");
        System.out.println("...aqui ira la lista...");
    }

    public void pedirDatosContactoNuevo() {
        System.out.println("Nombre: ");
        String nombre = scanner.next();
        System.out.println("Telefono: ");
        String telefono = scanner.next();

    }
}
