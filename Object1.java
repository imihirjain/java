class Mahesh {
    static int x;
    public int y;

    void setData() {
        x = 5;
        y = 22;
    }

    void display() {
        System.out.println(x);
        System.out.println(y);
    }
}

public class Object1 {
    public static void main(String[] args) {
        Mahesh m1 = new Mahesh();
        m1.setData();
        m1.y = 55;
        m1.display();
    }
}