class A {
    int x;
    private static int y;

    void f1() {
        y = 22;
    }

    void f2() {
        System.out.println(y);
    }

    void f3() {
        y = 45;
    }
}

class B {
    private int x;
    private static int y;

    void f1() {
        y = 22;
        x = 5;
    }

    void f2() {
        System.out.println(x);
    }

    void f3() {
        y = 45;
    }
}

public class StaticMembers {
    public static void main(String[] args) {
        // A a1 = new A();
        // A a2 = new A();
        // a1.f1();
        // a2.f3();
        // a1.f2();

        B b1 = new B();
        B b2 = new B();
        b1.f1();
        b2.f2();
    }
}
