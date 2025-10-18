package org.example.task3;

public class Smartphone implements GPS, Cellular {

    private final String model;
    private double latitude;
    private double longitude;

    public Smartphone(String model, double latitude, double longitude) {
        this.model = model;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    @Override
    public double[] getCoordinates() {
        return new double[]{this.latitude, this.longitude};
    }

    @Override
    public void makeCall() {
        System.out.println(model + ": виконує вихідний дзвінок...");
    }

    @Override
    public void receiveCall() {
        System.out.println(model + ": приймає вхідний виклик.");
    }

    public void printLocation() {
        System.out.println("Місцезнаходження " + model + ": (" + latitude + ", " + longitude + ")");
    }
}