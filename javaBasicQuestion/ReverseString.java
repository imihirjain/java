public class ReverseString {
    public static void main(String[] args) {
        String s1 = "Hello World!";
        String s2 = "";

        for (int i = 0; i < s1.length(); i++) {
            s2 = s1.charAt(i) + s2;
        }
        System.out.println(s2);
    }
}
