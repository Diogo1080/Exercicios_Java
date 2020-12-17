import typesofgenies.DemonGenie;
import typesofgenies.FriendlyGenie;
import typesofgenies.Genie;
import typesofgenies.GrumpyGenie;

public class Lamp {
    int numberOfGenies;
    int geniesInitiated;
    int numberOfTimesRecycled;
    Genie currentGenie;

    public Lamp() {
        numberOfGenies = (int) Math.floor(Math.random() * Math.floor(8)) + 2;
    }

    public boolean isItTheLastGenie() {
        return numberOfGenies == geniesInitiated;
    }

    public void reset(Genie genie) {
        if (genie.resetLamp()) {
            geniesInitiated = 0;
            numberOfTimesRecycled++;
        }
    }

    public Genie rub() {
        if (!isItTheLastGenie()) {
            geniesInitiated++;
            if (isItTheLastGenie()) {
                currentGenie = new DemonGenie((int) (Math.floor(Math.random() * Math.floor(5)) + 1));
            } else if (Math.floor(Math.random() * Math.floor(5)) <= 2) {
                currentGenie = new FriendlyGenie((int) (Math.floor(Math.random() * Math.floor(5)) + 1));
            } else {
                currentGenie = new GrumpyGenie((int) (Math.floor(Math.random() * Math.floor(5)) + 1));
            }
        } else {
            System.out.println("Lamp is out of Genies!");
        }
        return currentGenie;
    }

    public boolean equals(Lamp lamp) {
        return this.numberOfGenies == lamp.numberOfGenies &&
                this.geniesInitiated == lamp.geniesInitiated &&
                this.numberOfTimesRecycled == lamp.numberOfTimesRecycled;
    }
}
