package com.ptitbapt.celsusandfahrenheitrolegames.model;

public class Temperature {
    private double Celsius;
    private double Fare;

    public Temperature(double celsius, double fare) {
        Celsius = celsius;
        Fare = fare;
    }

    public double getCelsius() {
        return Celsius;
    }

    public void setCelsius(double celsius) {
        Celsius = celsius;
    }

    public double getFare() {
        return Fare;
    }

    public void setFare(double fare) {
        Fare = fare;
    }


    @Override
    public String toString() {
        return "Temperature{" +
                "Celsius=" + Celsius +
                ", Fare=" + Fare +
                '}';
    }
}
