package animals;

import animals.AnimalTypes;

public abstract class Animals {
    protected boolean adopted = false;
    protected AnimalTypes type;


    public Animals(AnimalTypes type) {
        this.type=type;
    }

    public String getSound() {
        return this.getType().getSound();
    }

    public boolean isAdopted() {
        return adopted;
    }

    public void getAdopted() {
        this.adopted = true;
    }

    public abstract AnimalTypes getType();

}
