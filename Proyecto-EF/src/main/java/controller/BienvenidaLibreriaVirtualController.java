package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class BienvenidaLibreriaVirtualController {
    //Usando la clase SceneController para cambiar de escenas
    private final SceneController sceneController = new SceneController();

    @FXML
    void cambiarAEstanteria(ActionEvent event) {
        sceneController.cambiarAEstanteriaVirtual(event);
    }
    @FXML
    void cambiarAPanelLoginAdmin(ActionEvent event) {
        sceneController.cambiarAPanelLoginProfesor(event);
    }
    @FXML
    void cambiarAlPanelLoginEstudiante(ActionEvent event) {
        sceneController.cambiarAlPanelLoginEstudiante(event);
    }
}
