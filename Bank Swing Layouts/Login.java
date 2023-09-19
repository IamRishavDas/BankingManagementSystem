
import javax.swing.*;
import java.awt.*;

public class Login extends JFrame {
    public static void main(String[] args) {
        Login obj = new Login();
    }

    Login() {
        // ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("pics/23388860.jpg"));
        // Image i3 = i1.getImage().getScaledInstance(100, 100, 100);
        // ImageIcon i4 = new ImageIcon(i3);
        // JLabel i2 = new JLabel(i4);
        // i2.setBounds(150, 10, 100, 100);
        // add(i2);
        Color color = new Color(255, 255, 255);
        getContentPane().setBackground(color);
        JLabel l1 = new JLabel("LOG IN");
        l1.setFont(new Font("Arial", Font.BOLD, 40));
        l1.setBounds(300, 10, 400, 100);
        add(l1);

        JLabel uid = new JLabel("ENTER USER ID");
        uid.setFont(new Font("Arial", Font.BOLD, 18));
        uid.setBounds(150, 100, 150, 100);
        add(uid);

        JTextField uidtext = new JTextField();
        uidtext.setBounds(150, 185, 400, 30);
        add(uidtext);

        JLabel pass = new JLabel("ENTER PASSWORD");
        pass.setFont(new Font("Arial", Font.BOLD, 18));
        pass.setBounds(150, 200, 400, 100);
        add(pass);

        JTextField passtext = new JTextField();
        passtext.setBounds(150, 285, 400, 30);
        add(passtext);

        JButton b = new JButton("LOG IN");
        b.setBounds(170, 350, 150, 20);
        add(b);

        JButton b2 = new JButton("FORGOT PASSWORD");
        b2.setBounds(340, 350, 200, 20);
        add(b2);

        setTitle("LOG IN");
        setSize(700, 500);
        setLayout(null);
        setVisible(true);
        setLocation(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
