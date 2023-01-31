package org.benigaslo.view;

import java.util.Scanner;

public class View {
    Scanner scanner = new Scanner(System.in);

    public void mostrarMenu() {
        System.out.println("MENU");
        System.out.println("1) Add new contact");
        System.out.println("2) View contacts");
    }

    public void pedirOpcion() {
        System.out.println("Opcion: ");
        int opcion = scanner.nextInt();
    }

}
