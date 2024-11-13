class Mahesh {
    int x;
    int y;

    static void fun1() {
        System.out.println("A");
    }

    static void fun2() {
        System.out.println("B");
    }
}

public class Object1 {
    public static void main(String[] args) {
        System.out.println("This is an example of creating an object of another class");
        Mahesh m1 = new Mahesh();
        Mahesh m2 = new Mahesh();
        m1.x = 51;
        System.out.println(m1.x);
        System.out.println(m2.y);
        System.out.println((fun1()));
    }
}
