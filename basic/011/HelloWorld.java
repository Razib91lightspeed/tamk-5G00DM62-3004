/**
 * @author      Razib Hasan <razib.hasan@tuni.fi>
 * @version     2024.0131 (last modified)
 * @since       17.0 (minimum Java version)
 */
class HelloWorld {

    /**
     * Writes the Hello World program.
     *
     * @param args Command line arguments. Not used.
     */
    public static void main(String[] args) {
        String formattedBox = getFormattedNameBox("Razib Hasan");
        System.out.println(formattedBox);
    }

    /**
     * Generates a formatted box containing the provided name.
     *
     * @param name The name to be included in the box.
     * @return A string representing the formatted name box.
     */
    public static String getFormattedNameBox(String name) {
        int length = name.length() + 16; // Considering padding and asterisks

        String border = "*".repeat(length);

        return String.format("%s\n* Hello, I am %s *\n%s\n", border, name, border);
    }
}


