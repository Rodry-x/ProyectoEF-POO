package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;

public class PanelProfesorController {
    SceneController sceneController = new SceneController();

    @FXML
    void cambiarAPanelAulaVirtual(MouseEvent event) {

    }

    @FXML
    void cambiarAPanelConfiguracion(MouseEvent event) {

    }

    @FXML
    void cambiarAPanelLoginAdmin(ActionEvent event) {
        sceneController.cambiarAPanelLoginProfesor(event);
    }

}