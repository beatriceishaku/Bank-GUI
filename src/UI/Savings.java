package UI;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Savings extends BankUI{
    public static final String FILE_PATH = "savings.txt";
    public static int amount;

    public class Withdraw extends JFrame implements ActionListener{
            JFrame frame;
            JLabel withdrawFrame = new JLabel("Withdraw");
            JButton firstAmount = new JButton("1,000");
            JButton secondAmount = new JButton("2,000");
            JButton thirdAmount = new JButton("5,000");
            JButton fourthAmount = new JButton("10,000");
            JButton fifthAmount = new JButton("20,000");
            JButton sixthAmount = new JButton("40,000");
            JLabel otherAmountLabel = new JLabel("Other Amount:");
            JTextField otherAmount = new JTextField(30);
            JButton performTransaction = new JButton("Withdraw");

            public Withdraw() {
                frame = new JFrame();
                addActionEvent();
                int amount = 100_000;

                frame.add(withdrawFrame);
                frame.add(firstAmount);
                frame.add(secondAmount);
                frame.add(thirdAmount);
                frame.add(fourthAmount);
                frame.add(fifthAmount);
                frame.add(sixthAmount);
                frame.add(otherAmountLabel);
                frame.add(otherAmount);
                frame.add(performTransaction);

                withdrawFrame.setBounds(230,50,150,40);
                firstAmount.setBounds(110,100,100,40);
                secondAmount.setBounds(110,200,100,40);
                thirdAmount.setBounds(110,300,100,40);
                fourthAmount.setBounds(310,100,100,40);
                fifthAmount.setBounds(310,200,100,40);
                sixthAmount.setBounds(310,300,100,40);
                otherAmountLabel.setBounds(140,370,100,40);
                otherAmount.setBounds(180,410,150,40);
                performTransaction.setBounds(200,470,100,40);

                frame.setLayout(null);
                frame.setSize(500,600);


                frame.setVisible(true);
                frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


                firstAmount.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        int answer = JOptionPane.showConfirmDialog(null,"You are about to withdraw 1,000 naira \n\n" +"Do you wish to continue?" + "\n","Confirm Payment", JOptionPane.YES_NO_OPTION);
                        switch (answer) {
                            case JOptionPane.YES_OPTION:
                                BankUI bankUI = new BankUI();
                                int balance = amount - 1000;
                                JOptionPane.showMessageDialog(null,"Your new Balance is " + balance);
                                break;
                            case JOptionPane.NO_OPTION:
                                break;
                        }
                    }
                });

                secondAmount.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        int answer = JOptionPane.showConfirmDialog(null,"You are about to withdraw 2,000 naira \n\n" +"Do you wish to continue?" + "\n","Confirm Payment", JOptionPane.YES_NO_OPTION);
                        switch (answer) {
                            case JOptionPane.YES_OPTION:
                                int balance = amount - 2000;
                                JOptionPane.showMessageDialog(null,"Your new Balance is " + balance);
                                break;
                            case JOptionPane.NO_OPTION:
                                break;
                        }
                    }
                });

                thirdAmount.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        int answer = JOptionPane.showConfirmDialog(null,"You are about to withdraw 5,000 naira \n\n" +"Do you wish to continue?" + "\n","Confirm Payment", JOptionPane.YES_NO_OPTION);
                        switch (answer) {
                            case JOptionPane.YES_OPTION:
                                int balance = amount - 5000;
                                JOptionPane.showMessageDialog(null,"Your new Balance is " + balance);
                                break;
                            case JOptionPane.NO_OPTION:
                                break;
                        }
                    }
                });

                fourthAmount.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        int answer = JOptionPane.showConfirmDialog(null,"You are about to withdraw 10,000 naira \n\n" +"Do you wish to continue?" + "\n","Confirm Payment", JOptionPane.YES_NO_OPTION);
                        switch (answer) {
                            case JOptionPane.YES_OPTION:
                                int balance = amount - 10_000;
                                JOptionPane.showMessageDialog(null,"Your new Balance is " + balance);
                                break;
                            case JOptionPane.NO_OPTION:
                                break;
                        }
                    }
                });

                fifthAmount.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        int answer = JOptionPane.showConfirmDialog(null,"You are about to withdraw 20,000 naira \n\n" +"Do you wish to continue?" + "\n","Confirm Payment", JOptionPane.YES_NO_OPTION);
                        switch (answer) {
                            case JOptionPane.YES_OPTION:
                                int balance = amount - 20_000;
                                JOptionPane.showMessageDialog(null,"Your new Balance is " + balance);
                                break;
                            case JOptionPane.NO_OPTION:
                                break;
                        }
                    }
                });

                sixthAmount.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        int answer = JOptionPane.showConfirmDialog(null,"You are about to withdraw 40,000 naira \n\n" +"Do you wish to continue?" + "\n","Confirm Payment", JOptionPane.YES_NO_OPTION);
                        switch (answer) {
                            case JOptionPane.YES_OPTION:
                                int balance = amount - 40_000;
                                JOptionPane.showMessageDialog(null,"Your new Balance is " + balance);
                                break;
                            case JOptionPane.NO_OPTION:
                                break;
                        }
                    }
                });

                performTransaction.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        int transaction = Integer.parseInt(otherAmount.getText());
                        int answer = JOptionPane.showConfirmDialog(null,"You are about to withdraw \n\n" + transaction + " naira" + "\n" + "Do you wish to continue?","Confirm Payment", JOptionPane.YES_NO_OPTION);

                        switch (answer) {
                            case JOptionPane.YES_OPTION:
                                int balance = amount - transaction;
                                JOptionPane.showMessageDialog(null,"Your new Balance is " + balance);
                                break;
                            case JOptionPane.NO_OPTION:
                                break;

                        }
                    }
                });

            }

            public void addActionEvent() {
                firstAmount.addActionListener(this);
                secondAmount.addActionListener(this);
                thirdAmount.addActionListener(this);
                fourthAmount.addActionListener(this);
                fifthAmount.addActionListener(this);
                sixthAmount.addActionListener(this);
                performTransaction.addActionListener(this);
            }

            @Override
            public void actionPerformed(ActionEvent e) {

            }
        }
         public class Deposit extends JFrame implements ActionListener{
            JFrame frame;

            JLabel depositFrame = new JLabel("DEPOSIT");
            JButton firstAmount = new JButton("1,000");
            JButton secondAmount = new JButton("2,000");
            JButton thirdAmount = new JButton("5,000");
            JButton fourthAmount = new JButton("10,000");
            JButton fifthAmount = new JButton("20,000");
            JButton sixthAmount = new JButton("40,000");
            JLabel otherAmountLabel = new JLabel("Other Amount:");
            JTextField otherAmount = new JTextField(30);
            JButton performTransaction = new JButton("Deposit");

            public Deposit() {
                frame = new JFrame();
                addActionEvent();

        //        Random random = new Random();
        //        int amount = 10_000 + random.nextInt(99999);
                int amount = 100_000;

                frame.add(depositFrame);
                frame.add(firstAmount);
                frame.add(secondAmount);
                frame.add(thirdAmount);
                frame.add(fourthAmount);
                frame.add(fifthAmount);
                frame.add(sixthAmount);
                frame.add(otherAmountLabel);
                frame.add(otherAmount);
                frame.add(performTransaction);


                depositFrame.setBounds(230,50,150,40);
                firstAmount.setBounds(110,100,100,40);
                secondAmount.setBounds(110,200,100,40);
                thirdAmount.setBounds(110,300,100,40);
                fourthAmount.setBounds(310,100,100,40);
                fifthAmount.setBounds(310,200,100,40);
                sixthAmount.setBounds(310,300,100,40);
                otherAmountLabel.setBounds(110,370,100,40);
                otherAmount.setBounds(170,410,150,40);
                performTransaction.setBounds(190,460,100,40);

                frame.setLayout(null);
                frame.setSize(500,600);


                frame.setVisible(true);
                frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

                firstAmount.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        int answer = JOptionPane.showConfirmDialog(null,"You are about to deposit 1,000 naira \n\n" +"Do you wish to continue?" + "\n","Confirm Payment", JOptionPane.YES_NO_OPTION);
                        switch (answer) {
                            case JOptionPane.YES_OPTION:
                                int balance = amount + 1000;
                                JOptionPane.showMessageDialog(null,"Your new Balance is " + balance);
                                break;
                            case JOptionPane.NO_OPTION:
                                break;
                        }
                    }
                });

                secondAmount.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        int answer = JOptionPane.showConfirmDialog(null,"You are about to deposit 2,000 naira \n\n" +"Do you wish to continue?" + "\n","Confirm Payment", JOptionPane.YES_NO_OPTION);
                        switch (answer) {
                            case JOptionPane.YES_OPTION:
                                int balance = amount + 2000;
                                JOptionPane.showMessageDialog(null,"Your new Balance is " + balance);
                                break;
                            case JOptionPane.NO_OPTION:
                                break;
                        }
                    }
                });

                thirdAmount.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        int answer = JOptionPane.showConfirmDialog(null,"You are about to deposit 5,000 naira \n\n" +"Do you wish to continue?" + "\n","Confirm Payment", JOptionPane.YES_NO_OPTION);
                        switch (answer) {
                            case JOptionPane.YES_OPTION:
                                int balance = amount + 5000;
                                JOptionPane.showMessageDialog(null,"Your new Balance is " + balance);
                                break;
                            case JOptionPane.NO_OPTION:
                                break;
                        }
                    }
                });

                fourthAmount.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        int answer = JOptionPane.showConfirmDialog(null,"You are about to deposit 10,000 naira \n\n" +"Do you wish to continue?" + "\n","Confirm Payment", JOptionPane.YES_NO_OPTION);
                        switch (answer) {
                            case JOptionPane.YES_OPTION:
                                int balance = amount + 10_000;
                                JOptionPane.showMessageDialog(null,"Your new Balance is " + balance);
                                break;
                            case JOptionPane.NO_OPTION:
                                break;
                        }
                    }
                });

                fifthAmount.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        int answer = JOptionPane.showConfirmDialog(null,"You are about to deposit 20,000 naira \n\n" +"Do you wish to continue?" + "\n","Confirm Payment", JOptionPane.YES_NO_OPTION);
                        switch (answer) {
                            case JOptionPane.YES_OPTION:
                                int balance = amount + 20_000;
                                JOptionPane.showMessageDialog(null,"Your new Balance is " + balance);
                                break;
                            case JOptionPane.NO_OPTION:
                                break;
                        }
                    }
                });

                sixthAmount.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        int answer = JOptionPane.showConfirmDialog(null,"You are about to deposit 40,000 naira \n\n" +"Do you wish to continue?" + "\n","Confirm Payment", JOptionPane.YES_NO_OPTION);
                        switch (answer) {
                            case JOptionPane.YES_OPTION:
                                int balance = amount + 40_000;
                                JOptionPane.showMessageDialog(null,"Your new Balance is " + balance);
                                break;
                            case JOptionPane.NO_OPTION:
                                break;
                        }
                    }
                });

                performTransaction.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        int transaction = Integer.parseInt(otherAmount.getText());
                        int answer = JOptionPane.showConfirmDialog(null,"You are about to deposit \n\n" + transaction + " naira" + "\n" + "Do you wish to continue?","Confirm Payment", JOptionPane.YES_NO_OPTION);
                        String deposit = String.valueOf(amount + transaction);
                        switch (answer) {
                            case JOptionPane.YES_OPTION:
                                int balance = amount + transaction;
                                JOptionPane.showMessageDialog(null,"Your new Balance is " + balance);
                                break;
                            case JOptionPane.NO_OPTION:
                                break;
                        }
                    }
                });

            }
            public void addActionEvent() {
                firstAmount.addActionListener(this);
                secondAmount.addActionListener(this);
                thirdAmount.addActionListener(this);
                fourthAmount.addActionListener(this);
                fifthAmount.addActionListener(this);
                sixthAmount.addActionListener(this);
                performTransaction.addActionListener(this);
            }

            @Override
            public void actionPerformed(ActionEvent e) {



            }

        }

    public static void saveAccountData(String accountHolder, int balance) {
        try (FileWriter writer = new FileWriter(FILE_PATH)) {
            // Get the current date and time
            LocalDateTime dateTime = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

            // Write the account data with date and time to the file
            writer.write("Account Holder: " + accountHolder + "\n");
            writer.write("Balance: " + balance + "\n");
            writer.write("Date and Time: " + dateTime.format(formatter) + "\n");

            System.out.println("Account data saved successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while saving account data: " + e.getMessage());
        }
    }

    public class WithdrawalAmount {
        Scanner input = new Scanner(System.in);
        int withdrawalAmount;

        public WithdrawalAmount() {
            withdrawalAmount = input.nextInt();
            // Add validation and error handling for withdrawalAmount here
        }
    }
}
