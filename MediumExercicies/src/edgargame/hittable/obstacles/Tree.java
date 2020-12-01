package edgargame.hittable.obstacles;

import edgargame.Player;

public class Tree extends Obstacles {
    private int AvoidDamage = 2;

    public int getAvoidDamage() {
        return AvoidDamage;
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
                player.getHitted(6);
            }
            case 1 -> {
                System.out.println("You get lucky and get 4 life.");
                player.getHealth(4);
            }
            case 2 -> {
                System.out.println("You get lucky and get an extra recharge for your special attack.");
                player.getExtraSpecial();
            }
        }
    }

}
