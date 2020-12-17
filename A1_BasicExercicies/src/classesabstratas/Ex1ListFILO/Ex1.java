package classesabstratas.Ex1ListFILO;

public class Ex1 {
    public static void main(String[] args) {
        LinkedList list = new Cons(43, new Nil());
        LinkedList newList = new Cons(47, new Nil());

        list = list.add(5);
        list = list.add(9);
        newList = newList.add(10);

        list.showElements();
        newList.showElements();

        System.out.println("----");

        list = list.append(newList);
        list.showElements();

        System.out.println("----");

        list = list.reverse();
        list.showElements();
    }
}
