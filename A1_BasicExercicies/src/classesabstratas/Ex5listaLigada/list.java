package classesabstratas.Ex5listaLigada;

public final class list extends LinkedList {
    private int head;
    private LinkedList list;
    private LinkedList next;
    private LinkedList prev;

    public list(int head) {
        super.readingHeadBegining = this;
        super.readingHeadend = this;
        this.head = head;
        next = new Nil(null, null);
        prev = new Nil(null, null);
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
    public LinkedList head(String name) {
        return list;
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
    public void addNext(int head) {
        LinkedList thislist = this;
        LinkedList next = new list(head);

        while (!thislist.next().isEmpty()) {
            thislist = thislist.next();
        }

        next.setPrev(thislist);
        thislist.setNext(next);
        super.readingHeadend = next;
    }

    @Override
    public void addPrev(int head) {
        LinkedList thislist = this;
        LinkedList prev = new list(head);

        prev.setNext(thislist);
        thislist.setPrev(prev);
        super.readingHeadBegining = prev;
    }

    @Override
    public void setNext(LinkedList list) {
        next = list;
    }

    @Override
    public void setPrev(LinkedList list) {
        prev = list;
    }
}
