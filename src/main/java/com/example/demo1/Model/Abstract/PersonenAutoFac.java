package com.example.demo1.Model.Abstract;

import com.example.demo1.Model.Products.PersonenAuto;
import com.example.demo1.Model.Products.Product;
import com.example.demo1.Model.Products.VrachtAuto;

public class PersonenAutoFac implements AbstractFactory{
    @Override
    public Product create() {
        return new PersonenAuto();
    }
}
