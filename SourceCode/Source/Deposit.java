package DepositWindow;

import javax.swing.JFrame;

public class Deposit {
    public static JFrame depositFrame;

    public static void main(String[] args) {

        depositFrame = new JFrame("Account Information Window");
        depositFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        depositFrame.setLocationRelativeTo(null);
        depositFrame.setSize(1000, 800);
        depositFrame.setResizable(false);

        depositFrame.setVisible(true);
    }
}
