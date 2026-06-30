package Week_2_PLSQL_Exercises;
public class Exercise2_ErrorHandling {
    public static void executeTransaction(double accountBalance, double withdrawAmount, boolean triggerDuplicate) {
        System.out.println("\n[Error Handling] Starting Transaction Simulation...");
        
        try {
            // Simulate Database Unique Constraint Error (e.g., ORA-00001)
            if (triggerDuplicate) {
                throw new Exception("ORA-00001: Unique constraint violation. Customer ID already exists.");
            }

            // Simulate Custom Business Rule Exception (e.g., ORA-20001 Insufficient Funds)
            if (withdrawAmount > accountBalance) {
                throw new ArithmeticException("ORA-20001: Insufficient funds for requested debit.");
            }

            double remaining = accountBalance - withdrawAmount;
            System.out.printf("-> Transaction approved! Remaining balance: ₹%.2f\n", remaining);

        } catch (ArithmeticException e) {
            System.err.println("[PL/SQL APPLICATION EXCEPTION]: " + e.getMessage());
            System.out.println("-> System Action: Rolled back transaction state completely.");
        } catch (Exception e) {
            System.err.println("[PL/SQL SYSTEM EXCEPTION]: " + e.getMessage());
            System.out.println("-> System Action: Rejected insert query to preserve relational integrity.");
        }
    }

    public static void main(String[] args) {
        System.out.println("=== EXERCISE 2: ERROR HANDLING TRACE ===");
        executeTransaction(10000.0, 12500.0, false); // Triggers insufficient funds
        executeTransaction(10000.0, 2000.0, true);   // Triggers unique duplicate insert
    }
}