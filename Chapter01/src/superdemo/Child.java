package superdemo;

class Child extends Parent{
    @Override
    void print() {
        super.print();
        System.out.println("Child is printing.");
    }
}
