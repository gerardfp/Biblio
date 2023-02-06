package org.benigaslo.controller;

import org.benigaslo.model.Agenda;
import org.benigaslo.model.Contacto;
import org.benigaslo.model.Modelo;
import org.benigaslo.view.Vista;

import java.util.List;

public class Controlador {

    Vista vista = new Vista();
    Modelo modelo = new Modelo();


    public void aCorrer(){

        while(true) {
            vista.mostrarMenu();

            int o = vista.pedirOpcion();

            if (o == 1) {
                List<Agenda> lalistaquemeretorna = modelo.obtenerListaAgendas();

                NuevoContactoDTO datosNuevoContacto = vista.muestraPantallaAnyadirContacto(lalistaquemeretorna);


                modelo.guardaEsteContacto(datosNuevoContacto);
            }

        }


    }
}
