package Week_2_PLSQL_Exercises;
public class Exercise1_ControlStructures {
    public static void processCustomer(int customerId, double currentBalance, int creditScore) {
        System.out.println("\n[Control Structures] Checking Customer ID: " + customerId);
        
        // Scenario A: Bonus / Interest Discount Tier Logic
        double baseInterestRate = 8.5;
        double finalInterestRate;
        
        if (creditScore >= 750) {
            finalInterestRate = baseInterestRate - 1.0; 
            System.out.println("-> VIP Status (Score: " + creditScore + "): Applied 1% interest discount.");
        } else if (creditScore >= 650) {
            finalInterestRate = baseInterestRate - 0.5;
            System.out.println("-> Standard Status (Score: " + creditScore + "): Applied 0.5% interest discount.");
        } else {
            finalInterestRate = baseInterestRate;
            System.out.println("-> Regular Status (Score: " + creditScore + "): No discount applicable.");
        }
        System.out.printf("-> Final Configured Loan Rate: %.2f%%\n", finalInterestRate);

        // Scenario B: Balance Threshold Alert
        double creditLimit = 50000.0;
        if (currentBalance > (creditLimit * 0.85)) {
            System.out.println("-> ALERT: Account balance exceeds 85% limit! Notification sent.");
        } else {
            System.out.println("-> Status: Account balance within normal operating limits.");
        }
    }

    public static void main(String[] args) {
        System.out.println("=== EXERCISE 1: CONTROL STRUCTURES TRACE ===");
        processCustomer(1001, 46000.0, 780);
        processCustomer(1002, 12000.0, 610);
    }
}