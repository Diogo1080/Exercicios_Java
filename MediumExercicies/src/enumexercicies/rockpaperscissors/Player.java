package enumexercicies.rockpaperscissors;

public class Player {
    private int numPoints;

    void addPoint() {
        numPoints++;
    }

    public int getNumPoints() {
        return numPoints;
    }

    public HandStates getHand() {
        switch ((int) Math.floor(Math.random() * 3)) {
            case 0 -> {
                return HandStates.ROCK;
            }
            case 1 -> {
                return HandStates.PAPER;
            }
            case 2 -> {
                return HandStates.SCISSORS;
            }
        }
        return null;
    }
}
