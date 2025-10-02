package controller;

import javafx.scene.control.TextField;

public class LimpiarCasillasController {

    public static void limpiar(TextField... campos) {
        for (TextField campo : campos) {
            if (campo != null) {
                campo.setText("");
            }
        }
    }
}
