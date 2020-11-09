package a6_Recursividade;

public class Ex4 {
    public static void main(String[] args) {
        System.out.println(divisorComum(9, 12));
    }

    public static int divisorComum(int num1, int num2) {
        if (num1==0) return num2;
        if (num2==0) return num1;

        if (num1<=num2) {
            return divisorComum(num1, num2 - num1);
        }else{
            return divisorComum(num1-num2,num2);
        }
    }
}
