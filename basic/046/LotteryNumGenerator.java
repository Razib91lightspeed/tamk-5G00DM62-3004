import java.util.HashSet;
import java.util.Set;

/**
 * @author Razib Hasan <razib.hasan@tuni.fi>
 * @version 2024.0216
 * @since 17
 */
public class LotteryNumGenerator {

    /**
     * Generates lottery numbers in the range 1 to 40 for 7 values.
     *
     * Each number can appear only once.
     *
     * @return An array of 7 unique lottery numbers.
     */
    public int[] generateLotteryNumbers() {
        int[] lotteryNumbers = new int[7];
        Set<Integer> usedNumbers = new HashSet<>();

        for (int i = 0; i < 7; i++) {
            int number = dice();
            // Ensure the generated number is unique
            while (usedNumbers.contains(number)) {
                number = dice();
            }
            lotteryNumbers[i] = number;
            usedNumbers.add(number);
        }
        return lotteryNumbers;
    }

    /**
     * Simulates rolling a dice and returns a random number between 1 and 40.
     *
     * @return A random number between 1 and 40.
     */
    private int dice() {
        return (int) (Math.random() * 40) + 1;
    }

    /**
     * Implements homework 4.6
     *
     * Main method to demonstrate generating lottery numbers.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        LotteryNumGenerator generator = new LotteryNumGenerator();
        int[] lotteryNumbers = generator.generateLotteryNumbers();

        System.out.print("Lottery: ");
        for (int number : lotteryNumbers) {
            System.out.print(number + ", ");
        }
        System.out.println();
    }
}
// End of file
