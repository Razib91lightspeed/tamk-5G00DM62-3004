/**
 * The UnderlineDrawer class draws an underline below a given string.
 * It provides a method to draw the underline.
 *
 * @author Razib Hasan <razib.hasan@tuni.fi>
 * @version 2024.0131 (last modified)
 * @since 17.0 (minimum Java version)
 */
public class Drawer {

    /**
     * Draws an underline below the given string and returns it.
     *
     * @param str The string for which the underline is drawn.
     * @return The underline string.
     */
    public String drawUnderline(String str) {
        StringBuilder underline = new StringBuilder();
        int length = str.length();

        // Appends the original string to the result
        underline.append(str).append("\n");

        // Appends the underline
        for (int i = 0; i < length; i++) {
            underline.append("-");
        }
        underline.append("\n"); // Move to the next line

        return underline.toString();
    }

    /**
     * Mains method to run the program.
     *
     * @param args Command line arguments. Not used.
     */
    public static void main(String[] args) {
        Drawer underlineDrawer = new Drawer();
        String str = "This is a test"; // Change this string to draw underline below it
        String underline = underlineDrawer.drawUnderline(str);
        System.out.println(underline);
    }
}
