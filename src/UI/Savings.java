package UI;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Savings {
    public static final String FILE_PATH = "savings.txt";
    public static final String FILE_PATH = "savings.txt";
    public static final int AMOUNT = 100000;
    private static final int MAXIMUM_AMOUNT = 20000;

    public static void saveAccountData(String accountHolder, int balance) {
        try (FileWriter writer = new FileWriter(FILE_PATH)) {
            // Write the account data to the file
            writer.write("Account Holder: " + accountHolder + "\n");
            writer.write("Balance: " + balance + "\n");
            writer.write("Date and Time: " + dateTime.format(formatter) + "\n");


            System.out.println("Account data saved successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while saving account data: " + e.getMessage());
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
