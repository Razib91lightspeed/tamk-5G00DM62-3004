/**
 * The ShapeArrow class generates and displays a shape resembling an arrow.
 * The size of the arrow is determined by the specified size and character.
 *
 * @author Razib Hasan <razib.hasan@tuni.fi>
 * @version 2024.0131 (last modified)
 * @since 17.0 (minimum Java version)
 */
public class Arrow {

    private int size; // The size of the arrow
    private char character; // The character used to represent the arrow

    /**
     * Constructs a ShapeArrow object with the given size and character.
     *
     * @param size      The size of the arrow.
     * @param character The character used to represent the arrow.
     */
    public Arrow(int size, char character) {
        this.size = size;
        this.character = character;
    }

    /**
     * Generates and returns the arrow shape as a string.
     *
     * @return The arrow shape as a string.
     */
    public String generateArrow() {
        StringBuilder arrow = new StringBuilder();

        // Generates the arrow shape
        for (int i = 0; i < size; i++) {
            // Append leading spaces for indentation
            for (int j = 0; j < (i < size - 2 ? i : size - 1 - i); j++) {
                arrow.append("    "); // Four spaces for indentation
            }

            // Appends the character pattern for the current row
            for (int j = 0; j < size; j++) {
                arrow.append(character).append(" "); // Append character followed by a space
            }

            arrow.append("\n"); // Move to the next line after each row
        }

        return arrow.toString();
    }

    /**
     * Mains method to run the program.
     *
     * @param args Command line arguments. Not used.
     */
    public static void main(String[] args) {
        int size = 5; // Change this value to set the size of the arrow
        char character = '*'; // Change this character to adjust the displayed character
        Arrow shapeArrow = new Arrow(size, character);
        String arrow = shapeArrow.generateArrow();
        System.out.println(arrow);
    }
}
