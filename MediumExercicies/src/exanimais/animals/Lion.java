package exanimais.animals;

import exanimais.AnimalTypes;
import exanimais.Animals;

public class Lion extends Animals {
    public Lion() {
        super(AnimalTypes.LION);
    }

    @Override
    public AnimalTypes getType() {
        return type;
    }
}
