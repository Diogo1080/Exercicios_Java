package a5_ArraysMatrizes.Ex2;

public class Functions {

    public static int[] addElementToArray (int[] array){
        int[] newArray = new int[array.length+1];

        for (int i = 0;i < array.length;i++){
            newArray[i] = array[i];
        }

        return newArray;
    }

    public static int[] removeRepeatedFromArray (int[] array){
        int[] numbersToRemove = new int[1];
        boolean entry = false;

        numbersToRemove[0] = array[0];

        for (int i = 1;i < array.length;i++){

            for (int j = 0;j < numbersToRemove.length;j++){
                if (array[i] != numbersToRemove[j]){
                    entry = true;
                } else {
                    entry = false;
                    break;
                }
            }

            if (entry){
                numbersToRemove = addElementToArray(numbersToRemove);
                numbersToRemove[numbersToRemove.length-1] = array[i];
            }
        }
        return numbersToRemove;
    }

}
