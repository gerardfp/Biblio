package org.benigaslo.controller;

import org.benigaslo.view.View;

public class Controller {


    public void acorrer(){
        View view = new View();

        view.mostrarMenu();

        int papa = view.pedirOpcion();

        if (papa == 1) {
            view.mostrarContactos();
        } else if (papa == 2) {
            view.pedirDatosContactoNuevo();
        }


    }
}
