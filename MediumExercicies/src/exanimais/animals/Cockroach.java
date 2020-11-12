package exanimais.animals;

import exanimais.AnimalTypes;
import exanimais.Animals;

public class Cockroach extends Animals {
    public Cockroach() {
        super(AnimalTypes.COCKROACH);
    }

    @Override
    public AnimalTypes getType() {
        return type;
    }
}
