package UI;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
// savings account

class SavingsAccount {
    public int balance;

    public SavingsAccount() {
        balance = 10000;
    }
// deposit function
    
    public void deposit(double amount) {
        balance += amount;
    }
// withdraw function 
    
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds!");
        }
    }
// show amount button
    
    public void displayBalance() {
        System.out.println("Current balance: " + balance);
    }

    public int getBalance() {
        return balance;
    }
}

class SavingsAccountFrame extends JFrame implements ActionListener {
     // savings frame
    public JLabel balanceLabel;
   
    public JTextField amountField;
    public JButton depositButton;
    public JButton withdrawButton;
    public JButton displayButton;
    public SavingsAccount bank;

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
//placing the buttons
        
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
// function for the buttons
    
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
