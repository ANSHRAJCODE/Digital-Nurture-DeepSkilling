package Week_2_PLSQL_Exercises;
public class Exercise3_StoredProcedures {
    public static void runMonthlyInterestJob(String accountType, double balance) {
        System.out.println("\n[Stored Procedure] Simulating Monthly Batch Calculation Engine...");
        System.out.println("-> Row Input -> Type: " + accountType + " | Current Balance: ₹" + balance);
        
        double annualRate = 0.0;
        if (accountType.equalsIgnoreCase("Savings")) {
            annualRate = 0.04; // 4% standard yield
        } else if (accountType.equalsIgnoreCase("Salary")) {
            annualRate = 0.045; // 4.5% premium yield
        }

        // Simulating monthly interest addition calculations
        double monthlyYield = balance * (annualRate / 12);
        double adjustedBalance = balance + monthlyYield;

        System.out.printf("-> Execution Success: Monthly interest added: ₹%.2f\n", monthlyYield);
        System.out.printf("-> Database Record Updated. New Balance: ₹%.2f\n", adjustedBalance);
    }

    public static void main(String[] args) {
        System.out.println("=== EXERCISE 3: STORED PROCEDURES TRACE ===");
        runMonthlyInterestJob("Savings", 150000.0);
        runMonthlyInterestJob("Salary", 85000.0);
    }
}