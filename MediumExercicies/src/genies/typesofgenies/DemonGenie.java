package genies.typesofgenies;

public class DemonGenie extends Genie {
    boolean reseted;

    public DemonGenie(int numberOfWishes) {
        super(numberOfWishes, 0);
        reseted = false;
    }

    @Override
    public void makeWish() {
        if (reseted) {
            System.out.println("I've reseted the lamp and I won't grant anymore wishes");
            return;
        }
        System.out.println("Your wish is granted!");
        grantedWishes++;
    }

    public boolean resetLamp() {
        if (reseted) {
            System.out.println("I've already reseted the Lamp!");
            return false;
        }
        System.out.println("Lamp reseted!");
        reseted = true;
        return true;
    }

    public String toString() {
        return "Demon";
    }
}
