public class Wrap1 {
    public static void main(String[] args) {
        double x = Double.parseDouble("1234");
        Double d1 = Double.valueOf("1100");
        double y = d1.doubleValue();

        System.out.println(x);
        System.out.println(y);
    }
}
