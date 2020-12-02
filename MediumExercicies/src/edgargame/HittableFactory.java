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
                return new Human(Constants.HUMAN_DEFENCE_FACTOR, Constants.HUMAN_ATTACK_FACTOR);
            case ROCK:
                return new Rock();
            case TREE:
                return new Tree();
            case ELF: {
                if (((int) (Math.random() * 2)) == 1) {
                    return new Elf("Magic",
                            Constants.ELF_DEFENCE_FACTOR + Constants.MAGIC_PROPERTY_BONUS,
                            Constants.ELF_ATTACK_FACTOR + Constants.MAGIC_PROPERTY_BONUS
                    );
                }
                return new Elf(Constants.ELF_DEFENCE_FACTOR, Constants.ELF_ATTACK_FACTOR);
            }
            case DWARF: {
                if (((int) (Math.random() * 2)) == 1) {
                    return new Dwarf("Drunk",
                            Constants.DWARF_DEFENCE_FACTOR + Constants.DRUNK_PROPERTY_BONUS,
                            Constants.DWARF_ATTACK_FACTOR + Constants.DRUNK_PROPERTY_BONUS
                    );
                }
                return new Dwarf(Constants.DWARF_DEFENCE_FACTOR, Constants.DWARF_ATTACK_FACTOR);
            }
            case DRAGON:
                return new Dragon(Constants.DRAGON_DEFENCE_FACTOR, Constants.DRAGON_ATTACK_FACTOR);
            default:
                return null;
        }
    }



}