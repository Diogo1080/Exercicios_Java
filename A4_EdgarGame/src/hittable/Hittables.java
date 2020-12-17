package hittable;

import Game.GameProperties;

import java.util.ArrayList;
import java.util.Random;

public enum Hittables {
    DRAGON(GameProperties.BOSS_HITTABLE),
    DWARF(GameProperties.ENEMY_HITTABLE),
    ELF(GameProperties.ENEMY_HITTABLE),
    HUMAN(GameProperties.ENEMY_HITTABLE),
    ROCK(GameProperties.OBSTACLE_HITTABLE),
    TREE(GameProperties.OBSTACLE_HITTABLE);

    private final String type;
    public final static Hittables[] enemies = getEnemies();
    public final static Hittables[] Obstacles = getObstacles();

    Hittables(String type) {
        this.type = type;
    }

    public static Hittables getRandomEnemy() {
        return enemies[(int) (Math.random() * enemies.length)];
    }

    public static Hittables getRandomObstacle() {
        return Obstacles[(int) (Math.random() * Obstacles.length)];
    }

    public static Hittables[] getEnemies() {
        ArrayList<Hittables> enemies = new ArrayList<>();
        for (Hittables e : Hittables.values()) {
            if (e.type.equals(GameProperties.ENEMY_HITTABLE)) {
                enemies.add(Hittables.valueOf(e.name()));
            }
        }
        return enemies.toArray(new Hittables[0]);
    }

    public static Hittables[] getObstacles() {
        ArrayList<Hittables> enemies = new ArrayList<>();
        for (Hittables e : Hittables.values()) {
            if (e.type.equals(GameProperties.OBSTACLE_HITTABLE)) {
                enemies.add(Hittables.valueOf(e.name()));
            }
        }
        return enemies.toArray(new Hittables[0]);
    }

    public static void RandomizeArray(Hittables[] array) {
        Random random = new Random();  // Random number generator

        for (int i = 0; i < array.length; i++) {
            int randomPosition = random.nextInt(array.length);
            Hittables temp = array[i];
            array[i] = array[randomPosition];
            array[randomPosition] = temp;
        }

    }
}
