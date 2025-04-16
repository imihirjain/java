import javax.swing.*;

public class LoginS extends JFrame {
    LoginS(String s1) {
        super(s1);
    }

    LoginS() {

    }

    public void setComponents() {
        JLabel l1 = new JLabel();
        l1.setText("WELCOME");
        setLayout(null);
        l1.setBounds(200, 200, 100, 30);
        add(l1);
    }

    public static void main(String[] args) {
        LoginS s1 = new LoginS("Welcome to JFrame Tutorial");
        s1.setVisible(true);
        s1.setSize(500, 500);
        s1.setComponents();
        s1.setDefaultCloseOperation(LoginS.EXIT_ON_CLOSE);
    }
}
