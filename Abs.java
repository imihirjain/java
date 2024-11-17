abstract class Demo1 {
    int x, y;

    void f1() {
        x = 5;
        y = 7;
    }

    abstract void f2();

    Demo1() {
        System.out.println("Parent's Constructor executed");
    }
}

class Demo2 extends Demo1 {
    int z;

    void f3() {
        z = 9;
    }

    void f2() {

    }

    Demo2() {
        System.out.println("Child's Constructor executed");
    }
}

public class Abs {
    public static void main(String[] args) {
        Demo2 d1 = new Demo2();
        d1.f3();
    }
}