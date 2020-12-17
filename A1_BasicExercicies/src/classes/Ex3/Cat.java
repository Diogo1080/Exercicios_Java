package classes.Ex3;

public class Cat extends Animals{

    public void goToSleep(){
        System.out.println("zzzzzz zzzzz zzzzzz");
    }

    public Cat(int age, String name, String color, char gender){
        super.age =age;
        super.name = name;
        super.color = color;
        super.sound = "miau";
        super.factor = 4;
        super.gender = gender;
    }


}
