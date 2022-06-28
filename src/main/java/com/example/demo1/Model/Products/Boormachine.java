package com.example.demo1.Model.Products;

public class Boormachine extends Product{
    private String merk;
    private String type;

    public Boormachine(String merk, String type){
        this.merk = merk;
        this.type = type;
    }

    public Boormachine() {

    }

    @Override
    public double DagPrijs(){
        return 5.0;
    }
    @Override
    public double VerzekeringsPrijs(){
        return 1.0;
    }

    public void setInformatie1(String merk) {
        this.merk = merk;

    }
    public void setInformatie2(String type) {
        this.type = type;

    }
}
