package edgargame.hittable.obstacles;

import edgargame.Player;

public class Rock extends Obstacles {
    private int AvoidDamage = 1;

    public int getAvoidDamage() {
        return AvoidDamage;
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
                player.getHitted(3);
            }
            case 1 -> {
                System.out.println("You get lucky and get 3 life.");
                player.getHealth(3);
            }
            case 2 -> {
                System.out.println("You get lucky and get an extra recharge for your life.");
                player.getExtraRecharge();
            }
        }
    }

}
