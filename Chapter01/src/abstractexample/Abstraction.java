package abstractexample;

public class Abstraction {
    public static void main(String[] args) {
        Parent child = new Child();
        child.print();
    }
}

abstract class Student {
    abstract public void computeCourseGrade();
}

class Undergraduate extends Student {
    public void computeCourseGrade() {
            // implementation
    }
}

class Graduate extends Student {
    public void computeCourseGrade() {
            // implementation
    }
}

class OtherStudent extends Student {
	public void computeCourseGrade() {
        // implementation
	}
}