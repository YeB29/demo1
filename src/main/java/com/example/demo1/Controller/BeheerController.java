package com.example.demo1.Controller;

import com.example.demo1.HelloApplication;
import com.example.demo1.Model.Products.Product;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class BeheerController {
    @FXML
    private ListView soorten;

    public void terug(ActionEvent actionEvent) throws IOException {
        Stage stage = new Stage();
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Menu-view.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


    public void SelectProduct(MouseEvent mouseEvent) throws IOException {
        int product = soorten.getSelectionModel().getSelectedIndex();
        if(product != -1) {

            AnchorPane root =  FXMLLoader.load(HelloApplication.class.getResource( "Toevoegen-view.fxml"));
            Stage stage = (Stage) ((Node) mouseEvent.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
    }
    public void initialize(){
        List<String> producten = new ArrayList();
        producten.add("Boormachine");
        producten.add("PersonenAuto");
        producten.add("VrachtAuto");

        ObservableList<String> item = FXCollections.observableArrayList(producten);

        soorten.setItems(item);
    }
}
