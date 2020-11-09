package classes.Ex3;

public class Platypus extends Animals{
    private int doofenshmirtzBeaten = 0;

    /* Cows, they fart and release the methane! */
    public void figthDoofenshmirtz(){
        this.doofenshmirtzBeaten++;
    }

    public int getdoofenshmirtzBeaten(){
        return this.doofenshmirtzBeaten;
    }

    public Platypus(int age, String name, String color, char gender){
        super.age = age;
        super.name = name;
        super.color = color;
        super.sound = "QRRRR";
        super.factor = 4;
        super.gender = gender;
    }
}
