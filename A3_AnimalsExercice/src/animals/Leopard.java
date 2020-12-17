package animals;

public class Leopard extends Animals {
    public Leopard() {
        super(AnimalTypes.LEOPARD);
    }

    @Override
    public AnimalTypes getType() {
        return type;
    }
}
