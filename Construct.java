class Demo {
    int x;
    int y;

    Demo() {
        x = 25;
        y = 50;
    }

    Demo(int p, int q) {
        x = p;
        y = q;
    }

    void display() {
        System.out.println(x);
        System.out.println(y);
    }
}

public class Construct {
    public static void main(String[] args) {
        Demo d1 = new Demo();
        Demo d2 = new Demo(5, 6);
        d2.display();
        System.out.println(d1.x);
        System.out.println(d1.y);

    }
}
