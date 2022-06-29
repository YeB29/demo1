package com.example.demo1.Model.Abstract;

import com.example.demo1.Model.Products.Boormachine;
import com.example.demo1.Model.Products.Product;
import com.example.demo1.Model.Products.VrachtAuto;

public class BoormachineFac implements AbstractFactory{
    @Override
    public Product create() {
        return new Boormachine();
    }
}
