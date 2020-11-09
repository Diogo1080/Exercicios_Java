package interfaceexercicies.Ex3ListFIFO;


public class List implements LinkedList {
    private final int head;
    private List tail;

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

    public final void add(int head) {
        LinkedList original=this;

        while (!original.tail().isEmpty()){
            original=original.tail();
        }

        original.setTail(new List(head, (List) original));
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
    public void setTail(List tail) {
        tail.tail=new Nil(0,null);
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
    public LinkedList tail() {
        return tail;
    }
}
