package com.company.oop;

public class Car {
    private String model;
    private Engine engine;

    public Car(String model, double cc, String fuel) {
        this.model = model;
        this.engine = new Engine(cc, fuel);
    }

    public Car() {
    }

    public String getModel() {
        return model;
    }

    public Engine getEngine() {
        return engine;
    }
}
