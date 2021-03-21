package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class AlertBox {
    public void alert(ActionEvent event) throws IOException {
        Parent alert= FXMLLoader.load(getClass().getResource("AlertBox.fxml"));
        Scene alert1 = new Scene(alert);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

        window.setScene(alert1);
        window.show();
    }
}
