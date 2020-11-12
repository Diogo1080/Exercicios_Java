package exanimais.animals;

import exanimais.AnimalTypes;
import exanimais.Animals;

public class Elephant extends Animals {
    public Elephant() {
        super(AnimalTypes.ELEPHANT);
    }

    @Override
    public AnimalTypes getType() {
        return type;
    }
}
