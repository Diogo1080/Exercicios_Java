package classes.Ex3;
public class Rabbit extends Animals{

    private int binky =0;

    /*“binky:” they jump up in the air and twist and spin around! */
    public void binky(){
        this.binky++;
    }

    public int getBinky(){
        return this.binky;
    }

    public Rabbit(int age, String name, String color, char gender){
        super.age =age;
        super.name = name;
        super.color = color;
        super.sound = "szh zsz zshs zhs zsh";
        super.factor = 6;
        super.gender = gender;
    }


}
