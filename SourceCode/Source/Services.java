package ServicesWindow;

import CreateAccountWindow.CreateAccount;
import AccountInformationWindow.AccountInformation;
import DepositWindow.Deposit;
import WithdrawWindow.Withdraw;

import java.awt.Color;
import java.awt.FlowLayout;
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
    
    
    JButton button_createAccount, button_accountInformation, button_deposit, button_withdraw;

    ServiceFrame() {

        frame_service = new JFrame("Service Window");
        frame_service.setSize(900, 100);
        frame_service.setLocationRelativeTo(null);
        frame_service.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        frame_service.setResizable(true);
        frame_service.setLayout(new FlowLayout());

        button_createAccount = new JButton("Create Account");
        button_createAccount.setBackground(new Color(95, 92, 237));
        button_createAccount.addActionListener(new CreateAccountActionListener());

        button_accountInformation = new JButton("Account Information");
        button_accountInformation.setBackground(new Color(128, 125, 238));
        button_accountInformation.addActionListener(new AccountInformationActionListener());

        button_deposit = new JButton("Deposit");
        button_deposit.setBackground(new Color(158, 156, 233));
        button_deposit.addActionListener(new DepositActionListener());

        button_withdraw = new JButton("Withdraw");
        button_withdraw.setBackground(new Color(201, 200, 237));
        button_withdraw.addActionListener(new WithdrawActionListener());

        frame_service.add(button_createAccount);
        frame_service.add(button_accountInformation);
        frame_service.add(button_deposit);
        frame_service.add(button_withdraw);


        frame_service.setVisible(true);
    }
}

class CreateAccountActionListener implements ActionListener{
    public void actionPerformed(ActionEvent e){
        CreateAccount.main(null);
    }
}
class AccountInformationActionListener implements ActionListener{
    public void actionPerformed(ActionEvent e){
        AccountInformation.main(null);
    }
}
class DepositActionListener implements ActionListener{
    public void actionPerformed(ActionEvent e){
        Deposit.main(null);
    }
}
class WithdrawActionListener implements ActionListener{
    public void actionPerformed(ActionEvent e){
        Withdraw.main(null);
    }
}

@SuppressWarnings("unused")
public class Services {
    public static void main(String[] args) {
        ServiceFrame serviceFrame = new ServiceFrame();
    }
}
