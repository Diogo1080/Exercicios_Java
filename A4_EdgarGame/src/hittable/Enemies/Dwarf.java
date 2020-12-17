package hittable.Enemies;

public class Dwarf extends Enemy {

    public Dwarf(String property, int defenseFactor, int attackFactor) {
        super("Dwarf", property, defenseFactor, attackFactor);
    }

    public Dwarf( int defenseFactor, int attackFactor) {
        super("Dwarf", defenseFactor, attackFactor);
    }


}
