package classesabstratas.Ex1ListFILO;

public final class Cons extends LinkedList {
    private final int head;
    private final LinkedList tail;

    public Cons(int head, LinkedList tail) {
        this.head = head;
        this.tail = tail;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int head() {
        return head;
    }

    @Override
    public LinkedList tail() {
        return tail;
    }
}
