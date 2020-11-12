package exanimais.animals;

import exanimais.AnimalTypes;
import exanimais.Animals;

public class Leopard extends Animals {
    public Leopard() {
        super(AnimalTypes.LEOPARD);
    }

    @Override
    public AnimalTypes getType() {
        return type;
    }
}
