package controller;

import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.scene.input.MouseEvent;

public class EstanteriaVirtualController {
    //Usando la clase SceneController para cambiar de escenas
    private final SceneController sceneController = new SceneController();

    @FXML
    void cambiarALibroCienciaYAmbiente(MouseEvent event) {
        //Cambiando de escena y poniendo el nombre del libro
        sceneController.cambiarACrudLibros(event, "Ciencia y Ambiente");

    }

    @FXML
    void cambiarALibroCienciasSociales(MouseEvent event) {
        sceneController.cambiarACrudLibros(event, "Ciencias Sociales");

    }

    @FXML
    void cambiarALibroComunicacion(MouseEvent event) {
        sceneController.cambiarACrudLibros(event, "Comunicación");
    }

    @FXML
    void cambiarALibroHistoria(MouseEvent event) {
        sceneController.cambiarACrudLibros(event, "Historia");
    }

    @FXML
    void cambiarALibroMatematicas(MouseEvent event) {
        sceneController.cambiarACrudLibros(event, "Matemáticas");
    }

    @FXML
    void cambiarALibroRazMatematico(MouseEvent event) {
        sceneController.cambiarACrudLibros(event, "Razonamiento Matemático");
    }

    @FXML
    void cambiarALibroRazVerbal(MouseEvent event) {
        sceneController.cambiarACrudLibros(event, "Razonamiento Verbal");
    }

    @FXML
    void cambiarALibroReligion(MouseEvent event) {
        sceneController.cambiarACrudLibros(event, "Religión");
    }

    @FXML
    void cambiarAPanelPrincipal(ActionEvent event) {
        sceneController.cambiarABienvenidaLibreriaVirtual(event);
    }
}
