package UI;

import java.util.Scanner;

public class Current {
    public static final int amount = 100000;
    private static final int maximumAmount = 20000;

    public static class Amount {
        public void readWithdrawalAmount() {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the withdrawal amount: ");
            int withdrawalAmount = input.nextInt();
            
            if (withdrawalAmount <= maximumAmount) {
                processWithdrawal(withdrawalAmount);
            } else {
                System.out.println("Withdrawal amount exceeds the maximum limit.");
            }
        }
        
        private void processWithdrawal(int amount) {
            // Code to process the withdrawal amount can be added here
            System.out.println("Processing withdrawal of " + amount + "...");
        }
    }
    
   }

