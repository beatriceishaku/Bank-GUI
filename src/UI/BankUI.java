package UI;

import javax.swing.*;
import java.awt.*;

public class BankUI {
    private JFrame bankFrame;
    private JLabel welcomeText;
    private JTextField inputPin;
    private JButton login;
    private JFrame selectionFrame;
    private JLabel accountChoice;
    private JButton current;
    private JButton savings;
    private JFrame choiceFrame;
    private JLabel choice;
    private JFrame currentAccount;
    private JLabel withdrawC;
    private JLabel amountWithdraw;
    private JTextField amountInput;
    private JButton withdrawBtn;
    private JTextArea depositC;
    private JLabel amountDeposit;
    private JButton depositBtn;
    private JFrame savingsAccount;
    private JTextArea withdrawS;
    private JTextArea depositS;

    private float currentAmount = 0; // Placeholder for the current account balance
    private float savingsAmount = 0; // Placeholder for the savings account balance

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
            choiceFrame.add(withdrawC);
            choiceFrame.setLayout(new FlowLayout(FlowLayout.LEFT));
            choiceFrame.add(withdrawBtn);
            choiceFrame.add(depositBtn);
            choiceFrame.setVisible(true);
            choiceFrame.setSize(250, 200);
            choiceFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        });

        savings.addActionListener(e -> {
            choiceFrame.add(withdrawS);
            choiceFrame.setLayout(new FlowLayout(FlowLayout.LEFT));
            choiceFrame.add(withdrawBtn);
            choiceFrame.add(depositBtn);
            choiceFrame.setVisible(true);
            choiceFrame.setSize(250, 200);
            choiceFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        });

        withdrawBtn.addActionListener(e -> {
            String input = amountInput.getText();
            try {
                float withdrawAmount = Float.parseFloat(input);
                if (withdrawAmount <= 0) {
                    JOptionPane.showMessageDialog(null, "Invalid amount. Please enter a positive value.");
                } else if (choiceFrame.getTitle().equals("Current Account")) {
                    if (withdrawAmount <= currentAmount) {
                        // Perform withdrawal logic for the current account
                        currentAmount -= withdrawAmount;
                        withdrawC.setText("You have $" + currentAmount);
                    } else {
                        JOptionPane.showMessageDialog(null, "Insufficient funds in the current account.");
                    }
                } else if (choiceFrame.getTitle().equals("Savings Account")) {
                    if (withdrawAmount <= savingsAmount) {
                        // Perform withdrawal logic for the savings account
                        savingsAmount -= withdrawAmount;
                        withdrawS.setText("You have $" + savingsAmount);
                    } else {
                        JOptionPane.showMessageDialog(null, "Insufficient funds in the savings account.");
                    }
                }
            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null, "Invalid amount. Please enter a valid number.");
            }
        });

        depositBtn.addActionListener(e -> {
            String input = amountInput.getText();
            try {
                float depositAmount = Float.parseFloat(input);
                if (depositAmount <= 0) {
                    JOptionPane.showMessageDialog(null, "Invalid amount. Please enter a positive value.");
                } else if (choiceFrame.getTitle().equals("Current Account")) {
                    // Perform deposit logic for the current account
                    currentAmount += depositAmount;
                    depositC.setText("You have $" + currentAmount);
                } else if (choiceFrame.getTitle().equals("Savings Account")) {
                    // Perform deposit logic for the savings account
                    savingsAmount += depositAmount;
                    depositS.setText("You have $" + savingsAmount);
                }
            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null, "Invalid amount. Please enter a valid number.");
            }
        });
    }
}
