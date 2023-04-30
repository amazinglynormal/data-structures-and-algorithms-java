package io.stephenbrady.sortingalgorithms;

import io.stephenbrady.Utils;

public class QuickSort {

    public static void sort(int[] array) {
        sort(array, 0, array.length - 1);
    }

    private static void sort(int[] array, int start, int end) {

        if (end - start < 2) {
            return;
        }

        int leftPointer = partition(array, start, end);

        sort(array, start, leftPointer);
        sort(array, leftPointer + 1, end);
    }

    private static int partition(int[] array, int start, int end) {
        int pivot = middleOfThreePivot(array, start, end);

        Utils.swapArrayIndexes(array, pivot, end);

        int leftPointer = start;
        int rightPointer = end - 1;

        while (leftPointer < rightPointer) {
            while (array[leftPointer] <= array[end] && leftPointer < rightPointer) {
                leftPointer++;
            }

            while (array[rightPointer] >= array[end] && leftPointer < rightPointer) {
                rightPointer--;
            }

            Utils.swapArrayIndexes(array, leftPointer, rightPointer);
        }

        Utils.swapArrayIndexes(array, leftPointer, end);

        return leftPointer;
    }

    private static int middleOfThreePivot(int[] array, int start, int end) {
        int mid = start + (end - start) / 2;

        if (array[start] > array[mid]) {
            Utils.swapArrayIndexes(array, start, mid);
        }

        if (array[mid] > array[end]) {
            Utils.swapArrayIndexes(array, mid, end);
        }

        if (array[start] > array[mid]) {
            Utils.swapArrayIndexes(array, start, mid);
        }

        return mid;
    }
}
