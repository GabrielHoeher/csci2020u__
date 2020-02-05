package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.GridPane;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(10,10,10,10));
        pane.setVgap(5);
        pane.setHgap(5);

        TextField user = new TextField();
        PasswordField pass = new PasswordField();
        TextField full = new TextField();
        TextField email = new TextField();
        TextField phone = new TextField();
        DatePicker dob = new DatePicker();

        pane.add(new Label("Username:"),0,0);
        user.setPromptText("ColiKong");
        pane.add(user, 1,0);
        pass.setPromptText("password");
        pane.add(new Label("Password:"), 0,1);
        pane.add(pass, 1,1);
        full.setPromptText("Colin Rebelo");
        pane.add(new Label("Full Name:"), 0 , 2);
        pane.add(full, 1 ,2);
        email.setPromptText("colinR@gmail.com");
        pane.add(new Label("E-Mail:"), 0 , 3);
        pane.add(email, 1 ,3);
        phone.setPromptText("439-310-3300");
        pane.add(new Label("Phone #:"), 0 , 4);
        pane.add(phone, 1 ,4);
        pane.add(new Label("Date of Birth:"), 0 , 5);
        pane.add(dob, 1 ,5);

        Button btAdd = new Button("Register");
        pane.add(btAdd, 1,7);

        btAdd.setOnAction(button -> {
            System.out.println("Username: " + user.getText());
            System.out.println("Password: " + pass.getText());
            System.out.println("Full Name: " + full.getText());
            System.out.println("E-Mail: " + email.getText());
            System.out.println("Phone #: " + String.valueOf(phone.getText()).replaceFirst("(\\d{3})(\\d{3})(\\d+)", "($1)-$2-$3"));
            System.out.println("Date of Birth: " + dob.getValue());
        });
        GridPane.setHalignment(btAdd, HPos.RIGHT);

        Scene scene = new Scene(pane, 300, 275);
        primaryStage.setScene(scene);

        primaryStage.setTitle("Lab04");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) { launch(args); }
}
