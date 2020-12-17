package a5_ArraysMatrizes.Ex5;

public class Ex5 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[] array = flatten(matrix);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static int[] flatten(int[][] matrix) {
        int size = 0;

        for (int i = 0; i < matrix.length; i++) {
            size += matrix[i].length;
        }

        int[] array = new int[size];
        int position = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                array[position] = matrix[i][j];
                position++;
            }
        }
        return array;
    }
}
