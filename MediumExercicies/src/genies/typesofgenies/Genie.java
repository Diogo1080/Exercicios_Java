package genies.typesofgenies;


public abstract class Genie {
    protected int numberOfWishes;
    protected int grantedWishes;

    public Genie(int numberOfWishes, int grantedWishes) {
        this.numberOfWishes = numberOfWishes;
        this.grantedWishes = grantedWishes;
    }

    public abstract void makeWish();

    public boolean isTheLastWish() {
        return numberOfWishes == grantedWishes;
    }

    public boolean resetLamp() {
        return false;
    }
}
