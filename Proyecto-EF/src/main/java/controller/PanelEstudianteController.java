package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;

public class PanelEstudianteController {

    SceneController sceneController = new SceneController();

    @FXML
    void cambiarAEstanteriaVirtual(MouseEvent event) {
        sceneController.cambiarAEstanteriaVirtual(event);
    }

    @FXML
    void cambiarAPanelConfiguracion(MouseEvent event) {

    }

    @FXML
    void cambiarAPanelVerProfesores(MouseEvent event) {

    }

    @FXML
    void cambiarAPanelLoginEstudiante(ActionEvent event) {
        sceneController.cambiarAlPanelLoginEstudiante(event);
    }

}