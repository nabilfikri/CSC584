package inheritance;

public class Motorcycle extends Vehicle {
    public Motorcycle(String make, String model) {
        super(make, model);
    }

    public void drive() {
        System.out.println("Riding the " + super.make + " " + super.model + " on the street.");
    }
}