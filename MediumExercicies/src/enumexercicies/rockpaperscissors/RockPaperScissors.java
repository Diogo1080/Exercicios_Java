package enumexercicies.rockpaperscissors;

import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many rounds this game has?");
        int numRounds = scanner.nextInt();

        Game game = new Game(numRounds);

        Player player1 = new Player();
        Player player2 = new Player();
        game.start(player1, player2);

    }
}
