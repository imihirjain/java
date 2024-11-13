class Nokia {
    private int mic;
    private int cam;

    void setValue() {
        mic = 3;
        cam = 8;
    }

    void display() {
        System.out.println("Mic: " + mic);
        System.out.println("Cam: " + cam);
    }
}

public class ClassesAndObject {
    public static void main(String[] args) {
        Nokia n1 = new Nokia();
        n1.display();
        n1.setValue();
    }
}
