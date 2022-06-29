package com.example.demo1.Controller;

import com.example.demo1.Model.Login.Medewerker;
import com.example.demo1.Model.Products.Product;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.util.Objects;

public class ReserverenController  {
    public Product product;
    @FXML
    private Label titel;

    @FXML private Label beschrijving;

    @FXML private AnchorPane reserveren;
    private Medewerker medewerker;

    public void setProduct(Product product) {
        setTitel();
        setBeschrijving();
        try {
            setReserveren();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void setTitel(){this.titel.setText("reserveer");}

    private void setBeschrijving(){this.beschrijving.setText("beschrijving");}

    private void setReserveren() throws IOException {



    }
}
