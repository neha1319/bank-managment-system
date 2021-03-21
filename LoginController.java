package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.io.*;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;

import static javafx.application.Application.launch;
import static javafx.scene.layout.BackgroundPosition.*;

public class LoginController {

    boolean flag1 = true;

    @FXML
    public TextField txtUsername;

    @FXML
    public PasswordField txPassword;

    public LoginController() throws FileNotFoundException {
    }


    public void selection(ActionEvent event) throws IOException {

        String txtUsernameinput = txtUsername.getText();
        System.out.println(txtUsernameinput);

        String txPasswordinput = txPassword.getText();
        System.out.println(txPasswordinput);

        File f1 = new File("Username.txt");
        Scanner scan = new Scanner((f1));

        File f2= new File("Password.txt");
        Scanner scan1= new Scanner((f2));

        while (scan.hasNext()) {
            String username = scan.next();
            System.out.println(username);

            String password = scan1.next();
            System.out.println(password);

            if (username.equals(txtUsernameinput) && password.equals(txPasswordinput)) {
                Parent selection = FXMLLoader.load(getClass().getResource("Selection.fxml"));
                Scene selection1 = new Scene(selection);
                Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
                window.setScene(selection1);
                window.show();
                flag1 = false;

            }
        }

        if(flag1){
            Parent selection = FXMLLoader.load(getClass().getResource("AlertBox.fxml"));
            Scene selection1 = new Scene(selection);

            Stage window = new Stage();

            window.setScene(selection1);
            window.show();
         }


    }

}
