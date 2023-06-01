package UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Bank_Gui extends JFrame{

    JFrame bankFrame = new JFrame("Hello");
    JLabel bankLabel = new JLabel("Welcome to Curry Bank");
    JTextArea bankArea = new JTextArea("Dear Customer which account do you want to use");
    JButton bankButton = new JButton("Current Account");

    JButton bankButton2 = new JButton("Savings Account");

    JFrame CurrentAccount = new JFrame("Welcome to your Current Please Make your Transaction");

    JButton Currentaccount = new JButton("Withdrawl");

    JButton getCurrentaccount = new JButton("Deposit");

    JTextArea CurrentAmount = new JTextArea("Amount");
    JTextField CurrentPin = new JTextField("Insert Pin");
    JFrame SavingsAccount = new JFrame("Welcome to your Savings Please Make your Transaction");
    JButton Savingsaccount = new JButton("Withdrawl");
    JButton getSavingsaccount = new JButton("Deposit");
    JTextArea SavingsAmount = new JTextArea( "Amount");
    JTextField SavingsPin = new JTextField("Insert PIn");

    JFrame Currentaccount1 = new JFrame("Kindly Input Your Amount");
    JTextArea Currentaccount2 = new JTextArea("   ");
    JFrame Savingsaccount1 = new JFrame("Kindly Input Your Amount");
    JTextArea Savingsaccount2 = new JTextArea("   ");

    JFrame Currentaccount3 = new JFrame("Kindly Input Your Amount");
    JTextArea Currentaccount4 = new JTextArea("  ");
    JTextArea CurrentAmount1 = new JTextArea( "Amount");

    JFrame Savingsaccount3 = new JFrame("Kindly Input Your Amount");
    JTextArea Savingsaccount4 = new JTextArea("  ");
    JTextArea SavingsAmount1 = new JTextArea( "Amount");


    public void mainUI(){
        bankFrame.add(bankArea);
        bankFrame.add(bankLabel);
        bankFrame.add(bankButton);
        bankFrame.add(bankButton2);

        CurrentAccount.add(Currentaccount);
        CurrentAccount.add(getCurrentaccount);
        // CurrentAccount.add(CurrentAmount);
        //CurrentAccount.add(CurrentPin);


        SavingsAccount.add(getSavingsaccount);
        //  SavingsAccount.add(SavingsAmount);
        SavingsAccount.add(Savingsaccount);
        //SavingsAccount.add(SavingsPin);

        bankFrame.setSize(200,300);
        bankFrame.setLayout(new FlowLayout(FlowLayout.TRAILING));
        bankFrame.setBackground(Color.BLUE);
        bankFrame.setVisible(true);

        Currentaccount1.add(CurrentAmount);
        Currentaccount1.add(Currentaccount2);

        Savingsaccount1.add(SavingsAmount);
        Savingsaccount1.add(Savingsaccount2);

        Currentaccount3.add(CurrentAmount1);
        Currentaccount3.add(Currentaccount4);

        Savingsaccount3.add(SavingsAmount1);
        Savingsaccount3.add(Savingsaccount4);


        ;

        bankButton.addActionListener(e -> {

            CurrentAccount.setSize(200, 300);
            CurrentAccount.setLayout(new FlowLayout(FlowLayout.CENTER));
            CurrentAccount.setVisible(true);
        });
        bankButton2.addActionListener(e -> {
            SavingsAccount.setSize(200,300);
            SavingsAccount.setLayout(new FlowLayout(FlowLayout.CENTER));
            SavingsAccount.setVisible(true);
        });
        Currentaccount.addActionListener(e -> {
            Currentaccount1.setLayout(new FlowLayout(FlowLayout.CENTER));
            Currentaccount1.setSize(200, 300);
            Currentaccount1.setVisible(true);


        });
        Savingsaccount.addActionListener(e -> {
            Savingsaccount1.setSize(200, 300);
            Savingsaccount1.setLayout(new FlowLayout(FlowLayout.CENTER));
            Savingsaccount1.setVisible(true);


        });
        getCurrentaccount.addActionListener(e ->{
            Currentaccount3.setSize(200, 300);
            Currentaccount3.setLayout(new FlowLayout(FlowLayout.CENTER));
            Currentaccount3.setVisible(true);
        });
        getSavingsaccount.addActionListener(e ->{
            Savingsaccount3.setSize(200, 300);
            Savingsaccount3.setLayout(new FlowLayout(FlowLayout.CENTER));
            Savingsaccount3.setVisible(true);
        });



    }
}