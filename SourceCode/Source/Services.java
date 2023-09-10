package ServicesWindow;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.SwingConstants;

class ServiceFrame extends JFrame {

    JFrame frame_service;
    JPanel panel_content, panel_button;
    JSplitPane splitpane;
    JButton button_createAccount, button_accountInformation, button_deposit, button_withdraw;

    ServiceFrame() {

        frame_service = new JFrame("Service Window");
        frame_service.setSize(900, 500);
        frame_service.setLocationRelativeTo(null);
        frame_service.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame_service.setResizable(true);

        button_createAccount = new JButton("Create Account");
        button_createAccount.setBackground(new Color(95, 92, 237));
        button_accountInformation = new JButton("Account Information");
        button_accountInformation.setBackground(new Color(128, 125, 238));
        button_deposit = new JButton("Deposit");
        button_deposit.setBackground(new Color(158, 156, 233));
        button_withdraw = new JButton("Withdraw");
        button_withdraw.setBackground(new Color(201, 200, 237));

        panel_content = new JPanel();
        panel_button = new JPanel();

        panel_content.setBackground(Color.GRAY);

        panel_button.setLayout(new GridLayout(4, 1));
        panel_button.add(button_createAccount);
        panel_button.add(button_accountInformation);
        panel_button.add(button_deposit);
        panel_button.add(button_withdraw);

        splitpane = new JSplitPane(SwingConstants.VERTICAL, panel_button, panel_content);
        splitpane.setOrientation(SwingConstants.VERTICAL);
        frame_service.add(splitpane);

        frame_service.setVisible(true);
    }
}

@SuppressWarnings("unused")
public class Services {
    public static void main(String[] args) {
        ServiceFrame serviceFrame = new ServiceFrame();
    }
}
