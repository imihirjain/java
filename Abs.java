abstract class Demo {
    int x, y;

    void f1() {
        x = 5;
        y = 7;
    }

    abstract void f2();

    Demo() {
        System.out.println("Parent's constructor executed");
    }
}

class Demo1 extends Demo {
    int z;

    void f3() {
        z = 8;
    }

    void f2() {
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }

    Demo1() {
        System.out.println("Children's constructor executed");
    }

}

public class Abs {
    public static void main(String[] args) {
        Demo1 d1 = new Demo1();
        d1.f1();
        d1.f3();
        d1.f2();
    }
}