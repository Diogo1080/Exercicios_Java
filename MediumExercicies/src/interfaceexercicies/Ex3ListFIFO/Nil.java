package interfaceexercicies.Ex3ListFIFO;

public class Nil extends List implements LinkedList {
    public Nil(int head, List tail) {
        super(head, tail);
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
    public LinkedList tail() {
        throw new RuntimeException("List is empty");
    }
}
