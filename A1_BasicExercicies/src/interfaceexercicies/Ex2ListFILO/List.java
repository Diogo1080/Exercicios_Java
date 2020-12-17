package interfaceexercicies.Ex2ListFILO;

public class List implements LinkedList {
    private final int head;
    private final List tail;

    public List(int head, List tail) {
        this.head = head;
        this.tail = tail;
    }

    public final int countElements() {
        LinkedList original = this;
        int count = 0;

        while (!original.isEmpty()) {
            count++;
            original = original.tail();
        }

        return count;
    }

    public final LinkedList add(int head) {
        return new List(head, this);
    }

    public void showElements() {
        List listToShow = this;

        while (!listToShow.isEmpty()) {
            if (listToShow.tail().isEmpty()) {
                System.out.print(listToShow.head());
                break;
            }

            System.out.print(listToShow.head() + " -> ");
            listToShow = (List) listToShow.tail();
        }
        System.out.println();
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
