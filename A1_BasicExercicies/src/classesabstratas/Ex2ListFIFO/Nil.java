package classesabstratas.Ex2ListFIFO;

public final class Nil extends LinkedList {

    @Override
    public boolean isEmpty() {
        return true;
    }

    @Override
    public int head() {
        throw new RuntimeException("List is empty");
    }

    @Override
    public LinkedList next() {
        throw new RuntimeException("List is empty");
    }


    @Override
    public void setTail( Cons tail) {

    }
}
