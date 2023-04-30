package io.stephenbrady.sortingalgorithms;

import io.stephenbrady.Utils;

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
                Utils.swapArrayIndexes(array, i, minValueIndex);
            }
        }
    }
}
