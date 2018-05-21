package com.company;

public class Engine {
    int horsepower;

    public Engine(int horsepower) {
        this.horsepower = horsepower;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "horsepower=" + horsepower +
                '}';
    }
}
