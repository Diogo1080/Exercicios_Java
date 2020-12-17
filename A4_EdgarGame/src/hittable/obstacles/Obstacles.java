package hittable.obstacles;

import Player.Player;
import hittable.Hittable;

public abstract class Obstacles implements Hittable {
    protected String type;
    protected double life = 100.00;


    public Obstacles(String type) {
        this.type = type;
    }

    public abstract int getAvoidDamage();
    public abstract void getReward(Player player);

    @Override
    public String printType() {
        return type;
    }

    @Override
    public void print() {
        System.out.println("-----Obstacle-----");
        System.out.println("Type: " + type + "\n Life:" + life);
    }

    @Override
    public int attack() {
        return 0;
    }

    @Override
    public double getHealth() {
        return life;
    }

    @Override
    public void takeDamage(double damage) {
        life = -damage;
    }

    @Override
    public boolean isAlive() {
        return !(life <= 0);
    }
}
