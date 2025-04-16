
public class SmallestEleme {
    public static void main(String[] args) {
        int ages[] = { 20, 22, 18, 12, 10, 26, 87, 10 };
        int small = ages[0];
        int secSmall = -1;
        for (int age : ages) {
            if (age < small) {
                secSmall = small;
                small = age;
            }
        }
        System.out.println("Second Lowest element is:- " + secSmall);

    }
}
