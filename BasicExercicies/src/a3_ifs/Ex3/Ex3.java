package a3_ifs.Ex3;

public class Ex3 {
    public static void main(String[] args) {
        int number = 4, number2 = 3, number3 = 6;
        if (number > number2 && number > number3) {
            System.out.println(number + " é a maior.");
        } else if (number2 > number3) {
            System.out.println(number2 + " é a maior.");
        } else {
            System.out.println(number3 + " é a maior.");
        }
    }
}
