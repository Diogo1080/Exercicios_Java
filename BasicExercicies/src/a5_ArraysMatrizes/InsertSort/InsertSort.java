package a5_ArraysMatrizes.InsertSort;

public class InsertSort {
    public static void main(String[] args) {
        //declare and show array
        int[] array = new int[]{1, 9, 6, 8, 2, 4, 10, 5};

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] +  " ");
        }
        System.out.println();

        //sort
        if (array.length < 2) return;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j > 0 && array[j - 1] > array[j]; j--) {
                int temp = array[j];
                array[j] = array[j - 1];
                array[j - 1] = temp;
            }
        }

        //
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] +  " ");
        }
    }
}
