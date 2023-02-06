package org.benigaslo.view;

import org.benigaslo.controller.AgendaDTO;
import org.benigaslo.controller.NuevoContactoDTO;
import org.benigaslo.model.Agenda;

import java.util.List;
import java.util.Scanner;

public class Vista {
    Scanner scanner = new Scanner(System.in);

    public void mostrarMenu() {
        System.out.println("MENU");
        System.out.println("1. Añadir contacto\n" +
                "2. Ver contactos\n" +
                "3. Crear nueva agenda\n" +
                "4. Ver agendas");
    }

    public int pedirOpcion() {
        System.out.println("Opcion: ");
        int opcion = scanner.nextInt();
        scanner.nextLine();

        return opcion;
    }

    public void mostrarAgendas(List<Agenda> agendas) {
        System.out.println("LISTA DE Bibliotecas");

        agendas.forEach(agenda -> System.out.println(agenda.nombre + " : " + agenda.descripcion));
    }

    public AgendaDTO pedirDatosAgendaNueva() {
        System.out.println("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Ciudad: ");
        String ciudad = scanner.nextLine();

        return new AgendaDTO(nombre, ciudad);

    }

    public NuevoContactoDTO muestraPantallaAnyadirContacto(List<Agenda> joseps) {
        System.out.println("*** Añadir contacto");
        System.out.println("Selecione agenda:");

        for(Agenda agenda : joseps){
            System.out.println(agenda.nombre);
        }

        System.out.println("Opcion: ");

        String numerosDeAgenada = scanner.nextLine();

        System.out.println("Nombre: ");
        String nombreContacto = scanner.nextLine();
        System.out.println("Tlefono: ");
        String nombreTelefono = scanner.nextLine();


        return new NuevoContactoDTO(nombreContacto, nombreContacto, nombreTelefono);

    }
}
