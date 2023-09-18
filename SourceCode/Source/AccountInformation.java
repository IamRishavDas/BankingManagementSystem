package AccountInformationWindow;

import javax.swing.JFrame;

public class AccountInformation {
    public static JFrame accountInfoFrame;

    public static void main(String[] args) {
        accountInfoFrame = new JFrame("Account Information Window");
        accountInfoFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        accountInfoFrame.setLocationRelativeTo(null);
        accountInfoFrame.setSize(1000, 800);
        accountInfoFrame.setResizable(false);

        accountInfoFrame.setVisible(true);
    }
}
