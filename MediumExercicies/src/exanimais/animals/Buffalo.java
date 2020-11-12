package exanimais.animals;

import exanimais.AnimalTypes;
import exanimais.Animals;

public class Buffalo extends Animals {
    public Buffalo() {
        super(AnimalTypes.BUFFALO);
    }

    @Override
    public AnimalTypes getType() {
        return type;
    }
}
