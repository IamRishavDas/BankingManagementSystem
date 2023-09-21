
import javax.swing.*;
import java.awt.*;

public class AccountStatement extends JFrame {

    AccountStatement() {
        setLayout(null);
        setTitle("Account Statement");
        
        setSize(500, 400);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        Color color = new Color(204, 252, 232);
        getContentPane().setBackground(color);

        JLabel head = new JLabel("Enter Customer Details");
        head.setBounds(130, 10, 250, 50);
        head.setFont(new Font("Arial", Font.BOLD, 20));
        add(head);

        JLabel accno = new JLabel("Account Number");
        accno.setBounds(50, 60, 150, 100);
        accno.setFont(new Font("Arial", Font.BOLD, 16));
        add(accno);

        JTextField accnotext = new JTextField();
        accnotext.setBounds(50, 140, 400, 30);
        add(accnotext);

        JLabel amount = new JLabel("PIN");
        amount.setBounds(50, 150, 100, 100);
        amount.setFont(new Font("Arial", Font.BOLD, 16));
        add(amount);

        JTextField amttext = new JTextField();
        amttext.setBounds(50, 230, 400, 30);
        add(amttext);

        JButton proceed = new JButton("PROCEED");
        proceed.setBounds(200, 300, 100, 20);
        add(proceed);

        setVisible(true);
    }

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        AccountStatement obj = new AccountStatement();
    }

}
