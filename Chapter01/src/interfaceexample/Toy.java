package interfaceexample;

class Toy extends Goods implements Taxable {
    int minimumAge;

    public Toy(String des, double pr, int min) {
        super(des, pr);
        minimumAge = min;
    }

    public void display() {
        super.display();
        System.out.println("minimum age: " + minimumAge);
    }

    @Override
    public double calculateTax() {
        return price * taxRate;
    }
}
