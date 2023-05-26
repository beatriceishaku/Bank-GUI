package UI;

import javax.swing.*;
import java.awt.*;

public class BankUI extends JFrame{
    public JButton depositButton;
    public JButton withdrawButton;
    public JFrame bankFrame;
    public JLabel welcomeText;
    public JTextField inputPin;
    public JButton login;
    public JFrame selectionFrame;
    public JLabel accountChoice;
    public JButton current;
    public JButton savings;
    public JFrame choiceFrame;
    public JLabel choice;
    public JFrame currentAccount;
    public JLabel withdrawC;
    public JLabel amountWithdraw;
    public JTextField amountInput;
    public JButton withdrawBtn;
    public JTextArea depositC;
    public JLabel amountDeposit;
    public JButton depositBtn;
    public JFrame savingsAccount;
    public JTextArea withdrawS;
    public JTextArea depositS;

    public final float currentAmount = 100000; // Placeholder for the current account balance
    public final float savingsAmount = 100000; // Placeholder for the savings account balance

    public void mainUI() {
        bankFrame = new JFrame("Welcome");
        welcomeText = new JLabel("Welcome to Zenith Bank. Input your PIN");
        inputPin = new JTextField(4);
        login = new JButton("Login");
        selectionFrame = new JFrame("Account Selection");
        accountChoice = new JLabel("Which Account do you wish to open?");
        current = new JButton("Current Account");
        savings = new JButton("Savings Account");
        choiceFrame = new JFrame("Action");
       
        
        choice = new JLabel("What action do you want to perform?");
        currentAccount = new JFrame("Current Account");
        withdrawC = new JLabel("you have $"+ Current.amount);
        amountWithdraw = new JLabel("How much do you want to Withdraw?");
        amountInput = new JTextField();
        withdrawBtn = new JButton("Withdraw");
        depositC = new JTextArea("you have $"+ Current.amount);
        amountDeposit = new JLabel("How much do you want to Deposit?");
        depositBtn = new JButton("Deposit");
        savingsAccount = new JFrame("Savings Account");
        withdrawS = new JTextArea("you have $"+ Savings.amount);
        depositS = new JTextArea("you have $"+ Savings.amount);

        bankFrame.add(welcomeText);
        bankFrame.add(inputPin);
        bankFrame.add(login);
        bankFrame.setSize(250, 200);
        bankFrame.setVisible(true);
        bankFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        bankFrame.setLayout(new FlowLayout(FlowLayout.LEADING));

        login.addActionListener(e -> {
            try {
                float pin = Float.parseFloat(inputPin.getText());
                if (pin == 5555) {
                    selectionFrame.add(accountChoice);
                    selectionFrame.add(current);
                    selectionFrame.add(savings);
                    selectionFrame.setLayout(new FlowLayout(FlowLayout.LEADING));
                    selectionFrame.setVisible(true);
                    selectionFrame.setSize(250, 200);
                    selectionFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid Pin");
                }
            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null, "Please input a valid number");
            }
        });

        current.addActionListener(e -> {
            choiceFrame.add(depositButton);
            choiceFrame.setLayout(null);
            choiceFrame.add(withdrawButton);
            depositButton.setBounds(50,100,170,40);
            withdrawButton.setBounds(250,100,170,40);

            choiceFrame.setVisible(true);
            choiceFrame.setSize(500, 450);
            choiceFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        });

        savings.addActionListener(e -> {
            choiceFrame.add(depositButton);
            choiceFrame.setLayout(null);
            choiceFrame.add(withdrawButton);
            depositButton.setBounds(50,100,170,40);
            withdrawButton.setBounds(250,100,170,40);

            choiceFrame.setVisible(true);
            choiceFrame.setSize(500, 450);
            choiceFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        });
    }
}
