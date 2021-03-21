package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

import java.io.IOException;

public class DetailsController{
    public void details(ActionEvent event) throws IOException {
        Parent selection = FXMLLoader.load(getClass().getResource("Details.fxml"));
        Scene selection1 = new Scene(selection);
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setScene(selection1);
        window.show();
    }
    public void gotoMainCashOut(ActionEvent event) throws IOException {
        Parent details = FXMLLoader.load(getClass().getResource("MainCashOut.fxml"));
        Scene details1 = new Scene(details);
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setScene(details1);
        window.show();
    }
    public void backtoSelection(ActionEvent event) throws IOException {
        Parent details = FXMLLoader.load(getClass().getResource("Selection.fxml"));
        Scene details1 = new Scene(details);
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setScene(details1);
        window.show();
    }



}
