package methodtype;

class Sample2 {
    public static void main(String[] args) {
        Child child = new Child();
        child.print(10);
        child.print(10.0);
    }
}

class Parent {
    public void print(double i) {
        System.out.println(i * 2);
    }
}

class Child extends Parent {
    // This method overloads the method in B
    public void print(int i) {
        System.out.println(i);
    }
}