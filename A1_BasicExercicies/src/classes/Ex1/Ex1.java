package classes.Ex1;

public class Ex1 {
    public static void main(String[] args) {
        point A = new point(3,2);
        point B = new point(9,7);
        System.out.println(A.getX());
        System.out.println(A.getDistanceTo0());
        System.out.println(A.distanceTo(B));
    }
}
