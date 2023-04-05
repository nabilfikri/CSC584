package methodtype.override;

class Sample1 {
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
    @Override
    public void print(double i) {
        System.out.println(i);
    }
}
  
