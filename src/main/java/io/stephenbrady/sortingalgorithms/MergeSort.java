package io.stephenbrady.sortingalgorithms;

public class MergeSort {

    public static void sort(int[] array) {

        if (array == null || array.length < 2) {
            return;
        }

        int middleIndex = array.length / 2;

        int[] leftHalf = new int[middleIndex];
        int[] rightHalf = new int[array.length - middleIndex];

        for (int i = 0; i < middleIndex; i++) {
            leftHalf[i] = array[i];
        }

        for (int i = middleIndex; i < array.length; i++) {
            rightHalf[i - middleIndex] = array[i];
        }

        sort(leftHalf);
        sort(rightHalf);

        merge(array, leftHalf, rightHalf);
    }

    private static void merge(int[] array, int[] leftHalf, int[]  rightHalf) {
        int i = 0, j = 0, k = 0;

        while (i < leftHalf.length && j < rightHalf.length) {
            if (leftHalf[i] <= rightHalf[j]) {
                array[k] = leftHalf[i];
                i++;
            } else {
                array[k] = rightHalf[j];
                j++;
            }
            k++;
        }

        while (i < leftHalf.length) {
            array[k] = leftHalf[i];
            i++;
            k++;
        }

        while (j < rightHalf.length) {
            array[k] = rightHalf[j];
            j++;
            k++;
        }
    }

}
