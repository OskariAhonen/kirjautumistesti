package javass;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import javax.swing.*;

public class Main extends Application {

    public static void main(String [] args) {
        launch(args);
    }

    @Override
    public void start(Stage window) throws Exception {
   window.setTitle("Kirjautuminen / log in");
   GridPane grid = new GridPane();
   grid.setPadding( new Insets(10,10,10,10));
   grid.setVgap(8);
   grid.setHgap(10);
   Text otsikko = new Text("Kirjautuminen / log in");
   GridPane.setConstraints(otsikko, 2, 0);
        Label nameLabel = new Label("Nimi: ");
        GridPane.setConstraints(nameLabel,1,1);

        TextField nameInput = new TextField();
        nameInput.setPromptText("Käyttäjätunnus");
        GridPane.setConstraints(nameInput,2,1);

        Label passLabel = new Label("Salasana: ");
        GridPane.setConstraints(passLabel,1,2);

        PasswordField passInput = new PasswordField();
        passInput.setPromptText("salasana");
        GridPane.setConstraints(passInput,2,2);

        Button login = new Button("Kirjaudu sisään");
        GridPane.setConstraints(login, 2,3);
        login.setOnAction(e -> {
            Popup.sure(nameInput.getText(), passInput.getText());
        });
        grid.getChildren().addAll(otsikko, nameLabel, nameInput, passLabel, passInput, login);
        grid.setAlignment(Pos.CENTER);


        Scene scene = new Scene(grid, 300,250);
        window.setScene(scene);
   window.show();
    }

}
