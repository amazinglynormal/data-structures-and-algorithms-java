package io.stephenbrady.binarysearch;

public class FirstTrueInSortedBooleanArray {
    public static int search(boolean[] array) {
        int left = 0;
        int right = array.length - 1;

        int boundaryIndex = -1; //  lowest index of found true else, -1

        while (left <=  right) {
            int mid = left + (right - left) / 2;

            if (array[mid]) {
                boundaryIndex = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return boundaryIndex;
    }
}
