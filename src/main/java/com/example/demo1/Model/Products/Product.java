package com.example.demo1.Model.Products;

public abstract class Product {

    public void Caller(){

        VerzekeringsPrijs();
        DagPrijs();
    }


    public abstract void setInformatie1(String info1);
    public abstract void setInformatie2(String info2);
    public abstract double VerzekeringsPrijs();
    public abstract double DagPrijs();
}
