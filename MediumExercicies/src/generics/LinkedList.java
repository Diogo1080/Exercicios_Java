package generics;

public interface LinkedList<T> {
    T head();

    LinkedList<T> tail();

    public boolean isEmpty();
}
