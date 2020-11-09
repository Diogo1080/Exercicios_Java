package interfaceexercicies.Ex3ListFIFO;

public interface LinkedList {
    boolean isEmpty();

    int head();
    int countElements();

    LinkedList tail();

    void add(int i);
    void showElements();
    void setTail(List tail);
}
