package a5_ArraysMatrizes.Ex6;

public class SwitchArrays {
    public static void main(String[] args) {
        int[][] array = new int[][]{{10, 20, 30}, {40, 50, 60}};
        int[][] swapedArray = new int[array[0].length][array.length];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < swapedArray[0].length; j++) {
                swapedArray[j][i] = array[i][j];
            }
        }

        for (int i = 0; i < swapedArray.length; i++) {
            for (int j = 0; j < swapedArray[i].length; j++) {
                System.out.print(swapedArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
