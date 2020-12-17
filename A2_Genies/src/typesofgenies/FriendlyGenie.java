package typesofgenies;

public class FriendlyGenie extends Genie {
    public FriendlyGenie(int numberOfWishes) {
        super(numberOfWishes, 0);
    }

    @Override
    public void makeWish() {
        if (!isTheLastWish()) {
            System.out.println("Your wish is granted!");
            grantedWishes++;
        } else {
            System.out.println("You don't have more wishes!");
        }
    }

    public String toString() {
        return "Friendly";
    }
}
