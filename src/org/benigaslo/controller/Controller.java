package org.benigaslo.controller;

import org.benigaslo.model.Biblio;
import org.benigaslo.model.Model;
import org.benigaslo.view.View;

import java.util.List;

public class Controller {


    public void acorrer(){
        View view = new View();
        Model model = new Model();

        while(true) {
            view.mostrarMenu();

            int papa = view.pedirOpcion();

            if (papa == 2) {

                List<Biblio> jp = model.obtenerListaBibliotecas();
                view.mostrarBibliotecas(jp);


            } else if (papa == 1) {
                BiblioDTO datos = view.pedirDatosBibliotecaNueva();

                model.guardarBiblioteca(datos);
            }
        }


    }
}
