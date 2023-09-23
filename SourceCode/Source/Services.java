package ServicesWindow;

import CreateAccountWindow.CreateAccount;
import AccountStatementWindow.AccountStatement;
import BalanceEnquiryWindow.BalanceEnquiry;
import FlatCashWindow.FlatCash;
import DepositWindow.DepositFunds;
import PinChangeWindow.PinChange;
import WithdrawWindow.WithdrawFunds;
import DebitCreditWindow.DebitCredit;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class ServiceFrame extends JFrame implements ActionListener {

    static JButton b, b0, b1, b11, b2, b21, b3, b31, b4;

    ServiceFrame() {
        setLayout(null);

        setSize(600, 500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setResizable(false);

        Color color = new Color(204, 252, 232);
        this.getContentPane().setBackground(color);

        JLabel i1 = new JLabel("Welcome to Dashboard");
        i1.setFont(new Font("Arial", Font.BOLD, 26));
        i1.setBounds(150, 10, 300, 100);
        add(i1);

        b = new JButton("CREATE CUSTOMER ACCOUNT");
        b.setBounds(70, 140, 220, 20);
        b.addActionListener(this);
        add(b);

        b0 = new JButton("ACCOUNT STATEMENT");
        b0.setBounds(320, 140, 220, 20);
        b0.addActionListener(this);
        add(b0);

        b1 = new JButton("BALANCE ENQUIRY");
        b1.setBounds(100, 200, 150, 20);
        b1.addActionListener(this);
        add(b1);

        b11 = new JButton("FAST CASH");
        b11.setBounds(340, 200, 150, 20);
        b11.addActionListener(this);
        add(b11);

        b2 = new JButton("DEPOSIT FUNDS");
        b2.setBounds(100, 260, 150, 20);
        b2.addActionListener(this);
        add(b2);

        b21 = new JButton("PIN CHANGE");
        b21.setBounds(340, 260, 150, 20);
        b21.addActionListener(this);
        add(b21);

        b3 = new JButton("WITHDRAW FUNDS");
        b3.setBounds(100, 320, 150, 20);
        b3.addActionListener(this);
        add(b3);

        b31 = new JButton("DEBIT/CREDIT");
        b31.setBounds(340, 320, 150, 20);
        b31.addActionListener(this);
        add(b31);

        b4 = new JButton("LOG OUT");
        b4.setBounds(220, 400, 150, 20);
        b4.addActionListener(this);
        add(b4);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        // create customer account
        if (e.getSource() == ServiceFrame.b) {
            CreateAccount.main(null);
        }
        // account statement
        if (e.getSource() == ServiceFrame.b0) {
            AccountStatement.main(null);
        }
        // balance enquiry
        if (e.getSource() == ServiceFrame.b1) {
            BalanceEnquiry.main(null);
        }
        // flat cash
        if (e.getSource() == ServiceFrame.b11) {
            FlatCash.main(null);
        }
        // deposit funds
        if (e.getSource() == ServiceFrame.b2) {
            DepositFunds.main(null);
        }
        // pin change
        if (e.getSource() == ServiceFrame.b21) {
            PinChange.main(null);
        }
        // withdraw funds
        if (e.getSource() == ServiceFrame.b3) {
            WithdrawFunds.main(null);
        }
        // debit/ credit
        if (e.getSource() == ServiceFrame.b31) {
            DebitCredit.main(null);
        }
        // log out
        if (e.getSource() == ServiceFrame.b4) {
            System.exit(0);
        }
    }
}

@SuppressWarnings("unused")
public class Services {
    public static void main(String[] args) {
        ServiceFrame dashboard = new ServiceFrame();
    }
}
