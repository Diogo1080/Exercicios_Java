package edgargame.hittable.Enemies;

import edgargame.hittable.Hittable;

public abstract class Enemy implements Hittable {
    protected String type;
    protected double life = 100.00;
    protected int defenseFactor;
    protected int attackFactor;

    public Enemy(String type, int defenseFactor, int attackFactor) {
        this.type = type;
        this.defenseFactor = defenseFactor;
        this.attackFactor = attackFactor;
    }

    public void print() {
        System.out.println("-----Enemy-----");
        System.out.println("Type: " + type + "\n Life:" + life);
    }

    @Override
    public int attack() {
        return (int) Math.floor(Math.random() *attackFactor);
    }

    @Override
    public double getHealth() {
        return life;
    }

    @Override
    public boolean isAlive() {
        return !(life <= 0);
    }

    @Override
    public void takeDamage(double damage) {
        damage -= Math.random() * defenseFactor;
        life -= damage;
    }


}


