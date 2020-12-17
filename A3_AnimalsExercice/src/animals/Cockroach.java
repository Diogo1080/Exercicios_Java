package animals;

public class Cockroach extends Animals {
    public Cockroach() {
        super(AnimalTypes.COCKROACH);
    }

    @Override
    public AnimalTypes getType() {
        return type;
    }
}
