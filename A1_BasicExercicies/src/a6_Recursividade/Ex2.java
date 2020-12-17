package a6_Recursividade;
/*
        int i=1;
        int fibonanci=1;
        int last=1;
        int use=0;
        while (i<15){
            use=last;
            last=fibonanci;
            fibonanci=fibonanci+use;

            System.out.println(fibonanci);
            i++;
        }
 */
public class Ex2 {
    public static void main(String[] args) {
        System.out.println(fibonacci(7));
    }
    public static int fibonacci(int num){
        if ((num == 0) || (num == 1)) return num;
        return fibonacci(num - 1) + fibonacci(num - 2);
    }
}
