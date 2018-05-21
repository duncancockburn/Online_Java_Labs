package com.company;

public class Vehicle {
    String model;
    String make;
    int kmg;
    String colour;
    Engine engine;
    double miles;
    Part part;

    public Vehicle(String model, String make, int kmg, String colour, Engine engine, Part part) {
        this.model = model;
        this.make = make;
        this.kmg = kmg;
        this.colour = colour;
        this.engine = engine;
        this.part = part;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "model='" + model + '\'' +
                ", make='" + make + '\'' +
                ", kmg=" + kmg +
                ", colour='" + colour + '\'' +
                ", engine=" + engine.toString() +
                ", miles=" + miles +
                ", part=" + part.toString() +
                '}';
    }
}
