package com.example.demo1.Model.Products;

public class VrachtAuto  extends Product{
    private int laadvermogen;
    private int gewicht;

    public VrachtAuto(int laadvermogen, int gewicht){
        this.laadvermogen = laadvermogen;
        this.gewicht = gewicht;
    }

    public VrachtAuto() {

    }

    @Override
    public double DagPrijs(){
        return laadvermogen * 0.1;
    }
    @Override
    public double VerzekeringsPrijs(){
        return gewicht * 0.01;
    }

    public void setInformatie1(String laadvermogen) {
        this.laadvermogen = Integer.parseInt(laadvermogen);

    }
    public void setInformatie2(String gewicht) {
        this.gewicht = Integer.parseInt(gewicht);

    }
}