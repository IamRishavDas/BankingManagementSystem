package CreateAccountWindow;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;

class CreateAccountPanel{
    JPanel panel_create_account;
    JLabel label_customerFirstName, label_customerLastName, label_customerAddress, label_customerMobile, label_customerAdharNumber;
    CreateAccountPanel(){
        panel_create_account.setBackground(Color.magenta);
        panel_create_account.setLayout(null);
    }
}
@SuppressWarnings("unused")
public class CreateAccount {
    public static void main(String[] args) {
        CreateAccountPanel createAccountPanel = new CreateAccountPanel();
    }
}
