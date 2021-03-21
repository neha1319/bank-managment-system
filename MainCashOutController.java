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

public class MainCashOutController{
    @FXML
    public static  String  txtDepositinput;
    public static String   textCashinput;
    public static String   txTransactioninput;
    public static String   txtTransTypeinput;


    @FXML
    public TextField textCash;

    public void gotoMainCashOut(ActionEvent event) throws IOException {
        Parent balance = FXMLLoader.load(getClass().getResource("MainCashOut.fxml"));
        Scene balance1 = new Scene(balance);

        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        window.setScene(balance1);
        window.show();
    }
    public void gotoCash(ActionEvent event) throws IOException {
        textCashinput = textCash.getText();
        System.out.println(textCashinput);

        Parent balance = FXMLLoader.load(getClass().getResource("Cash.fxml"));
        Scene balance1 = new Scene(balance);

        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        window.setScene(balance1);
        window.show();
    }
    @FXML
    public TextField txtDeposit;

    public void gotoNewBalance(ActionEvent event) throws IOException {
        txtDepositinput = txtDeposit.getText();
        System.out.println(txtDepositinput);

        Parent balance = FXMLLoader.load(getClass().getResource("NewBalance.fxml"));
        Scene balance1 = new Scene(balance);

        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        window.setScene(balance1);
        window.show();
    }

    @FXML
    public TextField txTransaction;
    public TextField txtTransType;

    public void gotoTransaction(ActionEvent event) throws IOException {

        txTransactioninput=txTransaction.getText();
        System.out.println(txTransactioninput);

        txtTransTypeinput=txtTransType.getText();
        System.out.println(txtTransTypeinput);


        Parent balance = FXMLLoader.load(getClass().getResource("TransactionDone.fxml"));
        Scene balance1 = new Scene(balance);

        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        window.setScene(balance1);
        window.show();
    }
    public void backtoDetails(ActionEvent event) throws IOException {
        Parent balance = FXMLLoader.load(getClass().getResource("Details.fxml"));
        Scene balance1 = new Scene(balance);

        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        window.setScene(balance1);
        window.show();
    }

}