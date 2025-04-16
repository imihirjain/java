import java.io.*;

public class ExceptionH4 {

    // without try catch block
    // public static void main(String[] args) throws IOException,
    // ClassNotFoundException {
    // System.out.println("A");
    // throw new IOException();
    // }

    public static void main(String[] args) {
        System.out.println("A");
        try {
            throw new IOException("Printer not found");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
