package com.example.demo1.Model.Products;

public class PersonenAuto extends Product{
    private String merk;
    private int gewicht;

    public PersonenAuto(String merk, int gewicht){
        this.merk = merk;
        this.gewicht = gewicht;
    }

    public PersonenAuto() {

    }


    @Override
    public double DagPrijs(){
        return 50.0;
    }
    @Override
    public double VerzekeringsPrijs(){
        return gewicht * 0.01;
    }

    public void setInformatie1(String merk) {
        this.merk = merk;

    }
    public void setInformatie2(String gewicht) {
        this.gewicht = Integer.parseInt(gewicht);

    }
}
