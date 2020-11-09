package a5_ArraysMatrizes.Ex2;

public class RemoveRepeated {
    public static void main(String[] args) {
        int[] array = {1,2,1,3,1,4,2,3,4};
        array = Functions.removeRepeatedFromArray(array);

        for (int i = 0;i < array.length;i++){
            System.out.print(array[i]);
        }

        System.out.println();
    }
}
