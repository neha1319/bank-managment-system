package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class CashAmountController {
    public void CashAmount(ActionEvent event) throws IOException {
        Parent selection = FXMLLoader.load(getClass().getResource("CashAmount.fxml"));
        Scene selection1 = new Scene(selection);

        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        window.setScene(selection1);
        window.show();
    }
    public void backtoMainAddition(ActionEvent event) throws IOException {
        Parent selection = FXMLLoader.load(getClass().getResource("MainAddition.fxml"));
        Scene selection1 = new Scene(selection);

        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        window.setScene(selection1);
        window.show();
    }

}
