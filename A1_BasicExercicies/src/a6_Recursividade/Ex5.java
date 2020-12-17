package a6_Recursividade;

public class Ex5 {
    public static void main(String[] args) {
        int[] array = new int[40];

        recamansSequence(array, 0);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void recamansSequence(int[] arrayInt, int n) {
        if (arrayInt.length == n) {
            return;
        }

        if (n == 0) {
            arrayInt[n] = 0;
        } else if (arrayInt[n - 1] - n > 0 && !(isInArray(arrayInt, arrayInt[n - 1] - n))) {
            arrayInt[n] = arrayInt[n - 1] - n;
        } else {
            arrayInt[n] = arrayInt[n - 1] + n;
        }

        recamansSequence(arrayInt, n + 1);
    }

    public static boolean isInArray(int[] array, int n) {
        for (int i = 0; i < array.length; i++) {
            if (n == array[i]) return true;
        }

        return false;
    }
}


