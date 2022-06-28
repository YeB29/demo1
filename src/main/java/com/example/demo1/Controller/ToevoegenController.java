package com.example.demo1.Controller;

import com.example.demo1.HelloApplication;
import com.example.demo1.Model.Products.Boormachine;
import com.example.demo1.Model.Products.Product;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class ToevoegenController {
    @FXML
     protected TextField ptit;
    @FXML
    protected TextField info1Field;
    @FXML
    protected TextField info2Field;

    @FXML
    protected Label info2Label;
    @FXML
    protected Label info1Label;


    public void setInfo(ActionEvent actionEvent) {
//        Product soort = null;
//        for(Product p : ) {
//            if (){
//            }
//
//        }
//
//        String info1 = info1Field.getText();
//        String info2 = info2Field.getText();
//



    }

    public void terug(ActionEvent actionEvent) throws IOException {
        Stage stage = new Stage();
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Beheer-view.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
