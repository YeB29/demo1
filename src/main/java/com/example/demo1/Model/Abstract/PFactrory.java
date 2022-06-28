package com.example.demo1.Model.Abstract;

import com.example.demo1.Model.Products.Boormachine;
import com.example.demo1.Model.Products.PersonenAuto;
import com.example.demo1.Model.Products.Product;
import com.example.demo1.Model.Products.VrachtAuto;

import java.io.IOException;

public class PFactrory  implements AbstractFactory {
    @Override
    public Product create(String type) throws IOException {
        if ("Boormachine".equalsIgnoreCase(type)){
            return new Boormachine();
        } else if ("Personenauto".equalsIgnoreCase(type)) {
            return new PersonenAuto();
        } else if ("Vrachtauto".equalsIgnoreCase(type)) {
            return new VrachtAuto();
        }
        return null;
    }
}
