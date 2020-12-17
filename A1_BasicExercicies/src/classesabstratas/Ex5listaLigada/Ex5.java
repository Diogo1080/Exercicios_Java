package classesabstratas.Ex5listaLigada;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("First number of list:");
        LinkedList list = new list(scan.nextInt());

        int choice;
        do {
            System.out.println("*-----------Menu------------*");
            System.out.println("* 1- Add next to list       *");
            System.out.println("* 2- Add prev to list       *");
            System.out.println("* 3- List all elements Fifo *");
            System.out.println("* 4- List all elements Filo *");
            System.out.println("* 0- Exit                   *");
            System.out.println("*---------------------------*");
            choice = scan.nextInt();  // Read user input
            switch (choice) {
                case 1:
                    System.out.println("Introduza o numero a adicionar");
                    list.addNext(scan.nextInt());
                    break;
                case 2:
                    System.out.println("Introduza o numero a adicionar");
                    list.addPrev(scan.nextInt());
                    break;
                case 3:
                    System.out.println("List:");
                    list.showElementsFiFo();
                    break;
                case 4:
                    System.out.println("List:");
                    list.showElementsFiLo();
                    break;
                case 0:
                    System.out.println("Exiting...");
                default:
                    System.out.println("Numero incompativel.");
            }
        }while (choice != 0) ;
    }
}
