package co.edu.uniquindio.observeractualizar.parcial2.Controller;

import co.edu.uniquindio.observeractualizar.parcial2.Model.InmobiliariaFacade;

public class AgregarInmuebleController {

    private InmobiliariaFacade inmobiliariaFacade;

    public AgregarInmuebleController() {
        this.inmobiliariaFacade = new InmobiliariaFacade();
    }

    public void agregarNuevoInmueble(String tipo, String ciudad, int habitaciones, int pisos, double precio) {
        inmobiliariaFacade.CrearInmueble(tipo, ciudad, habitaciones, pisos, precio);

        System.out.println("Inmueble de tipo " + tipo + " en " + ciudad + " creado exitosamente.");
    }
}
