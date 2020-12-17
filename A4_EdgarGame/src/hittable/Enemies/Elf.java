package hittable.Enemies;

public class Elf extends Enemy {

    public Elf(String property, int defenseFactor, int attackFactor) {
        super("Elf", property, defenseFactor, attackFactor);
    }

    public Elf(int defenseFactor, int attackFactor) {
        super("Elf", defenseFactor, attackFactor);
    }

}