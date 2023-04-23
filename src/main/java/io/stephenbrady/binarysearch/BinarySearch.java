package io.stephenbrady.binarysearch;

public class BinarySearch {
    public static int search(int[] array, int target) {
        if (array == null || array.length == 0) {
            return -1;
        }

        if (array.length == 1 && array[0] == target) {
            return 0;
        }

        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == target) {
                return mid;
            }

            if (array[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
}
