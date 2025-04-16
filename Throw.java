public class Throw {

    public static void checkNum(int n) {
        if (n < 1) {
            // try {
            // throw new ArithmeticException("Number is negative!!");
            // } catch (Exception e) {
            // System.out.println(e.getMessage());
            // }
            throw new ArithmeticException("Number is negative!!");
        } else {
            System.out.println("Square of number is:- " + (n * n));
        }
    }

    public static void main(String[] args) {
        Throw t1 = new Throw();
        t1.checkNum(-3);
        System.out.println("Exit!");
    }
}
