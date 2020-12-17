package Game;

import Player.Player;
import hittable.Hittable;
import hittable.HittableFactory;
import hittable.Hittables;
import hittable.obstacles.Obstacles;

import java.util.Scanner;

public class Game {

    private int stage;
    private boolean status = true;
    private Hittable currentThreat = null;
    private Hittables[] hittable = new Hittables[8];
    private Player player = new Player();

    public void start() {
        Hittables[] newhittables = new Hittables[7];

        for (int i = 0; i < 5; i++) {
            newhittables[i] = Hittables.getRandomEnemy();
        }

        for (int i = 5; i < newhittables.length; i++) {
            newhittables[i] = Hittables.getRandomObstacle();
        }

        Hittables.RandomizeArray(newhittables);

        System.arraycopy(newhittables, 0, hittable, 0, newhittables.length);

        hittable[hittable.length - 1] = Hittables.DRAGON;

        round();
    }

    private void getNewThreat() {
        if (hittable[stage]==Hittables.DRAGON){
            return;
        }
        stage++;
        currentThreat = HittableFactory.createHittable(hittable[stage]);
    }

    private void normalAttack() {
        currentThreat.takeDamage(player.normalAttack());
        System.out.println("You attack the " + currentThreat.printType() + ".");
        damagePlayer();
    }

    private void specialAttack() {
        int specialAttack = player.specialAttack();
        if (specialAttack != 0) {
            System.out.println("You special attack the " + currentThreat.printType() + ".");
            currentThreat.takeDamage(specialAttack);
            damagePlayer();
        } else {
            System.out.println("You don't have anymore special attacks.");
        }
    }

    private void damagePlayer() {
        if (currentThreat.isAlive()) {
            player.getHitted(currentThreat.attack());
        } else {
            if (currentThreat instanceof Obstacles) {
                ((Obstacles) currentThreat).getReward(player);
            }
            getNewThreat();
        }
    }

    private void recharge() {
        if (player.getHealthRechargeCounter() == 0) {
            System.out.println("You don't have anymore recharges.");
        }
        player.rechargeHealth(GameProperties.PLAYER_REGEN);
    }

    private void avoid() {
        if (currentThreat instanceof Obstacles) {
            player.getHitted(((Obstacles) currentThreat).getAvoidDamage());
            System.out.println("You avoided the obstacle but got scratched in the process losing " + ((Obstacles) currentThreat).getAvoidDamage() + " life.");
            return;
        }
        player.getHitted(GameProperties.PLAYER_DAMAGE_FROM_AVOID_ENEMY);
        System.out.println("When you try to run away you get hit losing "+ GameProperties.PLAYER_DAMAGE_FROM_AVOID_ENEMY +" life.");
    }


    private void checkIfWonOrLost() {
        if (!player.isAlive()) {
            status = false;
            System.out.println("You died");
        }
        if (currentThreat.getHealth() <= 0) {
            status = false;
            System.out.println("You win.");
        }
    }

    public void round() {
        stage = 0;
        getNewThreat();
        do {
            player.print();
            currentThreat.print();
            Scanner scan = new Scanner(System.in);
            System.out.println(" 1: Attack enemy");
            System.out.println(" 2: Special Attack");
            System.out.println(" 3: Recharge");
            System.out.println(" 4: Avoid enemy");
            System.out.println(" 5: Quit game");
            int choice = scan.nextInt();  // Read user input
            switch (choice) {
                case 1 -> normalAttack();
                case 2 -> specialAttack();
                case 3 -> recharge();
                case 4 -> avoid();
                case 5 -> {
                    status = false;
                    System.out.println("Exiting...");
                }
                default -> System.out.println("Choice doesn't exists.");
            }
            checkIfWonOrLost();
        } while (status);
    }


}

