/**
 * The AlarmClock class emulates an alarm clock by counting backwards until reaching 1, then displaying "ALARM!".
 * It provides a method to emulate an alarm clock.
 *
 * @author Razib Hasan <razib.hasan@tuni.fi>
 * @version 2024.0131 (last modified)
 * @since 17.0 (minimum Java version)
 */
public class Alarm {

    /**
     * Emulates an alarm clock by counting backwards until reaching 1, then displaying "ALARM!".
     *
     * @param args Command line arguments. Not used.
     * @return
     */
    public static void main(String[] args) {
        int max = 10; // Change this value to set the maximum count

        // Loops to count backwards
        for (int i = max; i >= 1; i--) {
            if (i == 1) {
                System.out.println("ALARM!");
            } else {
                System.out.print(i + ", ");
            }
        }
    }
}
