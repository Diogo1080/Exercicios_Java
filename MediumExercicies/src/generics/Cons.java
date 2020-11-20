package generics;

public class Cons<T> implements LinkedList<T>{
    private final T head;
    private final LinkedList<T> tail;

    public Cons(T head, LinkedList<T> tail) {
        this.head = head;
        this.tail = tail;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public T head() {
        return head;
    }

    @Override
    public LinkedList<T> tail() {
        return tail;
    }
}
