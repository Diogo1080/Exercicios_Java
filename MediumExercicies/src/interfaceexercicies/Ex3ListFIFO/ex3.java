package interfaceexercicies.Ex3ListFIFO;

public class ex3 {
    public static void main(String[] args) {
        LinkedList list = new List(43, new Nil(0,null));

        list.showElements();

        list.add(5);

        list.showElements();

        list.add(9);

        list.showElements();

        System.out.println(list.countElements());
    }
}
