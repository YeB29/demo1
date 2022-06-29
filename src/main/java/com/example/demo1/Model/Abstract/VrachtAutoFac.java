package com.example.demo1.Model.Abstract;

import com.example.demo1.Model.Products.Product;
import com.example.demo1.Model.Products.VrachtAuto;

public class VrachtAutoFac implements AbstractFactory{
    @Override
    public Product create() {
        return new VrachtAuto();
    }
}
