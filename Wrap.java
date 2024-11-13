public class Wrap {
    public static void main(String[] args) {
        int x = Integer.parseInt("123");
        System.out.println(x);

        Integer x1 = Integer.valueOf("11101", 2);
        int y = x1.intValue();
        System.out.println(y);

        Double x2 = Double.valueOf("568");
        double y2 = x2.doubleValue();
        System.out.println(y2);
    }
}