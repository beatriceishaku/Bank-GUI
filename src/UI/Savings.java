package UI;

import java.util.Scanner;

public class Savings {
    public static final int AMOUNT = 100000;
    private static final int MAXIMUM_AMOUNT = 20000;

    public class WithdrawalAmount {
        Scanner input = new Scanner(System.in);
        int withdrawalAmount;

        public WithdrawalAmount() {
            withdrawalAmount = input.nextInt();
            // Add validation and error handling for withdrawalAmount here
        }
    }
}
