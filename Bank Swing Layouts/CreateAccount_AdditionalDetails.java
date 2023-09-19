

import javax.swing.*;
import java.awt.*;
public class CreateAccount_AdditionalDetails extends JFrame
{
    public static void main(String [] args)
    {
        CreateAccount_AdditionalDetails obj = new CreateAccount_AdditionalDetails();
    }
    
    CreateAccount_AdditionalDetails() 
    {
        setLayout(null);
        setVisible(true);
        setSize(700, 500);
        setLocation(300, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Color color = new Color(227, 250, 249);
        getContentPane().setBackground(color);
        
        JLabel l1 = new JLabel("Additional Details");
        l1.setBounds(220, 10, 250, 100);
        l1.setFont(new Font("Arial",Font.BOLD,28));
        add(l1);
        
        JLabel aadhar = new JLabel("Aadhar Number");
        aadhar.setBounds(80, 65, 150, 100);
        aadhar.setFont(new Font("Arial",Font.BOLD,16));
        add(aadhar);
        
        JTextField aadhartext = new JTextField();
        aadhartext.setBounds(250,100,400,30);
        add(aadhartext);
        aadhartext.setVisible(true);
        
         JLabel pan = new JLabel("Pan No.");
        pan.setBounds(80, 105, 150, 100);
        pan.setFont(new Font("Arial",Font.BOLD,16));
        add(pan);
        
        JTextField pantext = new JTextField();
        pantext.setBounds(250,140,400,30);
        add(pantext);
        pantext.setVisible(true);
        
         JLabel religion = new JLabel("Religion");
        religion.setBounds(80, 145, 150, 100);
        religion.setFont(new Font("Arial",Font.BOLD,16));
        add(religion);
        
        String relval[]={"Hinduism","Islam","Christianity","Sikhism","Others"};
        JComboBox religiontext = new JComboBox(relval);       
        religiontext.setBounds(250,180,400,30);
        add(religiontext);
        
        
        JLabel category = new JLabel("Category");
        category.setBounds(80, 185, 150, 100);
        category.setFont(new Font("Arial",Font.BOLD,16));
        add(category);
        
        String categoryval[]={"SC","ST","OBC","General"};
        JComboBox categorytext=new JComboBox(categoryval);
        categorytext.setBounds(250,220,400,30);
        add(categorytext);
        
        
        JLabel income = new JLabel("Income");
        income.setBounds(80,225 , 150, 100);
        income.setFont(new Font("Arial",Font.BOLD,16));
        add(income);
        
        JTextField incometext = new JTextField();
        incometext.setBounds(250, 260, 400, 30);
        add(incometext);
        
        JLabel sen = new JLabel("Senior Citizen");
        sen.setBounds(80, 265, 150, 100);
        sen.setFont(new Font("Arial",Font.BOLD,16));
        add(sen);
        
        JRadioButton notsenior= new JRadioButton("Not a Senior Citizen");
        notsenior.setBackground(color);
        notsenior.setBounds(250,300,200,30);
        add(notsenior);
        
        JRadioButton senior= new JRadioButton("Senior Citizen");
        senior.setBounds(470,300,200,30);
        senior.setBackground(color);
        add(senior);
        
        ButtonGroup sengroup = new ButtonGroup();
        sengroup.add(senior);
        sengroup.add(notsenior);
        
        JLabel exisacc = new JLabel("Existing Account");
        exisacc.setBounds(80,305, 200, 100);
        exisacc.setFont(new Font("Arial",Font.BOLD,16));
        add(exisacc);
        
        JRadioButton yes = new JRadioButton("Yes");
        yes.setBackground(color);
        add(yes);
        yes.setBounds(250,340,50,30);
        
         JRadioButton no = new JRadioButton("No");
        no.setBackground(color);
        add(no);
        no.setBounds(370,340,50,30);
        
        ButtonGroup yesno = new ButtonGroup();
        yesno.add(yes);
        yesno.add(no);
        
        JButton submit = new JButton("Submit");
        submit.setBounds(280,400,110,20);
        add(submit);
        
    }
}
