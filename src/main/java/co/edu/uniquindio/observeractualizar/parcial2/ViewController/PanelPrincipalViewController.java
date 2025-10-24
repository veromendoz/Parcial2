package co.edu.uniquindio.observeractualizar.parcial2.ViewController;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;

public class PanelPrincipalViewController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnAgregarProductos;

    @FXML
    private Button btnListaProductos;


    @FXML
    void initialize() {
        assert btnAgregarProductos != null : "fx:id=\"btnAgregarProductos\" was not injected: check your FXML file 'PanelPrincipal.fxml'.";
        assert btnListaProductos != null : "fx:id=\"btnListaProductos\" was not injected: check your FXML file 'PanelPrincipal.fxml'.";

    }

    @FXML
    void onListaProductos(ActionEvent event) {
        try {
            // Carga del FXML que muestra la lista de inmuebles
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/observeractualizar/parcial2/View/ListaInmuebles.fxml"));
            Parent listaInmuebles = loader.load();

            // Obtener el controlador de la vista ListaInmuebles
            InmobiliariaViewController controller = loader.getController();
            controller.setMenuPrincipalController(this);

            // Reemplazar el contenido del contenedor principal
            inmobiliaria.getChildren().clear();
            inmobiliaria.getChildren().add(listaInmuebles);

        } catch (IOException e) {
            mostrarAlerta("Error", "No se pudo cargar la vista de inmuebles", Alert.AlertType.ERROR);
            e.printStackTrace();
        }
    }

    }

}
