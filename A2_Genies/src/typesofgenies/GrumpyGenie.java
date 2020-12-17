package typesofgenies;

public class GrumpyGenie extends Genie {

    public GrumpyGenie(int numberOfWishes) {
        super(numberOfWishes, 0);
    }

    @Override
    public void makeWish() {
        if (grantedWishes == 1) {
            System.out.println("I don't want to grant more wishes!");
        } else {
            System.out.println("Your wish is granted!");
            grantedWishes++;
        }
    }
    public String toString(){
        return "Grumpy";
    }
}
