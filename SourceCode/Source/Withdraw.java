package WithdrawWindow;

import javax.swing.JFrame;

public class Withdraw {
    public static JFrame WithdrawFrame;

    public static void main(String[] args) {

        WithdrawFrame = new JFrame("Account Information Window");
        WithdrawFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        WithdrawFrame.setLocationRelativeTo(null);
        WithdrawFrame.setSize(1000, 800);
        WithdrawFrame.setResizable(false);

        WithdrawFrame.setVisible(true);
    }
}