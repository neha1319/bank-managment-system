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

public class FinalDetailsController {
    public void FinalDetails(ActionEvent event) throws IOException {
        Parent selection = FXMLLoader.load(getClass().getResource("FinalDetails.fxml"));
        Scene selection1 = new Scene(selection);

        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        window.setScene(selection1);
        window.show();
    }
    @FXML
    public TextField lblDetails;
    public TextField lb1Details;
    public TextField lb2Details;
    public TextField lb3Details;
    public TextField lb4Details;
    public TextField lb7Details;
    public TextField lb8Details;
    public TextField lb9Details;
    public TextField lb0Details;
    public TextField lb10Details;

    public void setDetails()throws InterruptedException,IOException{
        Account a2=new Account();
        a2.setAccountName("Shanzay");
        String o=a2.getAccountName();
        a2.setAccountNumber("KPD2380Y");
        String u=a2.getAccountNumber();
        a2.getBalance();
        double l=a2.getBalance();
        String l1=String.valueOf(l);
        ATMCard atm1=new ATMCard();
        atm1.setPin(3210);
        int d=atm1.getPin();
        String d1=String.valueOf(d);

        atm1.setBarCode("EW132P");
        String code=atm1.getBarCode();
        Citizen c=new Citizen();
        c.setAddress("Malir Colony..");
        String c1=c.getAddress();
        Foregin f1=new Foregin();
        f1.setNationality("Pakistani");
        String a=f1.getNationality();
        f1.setPassPortNo("DEQ23L81");
        String e=f1.getPassPortNo();
        f1.setAccType("Personal");
        String y=f1.getAccType();

        lblDetails.setText(o);
        lb1Details.setText(u);
        lb2Details.setText(d1);
        lb3Details.setText(code);
        lb4Details.setText(l1);
        lb7Details.setText(c1);
        lb8Details.setText(a);
        lb9Details.setText(MainCashOutController.txTransactioninput);
        lb0Details.setText(e);
        lb10Details.setText(y);

    }
    public void backtoMainAddition(ActionEvent event) throws IOException {
        Parent selection = FXMLLoader.load(getClass().getResource("MainAddition.fxml"));
        Scene selection1 = new Scene(selection);

        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        window.setScene(selection1);
        window.show();
    }

}
