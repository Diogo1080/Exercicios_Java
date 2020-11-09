package classes.Ex3;

public class Cow extends Animals {

    private int farts = 0;

    /* Cows, they fart and release the methane! */
    public void fart(){
        this.farts++;
    }

    public double getMethane(){
        return this.farts * 0.05;
    }

    public Cow(int age, String name, String color, char gender){
        super.age = age;
        super.name = name;
        super.color = color;
        super.sound = "mhuuuu";
        super.factor = 4;
        super.gender = gender;
    }
}
