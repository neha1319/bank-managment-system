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

public class MainAdditionController {
    public void gotoMainAddition(ActionEvent event) throws IOException {
        Parent balance = FXMLLoader.load(getClass().getResource("MainAddition.fxml"));
        Scene balance1 = new Scene(balance);

        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        window.setScene(balance1);
        window.show();
    }
    @FXML
    public static  String  txtAddAmountinput;


    @FXML
    public TextField txtAddAmount;

    public void gotoAddAmount(ActionEvent event) throws IOException {
        txtAddAmountinput=txtAddAmount.getText();
        System.out.println(txtAddAmountinput);

        Parent balance = FXMLLoader.load(getClass().getResource("AddAmount.fxml"));
        Scene balance1 = new Scene(balance);

        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        window.setScene(balance1);
        window.show();
    }
    public void gotoATM(ActionEvent event) throws IOException {

        Parent balance = FXMLLoader.load(getClass().getResource("ATM.fxml"));
        Scene balance1 = new Scene(balance);

        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        window.setScene(balance1);
        window.show();
    }
    public void gotoCashAmount(ActionEvent event) throws IOException {
        Parent balance = FXMLLoader.load(getClass().getResource("CashAmount.fxml"));
        Scene balance1 = new Scene(balance);

        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        window.setScene(balance1);
        window.show();
    }

    public void gotoFinalDetails(ActionEvent event) throws IOException {

        Parent balance = FXMLLoader.load(getClass().getResource("FinalDetails.fxml"));
        Scene balance1 = new Scene(balance);

        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        window.setScene(balance1);
        window.show();
    }
    public void backtoDeposit(ActionEvent event) throws IOException {
        Parent balance = FXMLLoader.load(getClass().getResource("Deposit.fxml"));
        Scene balance1 = new Scene(balance);

        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        window.setScene(balance1);
        window.show();
    }
}
