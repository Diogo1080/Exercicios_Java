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
        switch (Hittable) {
            case "Human":
                return new Human("", 8, 9);
            case "Rock":
                return new Rock();
            case "Tree":
                return new Tree();
            case "Elf": {
                if (((int) (Math.random() * 2)) == 1) {
                    return new Elf("Magic", 13, 13);
                }
                return new Elf("", 12, 12);
            }
            case "Dwarf": {
                if (((int) (Math.random() * 2)) == 1) {
                    return new Dwarf("Drunk", 2, 12);
                }
                return new Dwarf("", 3, 13);
            }
            default:
                return new Dragon("", 20, 20);
        }
    }


}