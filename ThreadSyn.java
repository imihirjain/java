import java.util.Scanner;

class Account {
    int bal;

    Account(int b1) {
        bal = b1;
    }

    boolean isSufficient(int withdraw) {
        if (bal > withdraw)
            return true;
        else
            return false;
    }

    void withdrawAmt(int amt, String s1) {
        bal -= amt;
        System.out.println(s1 + " Transaction Successful.");
        System.out.println(s1 + " Current balance is " + bal);
    }
}

class Customer implements Runnable {
    String name;
    Account a1;

    Customer(Account x1, String s1) {
        name = s1;
        a1 = x1;
    }

    public void run() {
        Scanner read = new Scanner(System.in);
        synchronized (a1) {
            System.out.println(name + " Enter the amount to withdraw:- ");
            int amt = read.nextInt();
            if (a1.isSufficient(amt)) {
                a1.withdrawAmt(amt, name);
            } else {
                System.out.println("Sorry you don't have sufficient balance");
            }
        }
    }
}

public class ThreadSyn {
    public static void main(String[] args) {
        Account a1 = new Account(50000);
        Customer c1 = new Customer(a1, "Sumit");
        Customer c2 = new Customer(a1, "Manish");
        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);
        t1.start();
        t2.start();

    }
}