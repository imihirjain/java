import java.util.Scanner;

class Account {
    int balance;

    Account(int b1) {
        balance = b1;
    }

    boolean isSufficient(int withdraw) {
        if (balance > withdraw)
            return true;
        else
            return false;
    }

    public void withdrawAmt(int amt, String name) {
        balance -= amt;
        System.out.println(name + " withdrew " + amt + " from account");
        System.out.println(name + " withdraw Success");
        System.out.println("Current balance is " + balance);
    }
}

class Customer implements Runnable {
    Account a1;
    String name;

    Customer(Account x1, String n1) {
        a1 = x1;
        name = n1;
    }

    public void run() {
        synchronized (a1) {

            Scanner read = new Scanner(System.in);
            System.out.println(name + " Enter the amount to withdraw: ");
            int amt = read.nextInt();
            if (a1.isSufficient(amt)) {
                a1.withdrawAmt(amt, name);
            } else {
                System.out.println("Insufficient balance");
            }
        }
    }

}

public class MultiT3 {
    public static void main(String[] args) {

        Account a1 = new Account(10000);
        Customer c1 = new Customer(a1, "Amit");
        Customer c2 = new Customer(a1, "Sumit");
        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);
        t1.start();
        t2.start();
    }
}