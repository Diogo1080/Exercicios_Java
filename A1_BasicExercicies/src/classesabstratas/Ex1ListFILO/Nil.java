package classesabstratas.Ex1ListFILO;

public final class Nil extends LinkedList {
    @Override
    public boolean isEmpty() {
        return true;
    }

    @Override
    public int head() {
        throw new RuntimeException("Called head() on empty list");
    }

    @Override
    public LinkedList tail() {
        throw new RuntimeException("Called tail() on empty list");
    }
}

