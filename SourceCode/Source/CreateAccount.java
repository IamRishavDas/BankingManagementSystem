package CreateAccountWindow;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import java.awt.Font;
import java.awt.Color;

public class CreateAccount {

    public static JFrame createAccountFrame;
    static JTextField nametext, dobtext, fathertext, phonetext, mailtext, addresstext, citytext, statetext, pintext;
    
    static JButton next;

    public static void main(String[] args) {

        createAccountFrame = new JFrame("Create Account Window");
        createAccountFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        createAccountFrame.setLocationRelativeTo(null);
        createAccountFrame.setSize(700, 800);
        createAccountFrame.setResizable(false);
        createAccountFrame.setLayout(null);

        Color color = new Color(227, 250, 249);
        createAccountFrame.getContentPane().setBackground(color);

        JLabel i1 = new JLabel("APPLICATION FORM");
        i1.setBounds(220, 8, 390, 100);
        i1.setFont(new Font("Arial", Font.BOLD, 26));
        createAccountFrame.add(i1);

        JLabel name = new JLabel("Name"); // name
        name.setFont(new Font("Arial", Font.BOLD, 20));
        name.setBounds(40, 50, 70, 100);
        createAccountFrame.add(name);

        nametext = new JTextField();
        nametext.setBounds(220, 85, 400, 30);
        createAccountFrame.add(nametext);

        JLabel dob = new JLabel("Date of Birth"); // DOB
        dob.setFont(new Font("Arial", Font.BOLD, 20));
        dob.setBounds(40, 100, 190, 100);
        createAccountFrame.add(dob);

        dobtext = new JTextField();
        dobtext.setBounds(220, 135, 400, 30);
        createAccountFrame.add(dobtext);

        JLabel father = new JLabel("Father's Name"); // father
        father.setFont(new Font("Arial", Font.BOLD, 20));
        father.setBounds(40, 150, 190, 100);
        createAccountFrame.add(father);

        fathertext = new JTextField();
        fathertext.setBounds(220, 185, 400, 30);
        createAccountFrame.add(fathertext);
        
        JLabel gender = new JLabel("Gender"); // gender
        gender.setFont(new Font("Arial", Font.BOLD, 20));
        gender.setBounds(40, 200, 100, 100);
        createAccountFrame.add(gender);

        JRadioButton male = new JRadioButton("Male");
        male.setBackground(color);
        male.setBounds(220, 230, 100, 20);
        createAccountFrame.add(male);

        JRadioButton female = new JRadioButton("Female");
        female.setBackground(color);
        female.setBounds(350, 230, 100, 20);
        createAccountFrame.add(female);

        JRadioButton others = new JRadioButton("Others");
        others.setBackground(color);
        others.setBounds(480, 230, 100, 20);
        createAccountFrame.add(others);

        ButtonGroup gendergroup = new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);
        gendergroup.add(others);

        JLabel phone = new JLabel("Phone No."); // phone
        phone.setFont(new Font("Arial", Font.BOLD, 20));
        phone.setBounds(40, 250, 100, 100);
        createAccountFrame.add(phone);

        phonetext = new JTextField();
        phonetext.setBounds(220, 285, 400, 30);
        createAccountFrame.add(phonetext);

        JLabel email = new JLabel("Email"); // email
        email.setFont(new Font("Arial", Font.BOLD, 20));
        email.setBounds(40, 300, 100, 100);
        createAccountFrame.add(email);

        mailtext = new JTextField();
        mailtext.setBounds(220, 335, 400, 30);
        createAccountFrame.add(mailtext);

        JLabel marital = new JLabel("Marital Status"); // marital status
        marital.setFont(new Font("Arial", Font.BOLD, 20));
        marital.setBounds(40, 350, 190, 100);
        createAccountFrame.add(marital);

        JRadioButton married = new JRadioButton("Married");
        married.setBackground(color);
        married.setBounds(220, 390, 100, 20);
        createAccountFrame.add(married);

        JRadioButton unmarried = new JRadioButton("Unmarried");
        unmarried.setBackground(color);
        unmarried.setBounds(350, 390, 100, 20);
        createAccountFrame.add(unmarried);

        ButtonGroup margroup = new ButtonGroup();
        margroup.add(married);
        margroup.add(unmarried);

        JLabel address = new JLabel("Address"); // address
        address.setFont(new Font("Arial", Font.BOLD, 20));
        address.setBounds(40, 400, 100, 100);
        createAccountFrame.add(address);

        addresstext = new JTextField();
        addresstext.setBounds(220, 435, 400, 30);
        createAccountFrame.add(addresstext);

        JLabel city = new JLabel("City"); // city
        city.setFont(new Font("Arial", Font.BOLD, 20));
        city.setBounds(40, 450, 100, 100);
        createAccountFrame.add(city);

        citytext = new JTextField();
        citytext.setBounds(220, 485, 400, 30);
        createAccountFrame.add(citytext);

        JLabel state = new JLabel("State"); // state
        state.setFont(new Font("Arial", Font.BOLD, 20));
        state.setBounds(40, 500, 100, 100);
        createAccountFrame.add(state);

        statetext = new JTextField();
        statetext.setBounds(220, 535, 400, 30);
        createAccountFrame.add(statetext);

        JLabel pin = new JLabel("Pin Code"); // pin
        pin.setFont(new Font("Arial", Font.BOLD, 20));
        pin.setBounds(40, 550, 100, 100);
        createAccountFrame.add(pin);

        pintext = new JTextField();
        pintext.setBounds(220, 585, 400, 30);
        createAccountFrame.add(pintext);

        next = new JButton("Next");
        next.setBounds(300, 630, 110, 20);
        createAccountFrame.add(next);

        createAccountFrame.setVisible(true);

    }
}
