package co.edu.uniquindio.observeractualizar.parcial2.Model;

import java.util.ArrayList;

public class Database {

    //PATRON SINGLETONE

    private static Database database;
    private ArrayList<Inmueble> inmuebles;

    private Database() {
        inmuebles = new ArrayList<>();
    }

    public static Database getInstance() {
        if (database == null) {
            database = new Database();
        }
        return database;
    }

    public ArrayList<Inmueble> getInmuebles() {
        return inmuebles;
    }
}
