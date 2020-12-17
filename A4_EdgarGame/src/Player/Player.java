package Player;

import Game.GameProperties;

public class Player implements PlayerInterface {
    private int health = 100;
    private int normalAttack = GameProperties.PLAYER_ATTACK_FACTOR;
    private int specialAttack = GameProperties.PLAYER_SPECIAL_ATTACK_FACTOR;
    private int specialAttackCounter = GameProperties.PLAYER_SPECIAL_ATTACK_COUNTER;
    private int healthRechargeCounter = GameProperties.PLAYER_REGEN_COUNTER;

    public int getHealthRechargeCounter() {
        return healthRechargeCounter;
    }

    public int getHealth() {
        return health;
    }

    public void getHealth(int value) {
        health = health + value;
    }

    public void getExtraRecharge() {
        if (healthRechargeCounter != GameProperties.PLAYER_REGEN_COUNTER) {
            healthRechargeCounter++;
        }
    }

    public void getExtraSpecial() {
        if (specialAttackCounter != GameProperties.PLAYER_SPECIAL_ATTACK_COUNTER) {
            specialAttackCounter++;
        }
    }

    public void print() {
        System.out.println(" ----Player---- ");
        System.out.println(" Health: " + health);
    }

    public boolean isAlive() {
        if (health <= 0) {
            return false;
        }
        return true;
    }

    @Override
    public void getHitted(double hit) {
        health -= hit;
    }

    @Override
    public int rechargeHealth(int health) {
        if (healthRechargeCounter != 0) {
            this.health += health;
            if ( this.health > 100) {
                this.health = 100;
            }
            healthRechargeCounter--;
        }
        return this.health;
    }

    @Override
    public int normalAttack() {
        return normalAttack;
    }

    @Override
    public int specialAttack() {
        if (specialAttackCounter != 0) {
            specialAttackCounter--;
            return specialAttack;
        }
        return 0;
    }
}
