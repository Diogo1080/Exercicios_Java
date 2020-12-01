package edgargame.hittable;

public interface Hittable {
    void print();
    void takeDamage(double damage);
    int attack();
    double getHealth();
    boolean isAlive();
}
