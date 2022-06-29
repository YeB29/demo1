package com.example.demo1.Model.Observer;

import java.util.ArrayList;
import java.util.List;

public class RentManager {
    private static final List<RentListner> observers = new ArrayList<>();

    public static void addObserver(RentListner observer){
        observers.add(observer);
    }

    public static void deleteObserver(RentListner observer){
        observers.remove(observer);
    }

    public static void update(){
        for(RentListner observer: observers){
            observer.update();
        }
    }
}


