package io.stephenbrady.sortingalgorithms;

public class SelectionSort {

    public static void sort(int[] array) {
        if (array == null || array.length == 1) {
            return;
        }

        for (int i = 0; i < array.length - 1; i++) {
            int minValue = array[i];
            int minValueIndex = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < minValue) {
                    minValue = array[j];
                    minValueIndex = j;
                }
            }

            if (minValueIndex != i) {
                swap(array, i, minValueIndex);
            }
        }
    }

    private static void swap(int[] array, int indexA, int indexB) {
        int temp = array[indexA];
        array[indexA] = array[indexB];
        array[indexB] = temp;
    }
}
