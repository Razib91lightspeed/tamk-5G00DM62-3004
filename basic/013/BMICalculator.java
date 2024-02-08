/**
 * The BMICalculator class calculates and displays the BMI (Body Mass Index).
 *
 * @author Razib Hasan <razib.hasan@tuni.fi>
 * @version 2024.0131 (last modified)
 * @since 17.0 (minimum Java version)
 */
public class BmiCalculator{
    /**
     * Exercise: 1.3
     * Write the BMI calculator program.
     *
     * @param args Command line arguments. Not used.
     */
    public static void main(String[] args) {
        BmiCalculator calculator = new BmiCalculator();
        String result = calculator.calculateAndDisplayBMI(76, 1.75);
        System.out.println(result);
    }

    /**
     * Calculates the BMI based on weight and height.
     *
     * @param weight The weight in kilograms.
     * @param height The height in meters.
     * @return The calculated BMI.
     */
    public double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }

    /**
     * Displays the BMI calculation results.
     *
     * @param weight The weight in kilograms.
     * @param height The height in meters.
     * @param bmi    The calculated BMI.
     * @return A string representing the BMI calculation results.
     */
    public String displayResults(double weight, double height, double bmi) {
        StringBuilder result = new StringBuilder();
        result.append(String.format("Weight (kg): %.2f\n", weight));
        result.append(String.format("Height (m): %.2f\n", height));
        result.append(String.format("BMI       : %.2f\n", bmi));
        return result.toString();
    }

    /**
     * Calculates the BMI based on weight and height, and displays the results.
     *
     * @param weight The weight in kilograms.
     * @param height The height in meters.
     * @return A string representing the BMI calculation results.
     */
    public String calculateAndDisplayBMI(double weight, double height) {
        double bmi = calculateBMI(weight, height);
        return displayResults(weight, height, bmi);
    }
}
