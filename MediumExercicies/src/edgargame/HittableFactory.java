package edgargame;

import edgargame.hittable.Enemies.Dragon;
import edgargame.hittable.Enemies.Dwarf;
import edgargame.hittable.Enemies.Elf;
import edgargame.hittable.Enemies.Human;
import edgargame.hittable.Hittable;
import edgargame.hittable.obstacles.Rock;
import edgargame.hittable.obstacles.Tree;

public class HittableFactory {

    public static Hittable createHittable(String Hittable) {
        return switch (Hittable) {
            case "Elf" -> new Elf(12, 12);
            case "Dwarf" -> new Dwarf(3, 13);
            case "Human" -> new Human(8, 9);
            case "Tree" -> new Rock();
            case "Rock" -> new Tree();
            default -> new Dragon(20, 20);
        };
    }


}