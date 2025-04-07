interface I1 {
    int x = 6;

    void f1();

    static void f2() {
        System.out.println(x);
    }
}

interface I2 extends I1 {
    int y = 18;

    void f3();

    static void f2() {
        System.out.println(x);
    }
}

class Child1 implements I2 {
    static int y;

    static void f2() {
        System.out.println(x);
        System.out.println(y);
    }

    public void f1() {
        System.out.println("F1 function overriding");
    }

    public void f3() {
        System.out.println("F3 function overriding");
    }
}

public class Interf {
    public static void main(String[] args) {
        // I1.f2();
        Child1 c1 = new Child1();
        c1.f2();
        c1.f1();
        c1.f3();
        // I2.f2();
    }
}
