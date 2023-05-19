package UI;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Current {
    public static final int amount = 100000;
    private static final int maximumAmount = 20000;

    public static class Amount {
        public void readWithdrawalAmount() {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the withdrawal amount: ");
            int withdrawalAmount = input.nextInt();
            
                    private void writeToFile(int amount) {
            try (FileWriter writer = new FileWriter(FILE_PATH, true)) {
                LocalDateTime now = LocalDateTime.now();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                String dateTime = now.format(formatter);
                String writeUp = "Withdrawal amount: " + amount + ", Date and Time: " + dateTime + "\n";
                
                writer.write(writeUp);
                System.out.println("Withdrawal amount and date/time written to file.");
            } catch (IOException e) {
                System.out.println("An error occurred while writing to file.");
                e.printStackTrace();
            }
        }

            if (withdrawalAmount <= maximumAmount) {
                processWithdrawal(withdrawalAmount);
            } else {
                System.out.println("Withdrawal amount exceeds the maximum limit.");
            }
        }
        
        private void processWithdrawal(int amount) {
            // Code to process the withdrawal amount can be added here
            System.out.println("Processing withdrawal of " + amount + "...");
               } catch (IOException e) {
                System.out.println("An error occurred while writing to file.");
                e.printStackTrace();
            }
        }
        
        public void displayFileContents() {
            try {
                System.out.println("File Contents:");
                String content = Files.readString(Paths.get(FILE_PATH));
                System.out.println(content);
            } catch (IOException e) {
                System.out.println("An error occurred while reading the file.");
                e.printStackTrace();
            }
        }
    }


