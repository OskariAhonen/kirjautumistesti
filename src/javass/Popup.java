package javass;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;

import javax.swing.*;

public class Popup {
    public static void sure(String login, String sala) {
        Stage window = new Stage();
        Button close = new Button("sulje");
        Label text = new Label();
        close.setOnAction(e -> window.close());
            if (login.equals("nimi") && sala.equals("salasana")){
            text.setText("Oikein!");
            window.setTitle("Oikein");
            window.close();
                } else {
            text.setText("Väärin");
            window.setTitle("Väärin");
            window.close();
        }
        VBox VBox = new VBox(25);
            VBox.getChildren().addAll(text, close);
            VBox.setAlignment(Pos.CENTER);
        window.initModality(Modality.APPLICATION_MODAL);
        Scene scene = new Scene(VBox, 200,250);
        window.setScene(scene);
        window.showAndWait();
    }
}
