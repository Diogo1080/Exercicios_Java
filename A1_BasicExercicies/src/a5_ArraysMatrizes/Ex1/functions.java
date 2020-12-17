package a5_ArraysMatrizes.Ex1;

public class functions {

    public static boolean verifyIfArraysAreEqual(int[] firstArray, int[] secondArray){
        boolean bool=false;

        if (firstArray.length==secondArray.length){
            for (int i=0;i<firstArray.length;i++){
                if (firstArray[i]==secondArray[i]){
                    bool = true;
                }else{
                    bool=false;
                    break;
                }
            }
        }

        return bool;
    }

}
