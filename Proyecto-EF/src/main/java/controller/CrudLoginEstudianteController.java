package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class CrudLoginEstudianteController {
    //Usando la clase SceneController para cambiar de escenas
    private final SceneController sceneController = new SceneController();

    @FXML
    private TextField txtContrasenia;
    @FXML
    private TextField txtEmail;


    @FXML
    void cambiarAlPanelPrincipal(ActionEvent event) {
        sceneController.cambiarABienvenidaLibreriaVirtual(event);
    }

    @FXML
    void iniciarSesion(ActionEvent event) {
        sceneController.cambiarAlPanelEstudiantes(event);
        LimpiarCasillasController.limpiar(txtContrasenia, txtEmail);

    }

}
