package edgargame;

import edgargame.hittable.Hittable;
import edgargame.hittable.obstacles.Obstacles;

import java.util.Random;
import java.util.Scanner;

public class Game {
    private boolean status = true;
    private int stage;

    private String[] enemyTypes = new String[]{"Elf", "Dwarf", "Human"};
    private String[] obstaclesTypes = new String[]{"Rock", "Tree"};
    private Hittable[] hittable = new Hittable[8];
    private Player player = new Player();

    public void start() {
        Hittable[] newhittable = new Hittable[7];

        for (int i = 0; i < 5; i++) {
            newhittable[i] = HittableFactory.createHittable(enemyTypes[(int) (Math.random() * 3)]);
        }

        for (int i = 5; i < newhittable.length; i++) {
            newhittable[i] = HittableFactory.createHittable(obstaclesTypes[(int) (Math.random() * 2)]);
        }

        RandomizeArray(newhittable);

        System.arraycopy(newhittable, 0, hittable, 0, newhittable.length);

        hittable[hittable.length - 1] = HittableFactory.createHittable("dragon");
    }

    private void normalAttack() {
        hittable[stage].takeDamage(player.normalAttack());
        System.out.println("You attack the " + hittable[stage].printType() + ".");
        if (hittable[stage].isAlive()) {
            player.getHitted(hittable[stage].attack());
        } else {
            if (hittable[stage] instanceof Obstacles) {
                ((Obstacles) hittable[stage]).getReward(player);
            }
            stage++;
        }
    }

    private void specialAttack() {
        int specialAttack = player.specialAttack();
        System.out.println("You special attack the " + hittable[stage].printType() + ".");
        if (specialAttack != 0) {
            hittable[stage].takeDamage(specialAttack);
            if (hittable[stage].isAlive()) {
                player.getHitted(hittable[stage].attack());
            } else {
                if (hittable[stage] instanceof Obstacles) {
                    ((Obstacles) hittable[stage]).getReward(player);
                }
                stage++;
            }
        } else {
            System.out.println("You don't have anymore special attacks.");
        }
    }

    private void recharge() {
        int rechargeHealth = player.rechargeHealth(15);
        if (rechargeHealth == 0) {
            System.out.println("You don't have anymore recharges.");
        }
        player.rechargeHealth(15);
    }

    private void avoid() {
        if (hittable[stage] instanceof Obstacles) {
            player.getHitted(((Obstacles) hittable[stage]).getAvoidDamage());
            System.out.println("You avoided the obstacle but got scratched in the process losing " + ((Obstacles) hittable[stage]).getAvoidDamage() + " life.");
            return;
        }
        player.getHitted(3);
        System.out.println("When you try to run away you get hit losing 3 life.");
    }


    public void round() {
        stage = 0;
        do {
            player.print();
            hittable[stage].print();
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
            if (!player.isAlive()) {
                status = false;
                System.out.println("You died");
            }
            if (hittable[hittable.length - 1].getHealth() <= 0) {
                status = false;
            }
        } while (status);
    }

    public static void RandomizeArray(Hittable[] array) {
        Random rgen = new Random();  // Random number generator

        for (int i = 0; i < array.length; i++) {
            int randomPosition = rgen.nextInt(array.length);
            Hittable temp = array[i];
            array[i] = array[randomPosition];
            array[randomPosition] = temp;
        }

    }
}

