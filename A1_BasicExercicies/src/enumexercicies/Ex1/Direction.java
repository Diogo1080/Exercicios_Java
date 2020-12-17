package enumexercicies.Ex1;

public enum Direction {
    NORTH("To the north."),
    SOUTH("To the south."),
    EAST("To the east."),
    WEST("To the west");

    private String message;

    String getMessage() {
        return message;
    }

    Direction(String message) {
        this.message = message;
    }
}
