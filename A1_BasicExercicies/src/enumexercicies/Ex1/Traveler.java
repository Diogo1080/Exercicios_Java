package enumexercicies.Ex1;

public class Traveler {
    private String name;
    private int x;
    private int y;

    public Traveler(String name) {
        this.name = name;
        x = 0;
        y = 0;
    }

    public void travel(Direction direction) {
        System.out.println(direction.getMessage());
        switch (direction) {
            case NORTH -> y++;
            case SOUTH -> y--;
            case EAST -> x++;
            case WEST -> x--;
            default -> System.out.println("I'm going underground!");
        }
    }

    public void getCoordinates() {
        System.out.println(x + "," + y);
    }

    public String getName() {
        return name;
    }
}
