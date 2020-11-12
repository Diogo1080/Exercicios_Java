package exanimais.animals;

import exanimais.AnimalTypes;
import exanimais.Animals;

public class Rhinoceros extends Animals {
    public Rhinoceros() {
        super(AnimalTypes.RHINOCEROS);
    }

    @Override
    public AnimalTypes getType() {
        return type;
    }
}
