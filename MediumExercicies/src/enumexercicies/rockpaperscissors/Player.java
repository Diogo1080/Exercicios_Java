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
        HandStates[] values = HandStates.values();
        int randIndex = (int) Math.floor(Math.random() * HandStates.values().length);
        return values[randIndex];
    }
}
