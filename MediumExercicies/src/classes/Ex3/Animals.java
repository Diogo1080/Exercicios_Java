package classes.Ex3;

public class Animals {
    protected int age;
    protected int factor;

    protected String name;
    protected String color;
    protected String sound;
    protected String status="baby";

    protected char gender;

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public char getgender() {
        return gender;
    }

    public String getStatus() {
        return status;
    }

    public int updateAge(){
        this.age++;
        updateStatus();
        return this.age;
    }

    public void animalSound(){
        if (name.isEmpty() || sound.isEmpty()) {
            System.out.println("Animal makes a sound");
        } else {
            System.out.println(name + " makes " + sound + " " + sound);
        }
    }

    private String updateStatus(){
        int humanYears = this.age * factor;

        if(humanYears < 10) status="baby";
        else if(humanYears >= 10 && humanYears < 24) status="junior";
        else if(humanYears >= 24 && humanYears < 60) status="adult";
        else status="senior";

        return status;
    }
}
