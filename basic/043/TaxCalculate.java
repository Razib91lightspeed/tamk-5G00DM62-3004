/**
 * The TaxCalculator class calculates taxes based on the yearly salary and tax percentage.
 * It provides a method to calculate yearly taxes.
 *
 * @author Razib Hasan <razib.hasan@tuni.fi>
 * @version 2024.0131 (last modified)
 * @since 17.0 (minimum Java version)
 */
public class TaxCalculate {

    /**
     * Calculates yearly taxes based on the yearly salary and tax percentage.
     *
     * @param yearlySalary The yearly salary of the individual.
     * @param percentage   The tax percentage to be applied.
     * @return The amount of taxes to be paid yearly.
     */
    public double yearlyTaxes(double yearlySalary, double percentage) {
        return yearlySalary * (percentage / 100.0);
    }

    /**
     * Mains method to run the program.
     *
     * @param args Command line arguments. Not used.
     */
    public static void main(String[] args) {
        double yearlySalary = 50000.0;
        double percentage = 25.0;
        TaxCalculate taxCalculator = new TaxCalculate();
        double taxes = taxCalculator.yearlyTaxes(yearlySalary, percentage);
        System.out.println("Yearly taxes: " + taxes);
    }
}
