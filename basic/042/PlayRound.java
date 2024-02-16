/**
 * The PlayRounds class determines how many rounds a player can afford to play until running out of money.
 * It provides a method to calculate the number of rounds.
 *
 * @author Razib Hasan <razib.hasan@tuni.fi>
 * @version 2024.0131 (last modified)
 * @since 17.0 (minimum Java version)
 */
public class PlayRound {

    /**
     * Determines the number of rounds a player can afford to play until running out of money.
     *
     * @param money      The amount of money the player has.
     * @param roundPrice The price of each round.
     * @return The number of rounds the player can afford to play.
     */
    public double play(double money, double roundPrice) {
        return money / roundPrice;
    }

    /**
     * Mains method to run the program.
     *
     * @param args Command line arguments. Not used.
     */
    public static void main(String[] args) {
        double money = 20.55;
        double roundPrice = 1.5;
        PlayRound playRounds = new PlayRound();
        double rounds = playRounds.play(money, roundPrice);
        System.out.println("Number of rounds: " + rounds);
    }
}
