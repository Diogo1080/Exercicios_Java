package hittable;

import Game.GameProperties;
import hittable.Enemies.Dragon;
import hittable.Enemies.Dwarf;
import hittable.Enemies.Elf;
import hittable.Enemies.Human;
import hittable.obstacles.Rock;
import hittable.obstacles.Tree;

public class HittableFactory {

    public static Hittable createHittable(Hittables Hittable) {
        switch (Hittable) {
            case HUMAN:
                return new Human(GameProperties.HUMAN_DEFENCE_FACTOR, GameProperties.HUMAN_ATTACK_FACTOR);
            case ROCK:
                return new Rock();
            case TREE:
                return new Tree();
            case ELF: {
                if (((int) (Math.random() * 2)) == 1) {
                    return new Elf("Magic",
                            GameProperties.ELF_DEFENCE_FACTOR + GameProperties.MAGIC_PROPERTY_BONUS,
                            GameProperties.ELF_ATTACK_FACTOR + GameProperties.MAGIC_PROPERTY_BONUS
                    );
                }
                return new Elf(GameProperties.ELF_DEFENCE_FACTOR, GameProperties.ELF_ATTACK_FACTOR);
            }
            case DWARF: {
                if (((int) (Math.random() * 2)) == 1) {
                    return new Dwarf("Drunk",
                            GameProperties.DWARF_DEFENCE_FACTOR + GameProperties.DRUNK_PROPERTY_BONUS,
                            GameProperties.DWARF_ATTACK_FACTOR + GameProperties.DRUNK_PROPERTY_BONUS
                    );
                }
                return new Dwarf(GameProperties.DWARF_DEFENCE_FACTOR, GameProperties.DWARF_ATTACK_FACTOR);
            }
            case DRAGON:
                return new Dragon(GameProperties.DRAGON_DEFENCE_FACTOR, GameProperties.DRAGON_ATTACK_FACTOR);
            default:
                return null;
        }
    }



}