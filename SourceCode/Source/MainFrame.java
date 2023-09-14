//initially the login id = "RishavDas" and the Password is = "adgjkaw1" [ this is just for verification purpose Data base will be added later on]

import ServicesWindow.Services;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class LOG_IN_Frame extends JFrame {

    /*
     * Here we have declared the general components which we need to form the frame look
     */
    Container c;
    JLabel label_login, label_user, label_password, label_bank_image;
    static JTextField text_userid;
    static JPasswordField passwordField;
    JButton button_submit;

    LOG_IN_Frame() {

        /*
         *setting the frame size location on screen and exit status type
         */
        this.setSize(900, 500);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        /*setting container color */
        c = this.getContentPane();
        c.setBackground(Color.gray);
        c.setLayout(null);

        /*setting all components in its correct position */
        label_login = new JLabel("LOG IN PAGE");
        label_login.setBounds(300, 40, 300, 40);
        label_login.setFont(new Font("arial black", Font.BOLD, 30));
        c.add(label_login);

        ImageIcon bank = new ImageIcon("Bank1.png");
        label_bank_image = new JLabel(bank);
        label_bank_image.setBounds(50, 90, bank.getIconWidth(), bank.getIconHeight());
        c.add(label_bank_image);

        Font attributeFont = new Font("Berlin Sans FB Demi", Font.PLAIN, 17);

        label_user = new JLabel("User ID");
        label_user.setBounds(325, 200, 100, 40);
        label_user.setFont(attributeFont);
        c.add(label_user);

        label_password = new JLabel("Password");
        label_password.setBounds(325, 260, 100, 40);
        label_password.setFont(attributeFont);
        c.add(label_password);

        text_userid = new JTextField();
        text_userid.setBounds(500, 200, 300, 40);
        text_userid.setFont(attributeFont);
        c.add(text_userid);

        passwordField = new JPasswordField();
        passwordField.setBounds(500, 260, 300, 40);
        passwordField.setFont(attributeFont);
        c.add(passwordField);

        button_submit = new JButton("Submit");
        button_submit.setBounds(375, 350, 100, 40);
        button_submit.setFont(attributeFont);
        button_submit.addActionListener(new LogInAttributeCheck());
        c.add(button_submit);

        this.setVisible(true);

    }
}

/* what the submit action listener has performed here */
class LogInAttributeCheck implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {

        String entered_userID = LOG_IN_Frame.text_userid.getText();
        String entered_password = LOG_IN_Frame.passwordField.getText();

        if (entered_userID.equals("RishavDas") && entered_password.equals("adgjkaw1")) {
            JOptionPane.showMessageDialog(null, "Successfully Logged In", "Authorization Successfull",
                    JOptionPane.INFORMATION_MESSAGE);
            //calling the service frame
            Services.main(null);
        } else {
            JOptionPane.showMessageDialog(null, "You Have Entered wrong user id or password", "Authorization Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
}
//main function just to call the log in frame and its constructor
@SuppressWarnings("unused")
public class MainFrame {
    public static void main(String[] args) {

        LOG_IN_Frame LogIn = new LOG_IN_Frame();

    }
}
