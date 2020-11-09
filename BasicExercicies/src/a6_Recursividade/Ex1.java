package a6_Recursividade;

public class Ex1 {
    public static void main(String[] args) {
        int[] array = {10, 5, 3, 8};
        System.out.println(soma(array, 8));
    }

    public static int soma(int[] arr, int numSomas) {
        if (numSomas > arr.length) numSomas = arr.length;
        if (numSomas == 1) return arr[0];
        return arr[numSomas - 1] + soma(arr, numSomas - 1);
    }
}

