package inheritance;

public class Car extends Vehicle {
    public Car(String make, String model) {
        super(make, model);
    }

    public void stop() {
        System.out.println("Stopping the " + make + " " + model + ".");
    }
}