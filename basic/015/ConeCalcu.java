/**
 * The ConeCalculator class calculates and displays the volume of a cone.
 * It provides methods to calculate the volume of a cone and display the results.
 *
 * @author Razib Hasan <razib.hasan@tuni.fi>
 * @version 2024.0131 (last modified)
 * @since 17.0 (minimum Java version)
 */
public class ConeCalcu {

    /**
     * Writes the cone calculator program.
     *
     * @param args Command line arguments. Not used.
     */
    public static void main(String[] args) {
        ConeCalcu calculator = new ConeCalcu();
        String result = calculator.calculateAndDisplayConeVolume(7, 9);
        System.out.println(result);
    }

    /**
     * Calculates the volume of a cone given its radius and height.
     *
     * @param radius The radius of the cone.
     * @param height The height of the cone.
     * @return The volume of the cone.
     */
    public double calculateConeVolume(double radius, double height) {
        return (Math.PI * radius * radius * height) / 3;
    }

    /**
     * Calculates the volume of a cone and displays the results.
     *
     * @param radius The radius of the cone.
     * @param height The height of the cone.
     * @return A string representing the cone volume calculation results.
     */
    public String calculateAndDisplayConeVolume(double radius, double height) {
        double volume = calculateConeVolume(radius, height);
        return displayResults(radius, height, volume);
    }

    /**
     * Formats and displays the cone volume calculation results.
     *
     * @param radius The radius of the cone.
     * @param height The height of the cone.
     * @param volume The volume of the cone.
     * @return A string representing the formatted cone volume calculation results.
     */
    public String displayResults(double radius, double height, double volume) {
        return String.format("Radius (r): %.2f\nHeight (h): %.2f\nVolume    : %.2f", radius, height, volume);
    }
}
