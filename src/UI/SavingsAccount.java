package UI;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class SavingsAccount {
    private double balance;

    public SavingsAccount() {
        balance = 10000;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    public void displayBalance() {
        System.out.println("Current balance: " + balance);
    }

    public double getBalance() {
        return balance;
    }
}

class SavingsAccountFrame extends JFrame implements ActionListener {
    private JLabel balanceLabel;
    private JTextField amountField;
    private JButton depositButton;
    private JButton withdrawButton;
    private JButton displayButton;
    private SavingsAccount bank;

    public SavingsAccountFrame() {
        bank = new SavingsAccount();

        balanceLabel = new JLabel("Current balance: " + bank.getBalance());

        amountField = new JTextField(10);

        depositButton = new JButton("Deposit");
        depositButton.addActionListener(this);

        withdrawButton = new JButton("Withdraw");
        withdrawButton.addActionListener(this);

        displayButton = new JButton("Display Balance");
        displayButton.addActionListener(this);

        JPanel panel = new JPanel();
        panel.add(balanceLabel);
        panel.add(new JLabel("Amount: "));
        panel.add(amountField);
        panel.add(depositButton);
        panel.add(withdrawButton);
        panel.add(displayButton);

        getContentPane().add(panel, BorderLayout.CENTER);

        setTitle("Savings Account");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == depositButton) {
            double amount = Double.parseDouble(amountField.getText());
            bank.deposit(amount);
            balanceLabel.setText("Current balance: " + bank.getBalance());
            amountField.setText("");
        } else if (e.getSource() == withdrawButton) {
            double amount = Double.parseDouble(amountField.getText());
            bank.withdraw(amount);
            balanceLabel.setText("Current balance: " + bank.getBalance());
            amountField.setText("");
        } else if (e.getSource() == displayButton) {
            balanceLabel.setText("Current balance: " + bank.getBalance());
        }
    }

    public static void main(String[] args) {
        new SavingsAccountFrame();
    }
}
