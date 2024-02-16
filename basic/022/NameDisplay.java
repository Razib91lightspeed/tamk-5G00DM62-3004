/**
 * The DayNameDisplay class displays the name of the day corresponding to the given day number.
 * It provides a method to display the day name.
 *
 * @author Razib Hasan <razib.hasan@tuni.fi>
 * @version 2024.0131 (last modified)
 * @since 17.0 (minimum Java version)
 */
public class NameDisplay {

    final int MONDAY = 1;
    final int TUESDAY = 2;
    final int WEDNESDAY = 3;
    final int THURSDAY = 4;
    final int FRIDAY = 5;
    final int SATURDAY = 6;
    final int SUNDAY = 7;

    /**
     * Writes the DayNameDisplay program.
     *
     * @param args Command line arguments. Not used.
     */
    public static void main(String[] args) {
        NameDisplay dayNameDisplay = new NameDisplay();
        int today = 1;

        String result = dayNameDisplay.displayDayName(today);
        System.out.println(result);
    }

    /**
     * Displays the name of the day corresponding to the given day number.
     *
     * @param today The day number (1 for Monday, 2 for Tuesday, ..., 7 for Sunday).
     * @return The name of the day corresponding to the given day number.
     */
    public String displayDayName(int today) {
        if (today == MONDAY) {
            return "Monday";
        } else if (today == TUESDAY) {
            return "Tuesday";
        } else if (today == WEDNESDAY) {
            return "Wednesday";
        } else if (today == THURSDAY) {
            return "Thursday";
        } else if (today == FRIDAY) {
            return "Friday";
        } else if (today == SATURDAY) {
            return "Saturday";
        } else if (today == SUNDAY) {
            return "Sunday";
        } else {
            return "Unknown date (" + today + ")";
        }
    }
}
