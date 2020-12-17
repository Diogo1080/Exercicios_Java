package animals;

public class Elephant extends Animals {
    public Elephant() {
        super(AnimalTypes.ELEPHANT);
    }

    @Override
    public AnimalTypes getType() {
        return type;
    }
}
