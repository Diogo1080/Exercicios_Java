package generics;

public class Nil<T> implements LinkedList<T> {

    @Override
    public T head() {
        throw new RuntimeException("Called head() on empty list");

    }

    @Override
    public LinkedList<T> tail() {
        throw new RuntimeException("Called head() on empty list");

    }

    @Override
    public boolean isEmpty() {
        return true;
    }
}
