package io.stephenbrady.sortingalgorithms;

import io.stephenbrady.Utils;

public class BubbleSort {
    public static void sortVersionOne(int[] array) {
        if (array == null || array.length == 1) {
            return;
        }

        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = 1; j <= i; j++) {
                if (array[j] < array[j - 1]) {
                    Utils.swapArrayIndexes(array, j, j - 1);
                }
            }
        }
    }

    public static void sortVersionTwo(int[] array) {
        if (array == null || array.length == 1) {
            return;
        }

        boolean sorted = false;

        while(!sorted) {
            sorted = true;

            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    Utils.swapArrayIndexes(array, i, i - 1);
                    sorted = false;
                }
            }
        }
    }
}
