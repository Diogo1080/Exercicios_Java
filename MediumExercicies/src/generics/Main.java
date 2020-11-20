package generics;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> listInt = new Cons<>(5,new Nil<>());
    }
}
