package classesabstratas.Ex2ListFIFO;

public final class Cons extends LinkedList {
    private int head;
    private LinkedList tail;

    public Cons(int head, LinkedList tail){
        this.head=head;
        this.tail=tail;
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
    public LinkedList next() {
        return tail;
    }

    @Override
    public void setTail(Cons tail) {
        tail.tail=new Nil();
        this.tail=tail;
    }
}
