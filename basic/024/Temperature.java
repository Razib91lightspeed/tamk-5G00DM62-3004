/**
 * The TemperatureDisplay class determines the weather condition based on city and temperature.
 * It provides a method to determine the weather condition and display the corresponding label.
 *
 * @author Razib Hasan <razib.hasan@tuni.fi>
 * @version 2024.0131 (last modified)
 * @since 17.0 (minimum Java version)
 */
public class Temperature {

    final int Dhaka = 0;
    final int Guangzhou = 1;
    final int Helsinki = 2;

    /**
     * Writes a program that solves the problem using logical operators.
     *
     * @param args Command line arguments. Not used.
     */
    public static void main(String[] args) {
        Temperature temperatureDisplay = new Temperature();

        final int city = temperatureDisplay.Dhaka; // Change this value to TORONTO, MONTREAL, or VANCOUVER as desired
        int temperature = -25; // Change this value to the current temperature

        String result = temperatureDisplay.determineWeather(city, temperature);
        System.out.println(result);
    }

    /**
     * Determines the weather condition based on city and temperature.
     *
     * @param city The city (TORONTO, MONTREAL, or VANCOUVER).
     * @param temperature The temperature in Celsius.
     * @return The weather condition based on the given city and temperature.
     */
    public String determineWeather(int city, int temperature) {
        if (city == Guangzhou && temperature < -20) {
            return "Freezing";
        } else if ((city == Helsinki || city == Dhaka) && temperature < -20) {
            return "Ice Freezing";
        } else if (city == Guangzhou && temperature >= -20) {
            return "Moderate Winter";
        } else if ((city == Helsinki || city == Dhaka) && temperature >= -20 && temperature <= -10) {
            return "Ice Cold";
        } else {
            return "Unknown weather condition";
        }
    }
}
