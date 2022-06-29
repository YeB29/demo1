package com.example.demo1.Controller;

import com.example.demo1.HelloApplication;
import com.example.demo1.Model.Observer.RentManager;
import com.example.demo1.Model.Products.Product;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.io.PipedReader;
import java.util.Observable;
import java.util.Observer;

public class OverzichtController extends SceneController implements RentManager {

    @FXML
    private TableView<Product> productenItems;

    @FXML
    private TableColumn<Product, String> column1;

    @FXML
    private TableColumn<Product, String> column2;

    @FXML
    private TableColumn<Product, Boolean> column3;

    public void terug(ActionEvent actionEvent) throws IOException {
        Stage stage = new Stage();
        AnchorPane root = FXMLLoader.load(HelloApplication.class.getResource("Menu-view.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void initialize(){
        ObservableList<Product> data = FXCollections.observableArrayList();

        column1.setCellValueFactory(new PropertyValueFactory<>("naam"));

        column2.setCellValueFactory(new PropertyValueFactory<>("beschrijving"));

        column3.setCellValueFactory(new PropertyValueFactory<>("verhuurd"));

        productenItems.setItems(data);

    }

    @Override
    public void update() {

    }
    public void SelectItem(MouseEvent mouseEvent) {

    }


}
