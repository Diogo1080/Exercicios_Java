package hittable.obstacles;

import Game.GameProperties;
import Player.Player;


public class Tree extends Obstacles {

    public int getAvoidDamage() {
        return GameProperties.TREE_AVOID_DAMAGE;
    }

    public Tree() {
        super("Tree");
    }

    @Override
    public void getReward(Player player) {
        int random = (int) (Math.random() * 3);

        switch (random) {
            case 0 -> {
                System.out.println("You get hit for 6 life.");
                player.getHitted(GameProperties.TREE_HIT_DAMAGE);
            }
            case 1 -> {
                System.out.println("You get lucky and get 4 life.");
                player.getHealth(GameProperties.TREE_REGEN_LIFE);
            }
            case 2 -> {
                System.out.println("You get lucky and get an extra recharge for your special attack.");
                player.getExtraSpecial();
            }
        }
    }

}
