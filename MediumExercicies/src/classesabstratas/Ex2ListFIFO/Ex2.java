package classesabstratas.Ex2ListFIFO;

public class Ex2 {
    public static void main(String[] args) {
        LinkedList list = new Cons(43, new Nil());

        System.out.println(list.countElements());

        list.showElements();

        list.add(5);

        list.showElements();

        list.add(9);

        list.showElements();

        LinkedList newlist = new Cons(98, new Nil());

        list.append(newlist);

        list.showElements();
    }
}
