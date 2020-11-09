package classesabstratas.Ex2ListFIFO;

public abstract class LinkedList {
    public abstract boolean isEmpty();
    public abstract int head();
    public abstract LinkedList next();
    public abstract void setTail(Cons tail);

    public final void add(int head) {
        LinkedList original = this;

        while (!original.next().isEmpty()) {
            original = original.next();
        }

        original.setTail(new Cons(head, original));
    }

    public int countElements() {
        return isEmpty() ? 0 : 1 + next().countElements();
    }

    public void showElements() {
        LinkedList listToShow = this;
        while (!listToShow.isEmpty()) {
            if (listToShow.next().isEmpty()) {
                System.out.print(listToShow.head());
                break;
            }
            System.out.print(listToShow.head() + " -> ");
            listToShow = listToShow.next();
        }
        System.out.println();
    }

    public LinkedList append(LinkedList other) {
        LinkedList thisList = this;

        while (!other.isEmpty()) {
            thisList.add(other.head());
            other = other.next();
        }

        return thisList;
    }
}
