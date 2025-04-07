public class CLA1 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < args.length; i++) {
            System.out.println(Integer.parseInt(args[i]));
            sum += Integer.parseInt(args[i]);
        }
        System.out.println(sum);
    }
}
