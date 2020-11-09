package classes.Ex3;

public class Ex3 {
    public static void main(String[] args) {
        Cat cat = new Cat(0,"Otavio", "grey", 'M');
        cat.goToSleep();
        cat.animalSound();
        cat.updateAge();
        cat.updateAge();
        cat.updateAge();
        cat.updateAge();
        cat.updateAge();
        System.out.println(cat.getStatus());
        System.out.println();

        Rabbit rabbit = new Rabbit(0,"Matilda", "orange", 'F');
        rabbit.animalSound();
        rabbit.updateAge();
        rabbit.updateAge();
        rabbit.updateAge();
        rabbit.updateAge();
        rabbit.updateAge();
        rabbit.binky();
        rabbit.binky();
        System.out.println(rabbit.getStatus() + " / " + rabbit.getBinky());
        System.out.println(rabbit.getColor());
        System.out.println();

        Cow cow = new Cow(0,"Mildred", "Black and white", 'F');
        cow.animalSound();
        cow.updateAge();
        cow.fart();cow.fart();cow.fart();cow.fart();cow.fart();cow.fart();cow.fart();cow.fart();cow.fart();
        System.out.println(cow.getMethane() + "g");
        System.out.println();

        Platypus platypus = new Platypus(0,"Perry", "bluish green", 'M');
        platypus.animalSound();
        platypus.updateAge();
        platypus.figthDoofenshmirtz();
        platypus.figthDoofenshmirtz();
        System.out.println(platypus.getdoofenshmirtzBeaten());
    }
}
