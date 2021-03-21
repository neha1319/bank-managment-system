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

public class CashController {
    public void cash(ActionEvent event) throws IOException {
        Parent cash= FXMLLoader.load(getClass().getResource("Cash.fxml"));
        Scene cash1 = new Scene(cash);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

        window.setScene(cash1);
        window.show();
    }
    @FXML
    public TextField lblCashOutSuccessfully;

    public void setLblCashOutSuccessfully()throws InterruptedException,IOException{
        lblCashOutSuccessfully.setText(MainCashOutController.textCashinput);


    }
    public void backtoMainCashOut(ActionEvent event) throws IOException {
        Parent cash= FXMLLoader.load(getClass().getResource("MainCashOut.fxml"));
        Scene cash1 = new Scene(cash);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

        window.setScene(cash1);
        window.show();
    }
}