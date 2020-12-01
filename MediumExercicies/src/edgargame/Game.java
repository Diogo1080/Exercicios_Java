package edgargame;

import edgargame.hittable.Enemies.Enemy;
import edgargame.hittable.Hittable;

import java.util.Random;
import java.util.Scanner;

public class Game {
    private boolean status = true;
    private int stage;

    private String[] enemyTypes = new String[]{"Elf", "Dwarf", "Human"};
    private String[] obstaclesTypes = new String[]{"Rock", "Tree"};
    private Hittable[] hittable = new Enemy[8];
    private Player player = new Player();

    public void start() {
        for (int i = 0; i < 5; i++) {
            hittable[i] = HittableFactory.createHittable(enemyTypes[(int) (Math.random() * 3)]);
        }

        for (int i = 5; i < hittable.length - 1; i++) {
            Hittable newHittable = HittableFactory.createHittable(obstaclesTypes[(int) (Math.random() * 2)]);
            hittable[i] = newHittable;
        }

        shuffleArray(hittable);

        hittable[hittable.length - 1] = HittableFactory.createHittable(enemyTypes[(int) (Math.random() * 3)]);

        for (int i = 0; i < hittable.length - 1; i++) {
            hittable[i].print();
        }
    }

    private void normalAttack() {
        hittable[stage].takeDamage(player.normalAttack());
        if (hittable[stage].isAlive()) {
            player.getHitted(hittable[stage].attack());
        } else {
            stage++;
        }
    }

    private void specialAttack() {
        int specialAttack = player.specialAttack();
        if (specialAttack != 0) {
            hittable[stage].takeDamage(specialAttack);
            if (hittable[stage].isAlive()) {
                player.getHitted(hittable[stage].attack());
            } else {
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

    private static void shuffleArray(Hittable[] array) {
        int index;
        Random random = new Random();
        for (int i = array.length - 2; i > 0; i--) {

            index = random.nextInt(i + 1);
            if (index != i) {
                array[index] = array[i];
                array[i] = array[index];
                array[index] = array[i];
            }
        }
    }
}

