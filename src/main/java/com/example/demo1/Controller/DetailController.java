package com.example.demo1.Controller;

import com.example.demo1.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class DetailController {
    public void terug(ActionEvent actionEvent) throws IOException {
        Stage stage = new Stage();
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Overzicht-view.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
