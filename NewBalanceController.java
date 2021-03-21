package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class NewBalanceController {
    public void selection(ActionEvent event) throws IOException {
        Parent selection = FXMLLoader.load(getClass().getResource("NewBalance.fxml"));
        Scene selection1 = new Scene(selection);

        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        window.setScene(selection1);
        window.show();
    }
    @FXML
    public TextField lblDepositSuccessfully;

    public void setLblDepositSuccessfully()throws InterruptedException,IOException{
        lblDepositSuccessfully.setText(MainCashOutController.txtDepositinput);

    }
    public void backtoMainCashOut(ActionEvent event) throws IOException {
        Parent selection = FXMLLoader.load(getClass().getResource("MainCashOut.fxml"));
        Scene selection1 = new Scene(selection);

        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        window.setScene(selection1);
        window.show();
    }
}