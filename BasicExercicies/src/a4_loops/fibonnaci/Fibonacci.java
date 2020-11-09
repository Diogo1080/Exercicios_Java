package a4_loops.fibonnaci;

public class Fibonacci {
    public static void main(String[] args) {
        int i = 1;
        int Fibonacci = 1;
        int last = 1;
        int use;

        while (i < 15) {
            use = last;
            last = Fibonacci;
            Fibonacci = Fibonacci + use;

            System.out.println(Fibonacci);
            i++;
        }
    }

}
