
package firstapplication;
import javax.swing.*;
import java.awt.*;

public class DebitCredit extends JFrame {
    public static void main(String[] args) {
        DebitCredit obj= new DebitCredit();
    }
    DebitCredit()
    {
        setLayout(null);
        setVisible(true);
        setSize(500, 500);
        setLocation(350, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Color color =new Color(204, 252, 232);
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
       
        JLabel amount = new JLabel("Applying For");
        amount.setBounds(50, 150, 150, 100);
        amount.setFont(new Font("Arial",Font.BOLD,16));
        add(amount);
        
         String cards[]={"Credit","Debit","Both"};
         JComboBox card=new JComboBox(cards);
         card.setBounds(50,230,400,30);
         add(card);
         
         
         
       JLabel acc = new JLabel("Account Holder");
        acc.setBounds(50, 240, 150, 100);
        acc.setFont(new Font("Arial",Font.BOLD,16));
        add(acc);
        
        JTextField scctext = new JTextField();
       scctext.setBounds(50,310,400,30);
       add(scctext);
       
       JButton proceed = new JButton("PROCEED");
       proceed.setBounds(200,380,100,20);
       add(proceed);
    }
}
