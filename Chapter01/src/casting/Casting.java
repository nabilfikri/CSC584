package casting;

import inheritance.*;

public class Casting {
    public static void main(String[] args) {
        Vehicle C = new Car("Proton", "Wira");
        System.out.println(C instanceof Vehicle);
        System.out.println(C instanceof Car);
        System.out.println(C instanceof Motorcycle);
        
        Vehicle M = new Motorcycle("Proton", "Wira");
        System.out.println(M instanceof Vehicle);
        System.out.println(M instanceof Car);
        System.out.println(M instanceof Motorcycle);

    }


}
