
package firstapplication;

import javax.swing.*;
import java.awt.*;
public class FastCash extends JFrame{
    public static void main(String [] args)
    {
        FastCash obj= new FastCash();
    }
    FastCash()
    {
        setLayout(null);
        setTitle(" Fast Cash");
        setVisible(true);
        setSize(500, 400);
        setLocation(400, 170);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Color color = new Color(204, 252, 232);
        getContentPane().setBackground(color);
        
        JLabel head = new JLabel("Enter Customer Details");
        head.setBounds(130, 10, 250, 50);
        head.setFont(new Font("Arial",Font.BOLD,20));
        add(head);
        
        JLabel accno = new JLabel("Account Number");
        accno.setBounds(50, 60, 150, 100);
        accno.setFont(new Font("Arial",Font.BOLD,16));
        add(accno);
        
       JTextField accnotext = new JTextField();
       accnotext.setBounds(50,140,400,30);
       add(accnotext);
       
       JLabel pin = new JLabel("PIN");
        pin.setBounds(50, 150, 100, 100);
        pin.setFont(new Font("Arial",Font.BOLD,16));
        add(pin);
        
       JTextField pintext = new JTextField();
       pintext.setBounds(50,230,400,30);
       add(pintext);
       
       JButton proceed = new JButton("PROCEED");
       proceed.setBounds(200,300,100,20);
       add(proceed);
    }
}