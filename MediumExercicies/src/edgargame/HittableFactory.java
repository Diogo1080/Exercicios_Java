package edgargame;

import edgargame.hittable.Enemies.Dragon;
import edgargame.hittable.Enemies.Dwarf;
import edgargame.hittable.Enemies.Elf;
import edgargame.hittable.Enemies.Human;
import edgargame.hittable.Hittable;
import edgargame.hittable.Hittables;
import edgargame.hittable.obstacles.Rock;
import edgargame.hittable.obstacles.Tree;


public class HittableFactory {

    public static Hittable createHittable(Hittables Hittable) {
        switch (Hittable) {
            case HUMAN:
                return new Human(8, 9);
            case ROCK:
                return new Rock();
            case TREE:
                return new Tree();
            case ELF: {
                if (((int) (Math.random() * 2)) == 1) {
                    return new Elf("Magic", 13, 13);
                }
                return new Elf(12, 12);
            }
            case DWARF: {
                if (((int) (Math.random() * 2)) == 1) {
                    return new Dwarf("Drunk", 2, 12);
                }
                return new Dwarf(3, 13);
            }
            case DRAGON:
                return new Dragon(20, 20);
            default:
                return null;
        }
    }



}