
package firstapplication;
import javax.swing.*;
import java.awt.*;

public class Employee_Dashboard extends JFrame
{
    Employee_Dashboard()
    {
        setLayout(null);
        setVisible(true);
        setSize(600, 500);
        setLocation(400,160);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Color color = new Color(204, 252, 232);
        getContentPane().setBackground(color);
        
                JLabel i1 = new JLabel("Welcome to Dashboard");
                i1.setFont(new Font("Arial",Font.BOLD,26));
                i1.setBounds(150, 10, 300, 100);
                add(i1);
                
                JButton b = new JButton("CREATE CUSTOMER ACCOUNT");
                b.setBounds(70, 140, 220, 20);
                add(b);
                
                JButton b0 = new JButton("ACCOUNT STATEMENT");
                b0.setBounds(320, 140, 220, 20);
                add(b0);
                
                JButton b1 = new JButton("BALANCE ENQUIRY");
                b1.setBounds(100, 200, 150, 20);
                add(b1);
                
                JButton b11 = new JButton("FAST CASH");
                b11.setBounds(340, 200, 150, 20);
                add(b11);
                
                JButton b2 = new JButton("DEPOSIT FUNDS");
                b2.setBounds(100, 260, 150, 20);
                add(b2);
                
                JButton b21 = new JButton("PIN CHANGE");
                b21.setBounds(340, 260, 150, 20);
                add(b21);
                
                JButton b3 = new JButton("WITHDRAW FUNDS");
                b3.setBounds(100, 320, 150, 20);
                add(b3);
                
                JButton b31 = new JButton("DEBIT/CREDIT");
                b31.setBounds(340, 320, 150, 20);
                add(b31);
                
                JButton b4 = new JButton("LOG OUT");
                b4.setBounds(220, 400, 150, 20);
                add(b4);
                
        
    }
    public static void main(String [] args)
    {
        new Employee_Dashboard();
    }
}
