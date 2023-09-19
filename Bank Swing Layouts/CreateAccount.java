

import javax.swing.*;
import java.awt.*;

public class CreateAccount extends JFrame {

    public static void main(String[] args) {
        CreateAccount obj=new CreateAccount();
    }
    
    CreateAccount() {
        setLayout(null);
        setVisible(true);
        setSize(700, 700);
        setLocation(300, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Color color = new Color(227, 250, 249);
        getContentPane().setBackground(color);

        JLabel i1 = new JLabel("APPLICATION FORM");
        i1.setBounds(220, 8, 390, 100);
        i1.setFont(new Font("Arial", Font.BOLD, 26));
        add(i1);

        JLabel name = new JLabel("Name");                                    //name
        name.setFont(new Font("Arial", Font.BOLD, 20));
        name.setBounds(40, 50, 70, 100);
        add(name);

        JTextField nametext = new JTextField();        
        nametext.setBounds(220, 85, 400, 30);
        add(nametext);

        JLabel dob = new JLabel("Date of Birth");                             //DOB
        dob.setFont(new Font("Arial", Font.BOLD, 20));
        dob.setBounds(40, 100, 190, 100);
        add(dob);
        
        JTextField dobtext = new JTextField();
        dobtext.setBounds(220, 135, 400, 30);
        add(dobtext);

        JLabel father = new JLabel("Father's Name");                           //father
        father.setFont(new Font("Arial", Font.BOLD, 20));
        father.setBounds(40, 150, 190, 100);
        add(father);
        
        JTextField fathertext = new JTextField();
        fathertext.setBounds(220, 185, 400, 30);
        add(fathertext);

        JLabel gender = new JLabel("Gender");                                 //gender
        gender.setFont(new Font("Arial", Font.BOLD, 20));
        gender.setBounds(40, 200, 100, 100);
        add(gender);
        
        JRadioButton male = new JRadioButton("Male");
        male.setBackground(color);
        male.setBounds(220,230,100,20);
        add(male);
        
        JRadioButton female = new JRadioButton("Female");
        female.setBackground(color);
        female.setBounds(350,230,100,20);
        add(female);
        
        JRadioButton others = new JRadioButton("Others");
        others.setBackground(color);
        others.setBounds(480,230,100,20);
        add(others);
        
        ButtonGroup gendergroup = new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);
        gendergroup.add(others);
        
        JLabel phone = new JLabel("Phone No.");                               //phone
        phone.setFont(new Font("Arial", Font.BOLD, 20));
        phone.setBounds(40, 250, 100, 100);
        add(phone);
        
        JTextField phonetext = new JTextField();
        phonetext.setBounds(220, 285, 400, 30);
        add(phonetext);

        JLabel email = new JLabel("Email");                                   //email
        email.setFont(new Font("Arial", Font.BOLD, 20));
        email.setBounds(40, 300, 100, 100);
        add(email);
        
        JTextField mailtext = new JTextField();
        mailtext.setBounds(220, 335, 400, 30);
        add(mailtext);

        JLabel marital = new JLabel("Marital Status");                        //marital status
        marital.setFont(new Font("Arial", Font.BOLD, 20));
        marital.setBounds(40, 350, 190, 100);
        add(marital);
        
        JRadioButton married = new JRadioButton("Married");
        married.setBackground(color);
        married.setBounds(220,390,100,20);
        add(married);

        JRadioButton unmarried = new JRadioButton("Unmarried");
        unmarried.setBackground(color);
        unmarried.setBounds(350,390,100,20);
        add(unmarried);
        
        ButtonGroup margroup = new ButtonGroup();
        margroup.add(married);
        margroup.add(unmarried);
        
        JLabel address = new JLabel("Address");                               //address
        address.setFont(new Font("Arial", Font.BOLD, 20));
        address.setBounds(40, 400, 100, 100);
        add(address);
        
        JTextField addresstext = new JTextField();
        addresstext.setBounds(220, 435, 400, 30);
        add(addresstext);
 
        JLabel city = new JLabel("City");                                    //city
        city.setFont(new Font("Arial", Font.BOLD, 20));
        city.setBounds(40, 450, 100, 100);
        add(city);
        
        JTextField citytext = new JTextField();
        citytext.setBounds(220, 485, 400, 30);
        add(citytext);

        JLabel state = new JLabel("State");                                    //state
        state.setFont(new Font("Arial", Font.BOLD, 20));
        state.setBounds(40, 500, 100, 100);
        add(state);
        
        JTextField statetext = new JTextField();
        statetext.setBounds(220, 535, 400, 30);
        add(statetext);

        JLabel pin = new JLabel("Pin Code");                                     //pin
        pin.setFont(new Font("Arial", Font.BOLD, 20));
        pin.setBounds(40, 550, 100, 100);
        add(pin);
        
        JTextField pintext = new JTextField();
        pintext.setBounds(220, 585, 400, 30);
        add(pintext);
        
        JButton next = new JButton("Next");
        next.setBounds(300,630,110,20);
        add(next);
    }

    

}
