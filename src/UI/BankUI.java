package UI;

import javax.swing.*;
import java.awt.*;

public class BankUI {
    JFrame BankFrame = new JFrame("Welcome");
    JLabel WelcomeText = new JLabel("Welcome to Zenith Bank. Input your PIN");
    JTextField inputPin = new JTextField(4);
    JButton login = new JButton("Login");
    JFrame selectionFrame = new JFrame("Account Selection");
    JLabel accountChoice = new JLabel("Which Account do you wish to open?");
    JButton current = new JButton("Current Account");
    JButton savings = new JButton("Savings Account");
    JFrame choiceFrame = new JFrame("Action");
    JLabel choice = new JLabel("What action do you want to perform?");
    JFrame currentAccount = new JFrame("Current Account");
    JLabel withdrawC = new JLabel("you have $" + Current.amount);
    JLabel amountWithdraw = new JLabel("How much do you want to Withdraw?");
    JTextField amountInput = new JTextField();
    JButton withdrawBtn = new JButton("Withdraw");
    JTextArea depositC = new JTextArea("you have $" + Current.amount);
    JLabel amountDeposit = new JLabel("How much do you want to Deposit?");
    JButton depositBtn = new JButton("deposit");
    JFrame savingsAccount = new JFrame("Savings Account");
    JTextArea withdrawS = new JTextArea("you have $" + Savings.amount);
    JTextArea depositS = new JTextArea("you have $" + Savings.amount);


    public void mainUI(){
        BankFrame.add(WelcomeText);
        BankFrame.add(inputPin);
        BankFrame.add(login);
        BankFrame.setSize(250, 200);
        BankFrame.setVisible(true);
        BankFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        BankFrame.setLayout(new FlowLayout(FlowLayout.LEADING));

        login.addActionListener(e ->{
            try {
                float pin = Float.parseFloat(inputPin.getText());
                if (pin == 5555){
                    selectionFrame.add(accountChoice);
                    selectionFrame.add(current);
                    selectionFrame.add(savings);
                    selectionFrame.setLayout(new FlowLayout(FlowLayout.LEADING));
                    selectionFrame.setVisible(true);
                    selectionFrame.setSize(250, 200);
                    selectionFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Invalid Pin");
                }
            }
            catch (NumberFormatException nfe){
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
