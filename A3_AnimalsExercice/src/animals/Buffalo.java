package animals;

public class Buffalo extends Animals {
    public Buffalo() {
        super(AnimalTypes.BUFFALO);
    }

    @Override
    public AnimalTypes getType() {
        return type;
    }
}
