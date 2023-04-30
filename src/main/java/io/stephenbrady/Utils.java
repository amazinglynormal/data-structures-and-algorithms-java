package io.stephenbrady;

public class Utils {

    public static void swapArrayIndexes(int[] array, int indexA, int indexB) {
        int temp = array[indexA];
        array[indexA] = array[indexB];
        array[indexB] = temp;
    }
}
