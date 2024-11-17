/*
 main method ki function overloading possible hai function overriding possible nahi hai 
 
 */
public class MainOverloading {
    public static void main(String[] args) {
        System.out.println("Default main function ");
        main(10);
        main("Mihir");
    }

    public static void main(int a) {
        System.out.println("Overloaded main with integer:- " + a);
    }

    public static void main(String str) {
        System.out.println("Overloaded main with String:- " + str);
    }
}
