package classesabstratas.Ex5listaLigada;

public final class Nil extends LinkedList {
    private LinkedList next;
    private LinkedList prev;

    public Nil(LinkedList next, LinkedList prev) {
        this.next=null;
        this.prev=null;
        if (next!=null) this.next = next;
        if (prev!=null) this.prev = prev;
    }

    @Override
    public boolean isEmpty() {
        return true;
    }

    @Override
    public int head() {
        throw new RuntimeException("List is empty");
    }

    @Override
    public LinkedList head(String name) {
        return null;
    }

    @Override
    public LinkedList next() {
        return next;
    }

    @Override
    public LinkedList prev() {
        return prev;
    }

    @Override
    public void addNext(int head) {}

    @Override
    public void addPrev(int head) {}

    @Override
    public void setNext(LinkedList list) {}

    @Override
    public void setPrev(LinkedList list) {}
}
