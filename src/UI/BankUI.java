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
        withdrawC = new JLabel("you have $");
        amountWithdraw = new JLabel("How much do you want to Withdraw?");
        amountInput = new JTextField();
        withdrawBtn = new JButton("Withdraw");
        depositC = new JTextArea("you have $");
        amountDeposit = new JLabel("How much do you want to Deposit?");
        depositBtn = new JButton("Deposit");
        savingsAccount = new JFrame("Savings Account");
        withdrawS = new JTextArea("you have $");
        depositS = new JTextArea("you have $");

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

        });
    }
}
