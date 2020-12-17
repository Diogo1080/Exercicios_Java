package animals;

public class Lion extends Animals {
    public Lion() {
        super(AnimalTypes.LION);
    }

    @Override
    public AnimalTypes getType() {
        return type;
    }
}
