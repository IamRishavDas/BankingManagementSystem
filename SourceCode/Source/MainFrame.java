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
     * Here we have declared the general components which we need to form the frame
     * look
     */

    static JTextField uidtext;
    static JPasswordField passtext;
    JButton b, b2;

    LOG_IN_Frame() {

        setTitle("LOG IN");
        setSize(700, 500);
        setLayout(null);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        // ImageIcon i1 = new
        // ImageIcon(ClassLoader.getSystemResource("pics/23388860.jpg"));
        // Image i3 = i1.getImage().getScaledInstance(100, 100, 100);
        // ImageIcon i4 = new ImageIcon(i3);
        // JLabel i2 = new JLabel(i4);
        // i2.setBounds(150, 10, 100, 100);
        // add(i2);

        Color color = new Color(83, 202, 255);
        getContentPane().setBackground(color);
        JLabel l1 = new JLabel("LOG IN");
        l1.setFont(new Font("Arial", Font.BOLD, 40));
        l1.setBounds(300, 10, 400, 100);
        add(l1);

        JLabel uid = new JLabel("ENTER USER ID");
        uid.setFont(new Font("Arial", Font.BOLD, 18));
        uid.setBounds(150, 100, 150, 100);
        add(uid);

        Font font = new Font("arial black", Font.BOLD, 15);

        uidtext = new JTextField();
        uidtext.setBounds(150, 185, 400, 30);
        uidtext.setFont(font);
        add(uidtext);

        JLabel pass = new JLabel("ENTER PASSWORD");
        pass.setFont(new Font("Arial", Font.BOLD, 18));
        pass.setBounds(150, 200, 400, 100);
        add(pass);

        passtext = new JPasswordField();
        passtext.setBounds(150, 285, 400, 30);
        passtext.setFont(font);
        add(passtext);

        b = new JButton("LOG IN");
        b.setBounds(170, 350, 150, 20);
        b.addActionListener(new LogInAttributeCheck());
        add(b);

        b2 = new JButton("New User");
        b2.setBounds(340, 350, 200, 20);
        b2.addActionListener(new NewUserButtonListener());
        add(b2);

        setVisible(true);

    }
}

/* what the submit action listener has performed here */
class LogInAttributeCheck implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {

        String entered_userID = LOG_IN_Frame.uidtext.getText();
        String entered_password = LOG_IN_Frame.passtext.getText();

        if (entered_userID.equals("RishavDas") && entered_password.equals("adgjkaw1")) {
            JOptionPane.showMessageDialog(null, "Successfully Logged In", "Authorization Successfull",
                    JOptionPane.INFORMATION_MESSAGE);
            // calling the service frame
            Services.main(null);
        } else {
            JOptionPane.showMessageDialog(null, "You Have Entered wrong user id or password", "Authorization Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
}

class NewUserButtonListener implements ActionListener{
    public void actionPerformed(ActionEvent e){
        JOptionPane.showMessageDialog(null, "New user Attribute form", "Sign Up", JOptionPane.INFORMATION_MESSAGE);
    }
}

// main function just to call the log in frame and its constructor
@SuppressWarnings("unused")
public class MainFrame {
    public static void main(String[] args) {

        LOG_IN_Frame LogIn = new LOG_IN_Frame();

    }
}
