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

public class AddAmountController {
    public void AddAmount(ActionEvent event) throws IOException {
        Parent selection = FXMLLoader.load(getClass().getResource("AddAmount.fxml"));
        Scene selection1 = new Scene(selection);

        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        window.setScene(selection1);
        window.show();
    }
    @FXML
    public TextField lblNewDetails;
    public  TextField lbNewDetails;
    public  TextField lNewDetails;
    public  TextField lbeNewDetails;
    public  TextField llNewDetails;
    public  TextField lqNewDetails;
    public  TextField luNewDetails;

    public void setNewDetails()throws InterruptedException,IOException{
        Account A1=new Account();
        A1.setAccountName("Neha Ali");
        A1.setAccountNumber("QWE1E0031");
        A1.setBalance(3000);
        double v=A1.getBalance();
        String v1=String.valueOf(v);
        ATMCard atm=new ATMCard();
        atm.setPin(3210);
        String  name = A1.getAccountName();
        String accN = A1.getAccountNumber();
        int p = atm.getPin();
        String p1=String.valueOf(p);

        lblNewDetails.setText(name);
        lbNewDetails.setText(accN);
        lNewDetails.setText(p1);
        lbeNewDetails.setText(MainCashOutController.txTransactioninput);
        llNewDetails.setText(v1);
        lqNewDetails.setText(String.valueOf(0.02));
        luNewDetails.setText(MainCashOutController.txtDepositinput);

    }
    public void backtoMainAddition(ActionEvent event) throws IOException {
        Parent selection = FXMLLoader.load(getClass().getResource("MainAddition.fxml"));
        Scene selection1 = new Scene(selection);

        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        window.setScene(selection1);
        window.show();
    }

}
