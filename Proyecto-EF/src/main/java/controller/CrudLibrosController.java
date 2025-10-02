package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class CrudLibrosController {
    //Usando la clase SceneController para cambiar de escenas
    private final SceneController sceneController = new SceneController();

    @FXML
    private Label lblNombreDelLibro;

    public void setNombreDelLibro(String nombre) {
        lblNombreDelLibro.setText(nombre);
    }

    @FXML
    void cambiarAEstanteria(ActionEvent event) {
        sceneController.cambiarAEstanteriaVirtual(event);
    }

}