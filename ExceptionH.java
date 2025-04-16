public class ExceptionH {
    public static void main(String[] args) {
        String s1 = null;
        System.out.println("this is the demo of exception handling");
        try {
            System.out.println(s1.length());
            System.out.println(5 / 0);
        } catch (NullPointerException n1) {
            System.out.println(n1.getMessage());
        } catch (ArithmeticException a1) {
            System.out.println(a1.getMessage());
        }
        System.out.println("A");
        System.out.println("B");
    }
}
