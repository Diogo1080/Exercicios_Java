package classesabstratas.Ex5listaLigada;

public abstract class LinkedList {
    public abstract boolean isEmpty();

    public abstract int head();

    public abstract LinkedList head(String name);

    public abstract LinkedList next();

    public abstract LinkedList prev();

    public abstract void addNext(int head);

    public abstract void addPrev(int head);

    public abstract void setNext(LinkedList list);

    public abstract void setPrev(LinkedList list);

    public LinkedList readingHeadBegining;
    public LinkedList readingHeadend;

    public void showElementsFiFo() {
        LinkedList thisList = readingHeadBegining;
        while (!thisList.isEmpty()) {
            if (thisList.next().isEmpty()){
                System.out.print(thisList.head());
                break;
            }
            System.out.print(thisList.head() + " <-> ");
            thisList = thisList.next();
        }
        System.out.println();
    }

    public void showElementsFiLo() {
        LinkedList thisList = readingHeadend;
        while (!thisList.isEmpty()) {
            if (thisList.prev().isEmpty()){
                System.out.print(thisList.head());
                break;
            }
            System.out.print(thisList.head() + " <-> ");
            thisList = thisList.prev();
        }
        System.out.println();
    }
}
