package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

import java.io.IOException;

public class DepositController {
    public void deposit(ActionEvent event) throws IOException {
        Parent selection = FXMLLoader.load(getClass().getResource("Deposit.fxml"));
        Scene selection1 = new Scene(selection);

        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        window.setScene(selection1);
        window.show();
    }
    public void gotoMainAddition(ActionEvent event) throws IOException {
        Parent selection = FXMLLoader.load(getClass().getResource("MainAddition.fxml"));
        Scene selection1 = new Scene(selection);

        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        window.setScene(selection1);
        window.show();
    }
    public void backtoSelection(ActionEvent event) throws IOException {
        Parent selection = FXMLLoader.load(getClass().getResource("Selection.fxml"));
        Scene selection1 = new Scene(selection);

        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        window.setScene(selection1);
        window.show();
    }

}
