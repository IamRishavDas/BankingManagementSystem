package CreateAccountWindow;

import javax.swing.JFrame;

public class CreateAccount {
    public static JFrame createAccountFrame;

    public static void main(String[] args) {
        createAccountFrame = new JFrame("Create Account Window");
        createAccountFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        createAccountFrame.setLocationRelativeTo(null);
        createAccountFrame.setSize(1000, 800);

        createAccountFrame.setVisible(true);

    }
}
