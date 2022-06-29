package com.example.demo1.Controller;


import com.example.demo1.Model.Login.Medewerker;
import com.example.demo1.Model.Observer.RentListner;
import com.example.demo1.Model.Observer.RentManager;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.*;

public abstract class SceneController implements EventHandler<ActionEvent> {
    public static List<Medewerker> ingelogd = new ArrayList();

    public Medewerker medewerker;

    public void setMedewerker(Medewerker newMedewerker){this.medewerker = newMedewerker;}

    @Override
    public void handle(ActionEvent event) {

        Stage stage = new Stage();;
        Parent root;
        FXMLLoader loader = new FXMLLoader(Objects.requireNonNull(SceneController.class.getResource(stage + "-view.fxml")));
        try {
            root = loader.load();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


    @Override
    public void update() {

    }
}

