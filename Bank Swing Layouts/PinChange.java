

import javax.swing.*;
import java.awt.*;
public class PinChange extends JFrame{
    public static void main(String [] args)
    {
        PinChange obj= new PinChange();
    }
    PinChange()
    {
        setLayout(null);
        setTitle("Pin Change");
        setVisible(true);
        setSize(500, 480);
        setLocation(400, 170);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Color color = new Color(204, 252, 232);
        getContentPane().setBackground(color);
        
        JLabel head = new JLabel("Enter Customer Details");
        head.setBounds(130, 10, 250, 50);
        head.setFont(new Font("Arial",Font.BOLD,20));
        add(head);
        
        JLabel accno = new JLabel("ACCOUNT NUMBER");
        accno.setBounds(50, 60, 170, 100);
        accno.setFont(new Font("Arial",Font.BOLD,16));
        add(accno);
        
       JTextField accnotext = new JTextField();
       accnotext.setBounds(50,140,400,30);
       add(accnotext);
       
        JLabel amount = new JLabel("ACCOUNT HOLDER");
        amount.setBounds(50, 150, 150, 100);
        amount.setFont(new Font("Arial",Font.BOLD,16));
        add(amount);
        
         JTextField amounttext = new JTextField();
       amounttext.setBounds(50,230,400,30);
       add(amounttext);
        
       JLabel pin = new JLabel("PHONE");
        pin.setBounds(50, 240, 100, 100);
        pin.setFont(new Font("Arial",Font.BOLD,16));
        add(pin);
        
        JTextField pintext = new JTextField();
       pintext.setBounds(50,310,400,30);
       add(pintext);
       
       JButton proceed = new JButton("PROCEED");
       proceed.setBounds(200,380,100,20);
       add(proceed);
    }
}
