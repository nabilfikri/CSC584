package inheritance;

public class Vehicle {
    public String make;
    public String model;

    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public void start() {
        System.out.println("Starting the " + make + " " + model + ".");
    }

    public void drive() {
        System.out.println("Driving the " + make + " " + model + " on the highway.");
    }
}