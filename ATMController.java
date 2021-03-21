package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class ATMController {
    public void selection(ActionEvent event) throws IOException {
        Parent selection = FXMLLoader.load(getClass().getResource("ATM.fxml"));
        Scene selection1 = new Scene(selection);

        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        window.setScene(selection1);
        window.show();
    }
    @FXML
    public TextField lblWelcomeToATMMachine;
    public TextField lbWelcomeToATMMachine;

    public void setWelcomeToATMMachine()throws InterruptedException,IOException{
        lblWelcomeToATMMachine.setText(MainAdditionController.txtAddAmountinput);
        lbWelcomeToATMMachine.setText(MainAdditionController.txtAddAmountinput);
    }
    public void backtoMainAddition(ActionEvent event) throws IOException {
        Parent selection = FXMLLoader.load(getClass().getResource("MainAddition.fxml"));
        Scene selection1 = new Scene(selection);

        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        window.setScene(selection1);
        window.show();
    }

}
