public class ExceptionH2 {
    public static void main(String[] args) {
        System.out.println(5 / 0);
        System.out.println("This the second demo of exception handling where we will learn about Finally keyword");
        String s1 = null;
        try {
            System.out.println("c");
            System.out.println(s1.length());
        } catch (ArithmeticException e1) {
            System.out.println("Arithmetc Exception");
        } catch (ArrayIndexOutOfBoundsException e1) {
            System.out.println("Array out of bound exception");
        } finally {
            System.out.println("!!!!!this line have to print in any case this is emergency line!!!!");
        }
        System.out.println("another line");
    }
}
