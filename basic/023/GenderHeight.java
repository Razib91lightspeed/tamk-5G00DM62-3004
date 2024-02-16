/**
 * The GenderHeightDisplay class determines the classification of individuals based on gender and height.
 * It provides a method to classify individuals and display the corresponding label.
 *
 * @author Razib Hasan <razib.hasan@tuni.fi>
 * @version 2024.0131 (last modified)
 * @since 17.0 (minimum Java version)
 */
public class GenderHeight {

    final int MALE = 0;
    final int FEMALE = 1;

    /**
     * Writes a program that solves the problem using logical operators.
     *
     * @param args Command line arguments. Not used.
     */
    public static void main(String[] args) {
        GenderHeight genderHeightDisplay = new GenderHeight();

        final int gender = genderHeightDisplay.MALE; // Change this value to MALE or FEMALE as desired
        int height = 175; // Change this value to the individual's height

        String result = genderHeightDisplay.classifyIndividual(gender, height);
        System.out.println(result);
    }

    /**
     * Classifies the individual based on gender and height.
     *
     * @param gender The gender of the individual (MALE or FEMALE).
     * @param height The height of the individual in centimeters.
     * @return The classification label for the individual.
     */
    public String classifyIndividual(int gender, int height) {
        if (gender == MALE) {
            if (height < 180) {
                return "Short male";
            } else if (height >= 180 && height <= 187) {
                return "Normal male";
            } else {
                return "Tall male";
            }
        } else if (gender == FEMALE) {
            if (height < 175) {
                return "Short female";
            } else if (height >= 175 && height <= 182) {
                return "Normal female";
            } else {
                return "Tall female";
            }
        } else {
            return "Unknown gender";
        }
    }
}
