package com.codedifferently.lab.partB;

public class Coin {
    private String name;
    private double value;

    public Coin() {  //
        this.name = "Penny";
        this.value = 0.01;
    }

    public Coin(String name, double value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public double getValue() {
        return value;
    }


    public String toString() {
        return "Coin{name='" + name + "', value =" + value +" }";
    }
}


