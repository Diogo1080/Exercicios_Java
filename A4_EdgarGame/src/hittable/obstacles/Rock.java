package hittable.obstacles;

import Game.GameProperties;
import Player.Player;

public class Rock extends Obstacles {

    public int getAvoidDamage() {
        return GameProperties.ROCK_AVOID_DAMAGE;
    }


    public Rock() {
        super("Rock");
    }

    @Override
    public void getReward(Player player) {
        int random = (int) (Math.random() * 3);

        switch (random) {
            case 0 -> {
                System.out.println("You get hit for 3 life.");
                player.getHitted(GameProperties.ROCK_HIT_DAMAGE);
            }
            case 1 -> {
                System.out.println("You get lucky and get 3 life.");
                player.getHealth(GameProperties.ROCK_REGEN_LIFE);
            }
            case 2 -> {
                System.out.println("You get lucky and get an extra recharge for your life.");
                player.getExtraRecharge();
            }
        }
    }

}
