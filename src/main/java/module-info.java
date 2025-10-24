module co.edu.uniquindio.observeractualizar.parcial2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens co.edu.uniquindio.observeractualizar.parcial2 to javafx.fxml;
    exports co.edu.uniquindio.observeractualizar.parcial2;
}