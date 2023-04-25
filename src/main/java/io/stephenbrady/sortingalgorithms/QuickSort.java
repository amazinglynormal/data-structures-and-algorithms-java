package io.stephenbrady.sortingalgorithms;

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

        swap(array, pivot, end);

        int leftPointer = start;
        int rightPointer = end - 1;

        while (leftPointer < rightPointer) {
            while (array[leftPointer] <= array[end] && leftPointer < rightPointer) {
                leftPointer++;
            }

            while (array[rightPointer] >= array[end] && leftPointer < rightPointer) {
                rightPointer--;
            }

            swap(array, leftPointer, rightPointer);
        }

        swap(array, leftPointer, end);

        return leftPointer;
    }

    private static int middleOfThreePivot(int[] array, int start, int end) {
        int mid = start + (end - start) / 2;

        if (array[start] > array[mid]) {
            swap(array, start, mid);
        }

        if (array[mid] > array[end]) {
            swap(array, mid, end);
        }

        if (array[start] > array[mid]) {
            swap(array, start, mid);
        }

        return mid;
    }

    private static void swap(int[] array, int indexA, int indexB) {
        int temp = array[indexA];
        array[indexA] = array[indexB];
        array[indexB] = temp;
    }
}
