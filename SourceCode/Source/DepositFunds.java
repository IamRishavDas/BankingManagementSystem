package DepositWindow;

import javax.swing.*;
import java.awt.*;

public class DepositFunds extends JFrame {

    DepositFunds() {

        setLayout(null);
        setTitle("Deposit Funds");

        setSize(500, 480);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
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

        JLabel amount = new JLabel("Deposit Amount");
        amount.setBounds(50, 150, 150, 100);
        amount.setFont(new Font("Arial", Font.BOLD, 16));
        add(amount);

        JTextField amounttext = new JTextField();
        amounttext.setBounds(50, 230, 400, 30);
        add(amounttext);

        JLabel pin = new JLabel("PIN");
        pin.setBounds(50, 240, 100, 100);
        pin.setFont(new Font("Arial", Font.BOLD, 16));
        add(pin);

        JTextField pintext = new JTextField();
        pintext.setBounds(50, 310, 400, 30);
        add(pintext);

        JButton proceed = new JButton("PROCEED");
        proceed.setBounds(200, 380, 100, 20);
        add(proceed);

        setVisible(true);
    }

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        DepositFunds obj = new DepositFunds();
    }

}