// src/main/java/controller/SceneController.java
package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import utilities.Paths;

import java.io.IOException;

public class SceneController {

    public void cambiarEscena(ActionEvent event, String rutaFXML) {
        cambiarEscena((Node) event.getSource(), rutaFXML);
    }

    // Posiblemente se use en un futuro
    public void cambiarEscena(MouseEvent event, String rutaFXML) {
        cambiarEscena((Node) event.getSource(), rutaFXML);
    }

    // Haciendo la logica para poder cambiar de escena
    private void cambiarEscena(Node source, String rutaFXML) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource(rutaFXML));
            Stage stage = (Stage) source.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace(); // Imprimir el mensaje de error en la consola
        }
    }

    //Haciendo la logica para el evento Mouse Event y añadiendo el Nombre del Libro
    public void cambiarACrudLibros(MouseEvent event, String nombreLibro) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(Paths.PANEL_LIBROS_FXML));
            Parent root = loader.load();
            CrudLibrosController controller = loader.getController();
            controller.setNombreDelLibro(nombreLibro);

            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void cambiarAEstanteriaVirtual(ActionEvent event){
        cambiarEscena(event, Paths.PANEL_ESTANTERIA_FXML);
    }

    public void cambiarABienvenidaLibreriaVirtual(ActionEvent event){
        cambiarEscena(event, Paths.PANEL_PRINCIPAL_FXML);
    }
}