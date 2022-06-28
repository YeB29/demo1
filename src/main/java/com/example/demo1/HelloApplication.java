package com.example.demo1;

import com.example.demo1.Model.Login.Login;
import com.example.demo1.Model.Login.Medewerker;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Login-view.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {

        Medewerker medewerker = new Medewerker("y", "1");
        Login.users.add(medewerker);
        launch();
    }
}