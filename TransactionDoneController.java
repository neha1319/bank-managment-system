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

public class TransactionDoneController {
    public void selection(ActionEvent event) throws IOException {
        Parent selection = FXMLLoader.load(getClass().getResource("TransactionDone.fxml"));
        Scene selection1 = new Scene(selection);

        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        window.setScene(selection1);
        window.show();
    }
    @FXML
    public TextField lblTransDetails;
    public TextField lbTransDetails;
    public TextField lTransDetails;
    public TextField llTransDetails;
    public TextField lbeTransDetails;

    public void setTransactionDetails()throws InterruptedException,IOException{
        Transaction t1 = new Transaction();
        t1.setAmount(21000);
        double amount = t1.getAmount();
        String amount1 = String.valueOf(amount);
        lblTransDetails.setText(MainCashOutController.txTransactioninput);
        lbTransDetails.setText("true");
        lTransDetails.setText(amount1);
        llTransDetails.setText(MainCashOutController.txtTransTypeinput);
        lbeTransDetails.setText(amount1+MainCashOutController.txTransactioninput);

    }
    public void backtoMainCashOut(ActionEvent event) throws IOException {
        Parent selection = FXMLLoader.load(getClass().getResource("MainCashOut.fxml"));
        Scene selection1 = new Scene(selection);

        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        window.setScene(selection1);
        window.show();
    }

}
