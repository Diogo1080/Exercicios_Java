package hittable.Enemies;

import hittable.Hittable;

public abstract class Enemy implements Hittable {
    protected String type;
    protected String property;
    protected double life = 100.00;
    protected int defenseFactor;
    protected int attackFactor;

    public Enemy(String type, String property, int defenseFactor, int attackFactor) {
        this.type = type;
        this.property = property;
        this.defenseFactor = defenseFactor;
        this.attackFactor = attackFactor;
    }

    public Enemy(String type, int defenseFactor, int attackFactor) {
        this.type = type;
        this.property = "";
        this.defenseFactor = defenseFactor;
        this.attackFactor = attackFactor;
    }
    @Override
    public String printType() {
        return property + " " + type;
    }

    public void print() {
        System.out.println("-----Enemy-----");
        System.out.println("Type: " + property + " " + type + "\n Life:" + life);
    }

    @Override
    public int attack() {
        return (int) Math.floor(Math.random() * attackFactor);
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


