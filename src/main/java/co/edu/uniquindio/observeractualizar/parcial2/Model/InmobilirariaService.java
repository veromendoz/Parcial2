package co.edu.uniquindio.observeractualizar.parcial2.Model;

public class InmobilirariaService {

    private Database database;

    public InmobilirariaService() {
        this.database = Database.getInstance();
    }

    public void CrearInmueble (String tipo, String ciudad, int habitaciones, int pisos, double precio){
        Inmueble nuevoInmueble = InmuebleFactory.crearInmueble(
                tipo,
                ciudad,
                habitaciones,
                pisos,
                precio
        );
        guardarInmueble (nuevoInmueble);
    }

    public void guardarInmueble (Inmueble inmueble){
        database.getInmuebles().add(inmueble);
    }

    public void eliminarInmueble (Inmueble inmueble){
        database.getInmuebles().remove(inmueble);
    }
}
