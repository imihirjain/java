class Example {
    private int x;
    private int y;

    void f1(int x, int y)
    {
        this.x=x;
        this.y=y;
    }

    void display() {
        System.out.println(x);
        System.out.println(y);
    }
}

public class ThisK {
    public static void main(String[] args) {
        Example e1= new Example();
        e1.f1(55,66);
        e1.display();
    }
}
