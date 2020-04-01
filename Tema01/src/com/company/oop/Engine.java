package com.company.oop;

public class Engine {
    private double cc;
    private String Fuel;

    public Engine(double cc, String fuel) {
        this.cc = cc;
        Fuel = fuel;
    }

    public double getCc() {
        return cc;
    }

    public String getFuel() {
        return Fuel;
    }
}
