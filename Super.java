class Example {
    int x;
    int y;

    void f1(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void display() {
        System.out.println(x);
        System.out.println(y);
    }
}

class Example1 extends Example {
    int x, y;

    void f3(int x, int y) {
        super.x = x; // x--> x value parent ke x me store hogi
        this.y = y; // y--> y value example1 ke y me store hogi
    }

    void display2() {
        System.out.println(x);
        System.out.println(y);
    }
}

public class Super {
    public static void main(String[] args) {
        Example1 e1 = new Example1();
        e1.f3(7, 9);
        e1.display2();
    }
}
