package co.edu.uniquindio.observeractualizar.parcial2.Model;

public class Apartamento extends AbstractInmueble implements Inmueble {

    public Apartamento(String ciudad, int habitaciones, int pisos, double precio) {
        super("Apartamento", ciudad, habitaciones, pisos, precio);
    }
}
