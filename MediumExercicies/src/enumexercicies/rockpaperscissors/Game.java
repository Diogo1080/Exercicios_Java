package enumexercicies.rockpaperscissors;

import java.util.Scanner;

public class Game {
    public void start() {
        Scanner scanner = new Scanner(System.in);
        int numRounds;

        System.out.println("How many rounds this game has?");
        numRounds = scanner.nextInt();

        roundController(numRounds);
    }

    private void roundController(int numRounds) {
        Player player1 = new Player();
        Player player2 = new Player();

        for (int i = 0; i < numRounds; i++) {
            if (player1.getNumPoints() > numRounds / 2 || player2.getNumPoints() > numRounds / 2) {
                break;
            }
            round(player1, player2);

        }

        if (player1.getNumPoints() == player2.getNumPoints()) {
            while (player1.getNumPoints() == player2.getNumPoints()) {
                round(player1, player2);
            }
        } else if (player1.getNumPoints() > player2.getNumPoints()) {
            System.out.println("Player 1 won.");
        } else {
            System.out.println("Player 2 won.");
        }
    }

    private void round(Player player1, Player player2) {

        HandStates player1Hand = player1.getHand();
        HandStates player2Hand = player1.getHand();

        if (player1Hand == player2Hand) {
            return;
        }

        switch (player1Hand) {
            case ROCK -> {
                if (player2Hand == HandStates.PAPER) {
                    player2.addPoint();
                    return;
                }
                player1.addPoint();
            }
            case PAPER -> {
                if (player2Hand == HandStates.SCISSORS) {
                    player2.addPoint();
                    return;
                }
                player1.addPoint();
            }
            case SCISSORS -> {
                if (player2Hand == HandStates.ROCK) {
                    player2.addPoint();
                    return;
                }
                player1.addPoint();
            }
        }
    }
}
