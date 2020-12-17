package hittable;

public interface Hittable {
    String printType();
    void print();
    void takeDamage(double damage);
    int attack();
    double getHealth();
    boolean isAlive();
}
