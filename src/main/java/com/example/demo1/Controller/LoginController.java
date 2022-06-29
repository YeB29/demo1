package com.example.demo1.Controller;

import com.example.demo1.HelloApplication;
import com.example.demo1.Model.Login.Login;
import com.example.demo1.Model.Login.Medewerker;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Observable;

public class LoginController extends SceneController{
    @FXML
    private Button loginButton;
    @FXML
    private TextField usernameInput;
    @FXML
    private PasswordField passwordInput;



    public void OnLoginButtonClick(ActionEvent actionEvent) throws IOException {
        String username = usernameInput.getText();
        String password = passwordInput.getText();

        Medewerker werknemer = Login.login(username, password);
       if(!werknemer.isStatus()) {
           Stage stage = new Stage();
           AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Menu-view.fxml"));
           Scene scene = new Scene(root);
           stage.setUserData(werknemer);
           stage.setScene(scene);
           stage.show();
       }
       werknemer.setStatusIn();

    }

    @Override
    public void update() {

    }
}