package classesabstratas.Ex1ListFILO;

public abstract class LinkedList {
    public abstract boolean isEmpty();

    public abstract int head();

    public abstract LinkedList tail();

    public final LinkedList add(int head) {
        return new Cons(head, this);
    }

    public final int countElements() {
        return isEmpty() ? 0 : 1 + tail().countElements();
    }

    public void showElements() {
        LinkedList listToShow = this;

        while (!listToShow.isEmpty()) {
            if (listToShow.tail().isEmpty()) {
                System.out.print(listToShow.head());
                break;
            }

            System.out.print(listToShow.head() + " -> ");
            listToShow = listToShow.tail();
        }
        System.out.println();
    }

    public LinkedList reverse() {
        LinkedList rest = this;
        LinkedList result = new Nil();

        while (!rest.isEmpty()) {
            result = result.add(rest.head());
            rest = rest.tail();
        }

        return result;
    }

    public LinkedList append(LinkedList other) {
        LinkedList thisList = this;
        other=other.reverse();

        while (!other.isEmpty()) {
            thisList = thisList.add(other.head());
            other = other.tail();
        }

        return thisList;

/*
        LinkedList thisList = reverse();

        while (!thisList.isEmpty()) {
            other = other.add(thisList.head());
            thisList = thisList.tail();
        }

        return other;
*/
    }
}
