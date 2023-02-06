package org.benigaslo.model;

import org.benigaslo.controller.AgendaDTO;
import org.benigaslo.controller.NuevoContactoDTO;

import java.util.ArrayList;
import java.util.List;

public class Modelo {

    List<Agenda> agendas = new ArrayList<>();


    public void guardarAgenda(AgendaDTO datos){
        agendas.add(new Agenda(datos.nombre, datos.ciudad));
    }


    public List<Agenda> obtenerListaAgendas() {
        return agendas;
    }

    public void eliminarContacto(String nom){

        agendas.removeIf(agenda -> agenda.nombre.equals(nom));

    }

    public void guardaEsteContacto(NuevoContactoDTO datos) {

        Contacto contacto = new Contacto(datos.nombre, datos.telefono);

        // String numerosAgenda = "1 7 13 23 34";
        //                              |
        //                              |
        //                           split(" ")
        //                              |
        //                              |
        //                              v
        //                  ["1", "7", "13", "23", "34"]

        for (String numero : datos.numerosAgenda.split(" ")) {
            agendas.get(Integer.parseInt(numero)).contactos.add(contacto);
        }



    }
}
