package enumexercicies.Ex1;

public class Main {
    public static void main(String[] args) {
        Traveler traveler = new Traveler("Alberto");
        System.out.println(traveler.getName());
        traveler.travel(Direction.NORTH);
        traveler.travel(Direction.NORTH);
        traveler.travel(Direction.NORTH);
        traveler.travel(Direction.NORTH);
        traveler.getCoordinates();
    }
}
