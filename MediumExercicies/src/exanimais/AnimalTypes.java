package exanimais;

public enum AnimalTypes {
    LION("RAAAAWWW"),
    LEOPARD("MIAUUU"),
    ELEPHANT("PHAHA"),
    COCKROACH("TICKTICKTICK"),
    RHINOCEROS("BRUUUUU"),
    BUFFALO("BRRRRUUUUFFF");

    private final String sound;

    public String getSound() {
        return sound;
    }

    AnimalTypes(String message) {
        this.sound = message;
    }

    static AnimalTypes getRandomAnimalType() {
        AnimalTypes[] values = AnimalTypes.values();
        int randIndex = (int) Math.floor(Math.random() * values.length);
        return values[randIndex];
    }
}
