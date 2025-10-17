package Controllers;

import Models.AlertBox;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MenuController {

    @FXML
    private void onIniciarClicked(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/sudoku_express/SudokuView.fxml"));
        Parent root = loader.load();

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("Sudoku 6x6");
        AlertBox alertBox = new AlertBox();
        alertBox.showAlertBox("INICIO DE SUDOKU",
                "ESTAS A PUNTO DE INICIAR UN JUEGO"
                ,"LISTOS PARA COMENZAR");

        stage.show();
    }

    @FXML
    private void onSalirClicked(ActionEvent event) {
        System.exit(0);
    }
}
