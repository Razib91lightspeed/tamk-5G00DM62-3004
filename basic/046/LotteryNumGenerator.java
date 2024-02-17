import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * The LotteryGenerator class generates lottery numbers.
 * It provides a method to generate seven unique lottery numbers between 1 and 40, inclusive.
 * The numbers are generated using the rollDice method.
 *
 * @author Razib Hasan <razib.hasan@tuni.fi>
 * @version 2024.0206 (last modified)
 * @since 17.0 (minimum Java version)
 */
public class LotteryNumGenerator {

    /**
     * Generates seven unique lottery numbers between 1 and 40, inclusive.
     * Each number is generated using the rollDice method.
     *
     * @return An array containing seven unique lottery numbers.
     */
    public int[] generateLottery() {

        // Method implementation
        Random random = new Random();
        Set<Integer> lotterySet = new HashSet<>();

        // Generates seven unique lottery numbers
        while (lotterySet.size() < 7) {
            int number = random.nextInt(40) + 1; // Generate a random number between 1 and 40
            lotterySet.add(number);
        }

        // Converts set to array
        int[] lotteryNumbers = new int[7];
        int index = 0;
        for (int num : lotterySet) {
            lotteryNumbers[index++] = num;
        }

        return lotteryNumbers;
    }

    /**
     * Mains method to run the program.
     *
     * @param args Command line arguments. Not used.
     */
    public static void main(String[] args) {
        LotteryNumGenerator lotteryGenerator = new LotteryNumGenerator();
        int[] lotteryNumbers = lotteryGenerator.generateLottery();
        System.out.print("Lottery: ");
        for (int i = 0; i < lotteryNumbers.length - 1; i++) {
            System.out.print(lotteryNumbers[i] + ", ");
        }
        System.out.println(lotteryNumbers[lotteryNumbers.length - 1]);
    }
}
