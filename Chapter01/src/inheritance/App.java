package inheritance;
public class App {
    public static void main(String[] args) throws Exception {

        Vehicle vehicle = new Vehicle("Perodua", "Myvi");
        vehicle.start();
        vehicle.drive();

        Car car = new Car("Proton", "Persona");
        car.start();
        car.drive();
        car.stop();

        Motorcycle motorcycle = new Motorcycle("Yamaha", "Sports");
        motorcycle.start();
        motorcycle.drive();

        //Valid
        Vehicle vehicle1 = new Car("Toyota", "Vios");
        Vehicle vehicle2 = new Car("Honda", "City");

        //Invalid
        // Car MyCar = new Vehicle("Perodua", "Alza");

        //Polymorphism
        Vehicle Veh;
        
        Veh = new Car("Proton", "Waja");
        Veh.start(); //Output: Starting the Proton Waja.
        Veh.drive(); //Output: Driving the Proton Waja on the highway.

        Veh = new Motorcycle("Modenas", "Kriss");
        Veh.start(); //Output: Starting the Modenas Kriss.
        Veh.drive(); //Output: Riding the Modenas Kriss on the street.

        Vehicle Ve = new Car("Mazda", "6");
        // Ve.stop();  // invalid

        Car Ca = (Car) Ve;
        Ca.stop();  // valid


    }
}
