package a5_ArraysMatrizes.Ex3;

public class Ex3 {
    public static void main(String[] args) {
        int[] array = slice(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 4, 10);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    static int[] slice(int[] array, int start, int end) {
        int[] reducedArray = new int[array.length - start - (array.length - end)];
        int j = 0;

        for (int i = 0; i < array.length; i++) {
            if (i >= start && i < end) {
                reducedArray[j] = array[i];
                j++;
            }
        }

        return reducedArray;
    }
}
