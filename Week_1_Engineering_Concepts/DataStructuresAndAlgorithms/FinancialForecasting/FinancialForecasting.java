package Week_1_Engineering_Concepts.DataStructuresAndAlgorithms.FinancialForecasting;
public class FinancialForecasting {

    /**
     * Recursive method to calculate future asset/portfolio value
     * Formula applied recursively: FV = PV * (1 + growthRate)
     * * Time Complexity: O(n) where n is the number of periods (years)
     * Space Complexity: O(n) due to call stack overhead.
     */
    public static double calculateFutureValue(double presentValue, double growthRate, int periods) {
        // Base case: If no more years left to forecast, return current value
        if (periods == 0) {
            return presentValue;
        }
        // Recursive step: Calculate value for the next period decreasing periods by 1
        return calculateFutureValue(presentValue * (1 + growthRate), growthRate, periods - 1);
    }

    public static void main(String[] args) {
        double initialInvestment = 1000.0; // Present Value (PV)
        double annualGrowthRate = 0.05;    // 5% growth rate
        int forecastingYears = 5;          // Total periods (N)

        System.out.println("=== Financial Forecasting Tool ===");
        System.out.println("Initial Investment: ₹" + initialInvestment);
        System.out.println("Expected Annual Growth: " + (annualGrowthRate * 100) + "%");
        System.out.println("Forecasting Window: " + forecastingYears + " Years");

        double projectedValue = calculateFutureValue(initialInvestment, annualGrowthRate, forecastingYears);
        
        System.out.printf("\nPredicted Value after %d years: ₹%.2f\n", forecastingYears, projectedValue);
    }
}