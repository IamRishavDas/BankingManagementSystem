
import javax.swing.*;
import java.awt.*;

public class Login extends JFrame {

    static JTextField uidtext;
    private static JPasswordField passtext;

    Login() {
        setTitle("LOG IN");
        setSize(700, 500);
        setLayout(null);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        // ImageIcon i1 = new
        // ImageIcon(ClassLoader.getSystemResource("pics/23388860.jpg"));
        // Image i3 = i1.getImage().getScaledInstance(100, 100, 100);
        // ImageIcon i4 = new ImageIcon(i3);
        // JLabel i2 = new JLabel(i4);
        // i2.setBounds(150, 10, 100, 100);
        // add(i2);

        Color color = new Color(83, 202, 255);
        getContentPane().setBackground(color);
        JLabel l1 = new JLabel("LOG IN");
        l1.setFont(new Font("Arial", Font.BOLD, 40));
        l1.setBounds(300, 10, 400, 100);
        add(l1);

        JLabel uid = new JLabel("ENTER USER ID");
        uid.setFont(new Font("Arial", Font.BOLD, 18));
        uid.setBounds(150, 100, 150, 100);
        add(uid);

        Font font = new Font("arial black", Font.BOLD, 15);

        uidtext = new JTextField();
        uidtext.setBounds(150, 185, 400, 30);
        uidtext.setFont(font);
        add(uidtext);

        JLabel pass = new JLabel("ENTER PASSWORD");
        pass.setFont(new Font("Arial", Font.BOLD, 18));
        pass.setBounds(150, 200, 400, 100);
        add(pass);

        passtext = new JPasswordField();
        passtext.setBounds(150, 285, 400, 30);
        passtext.setFont(font);
        add(passtext);

        JButton b = new JButton("LOG IN");
        b.setBounds(170, 350, 150, 20);
        add(b);

        JButton b2 = new JButton("New User");
        b2.setBounds(340, 350, 200, 20);
        add(b2);

        setVisible(true);
    }

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Login obj = new Login();
    }

}
