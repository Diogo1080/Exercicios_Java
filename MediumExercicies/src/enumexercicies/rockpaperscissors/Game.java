package enumexercicies.rockpaperscissors;


public class Game {
    private final int numRounds;
    private Player p1;
    private Player p2;

    public Game(int numRounds) {
        this.numRounds = numRounds;
    }

    public void start(Player player1, Player player2) {
        this.p1 = player1;
        this.p2 = player2;
        roundController();
    }

    private void roundController() {
        for (int i = 0; i < numRounds; i++) {
            if (p1.getNumPoints() > numRounds / 2 || p2.getNumPoints() > numRounds / 2) {
                break;
            }
            round();
        }

        while (p1.getNumPoints() == p2.getNumPoints()) {
            round();
        }

        if (p1.getNumPoints() > p2.getNumPoints()) {
            System.out.println("Player 1 won.");
            return;
        }
        System.out.println("Player 2 won.");

    }

    private void round() {

        HandStates player1Hand = p1.getHand();
        HandStates player2Hand = p2.getHand();

        if (player1Hand == player2Hand) {
            return;
        }

        switch (player1Hand) {
            case ROCK -> {
                if (player2Hand == HandStates.PAPER) {
                    p2.addPoint();
                    return;
                }
            }
            case PAPER -> {
                if (player2Hand == HandStates.SCISSORS) {
                    p2.addPoint();
                    return;
                }
            }
            case SCISSORS -> {
                if (player2Hand == HandStates.ROCK) {
                    p2.addPoint();
                    return;
                }
            }
        }
        p1.addPoint();
    }
}
