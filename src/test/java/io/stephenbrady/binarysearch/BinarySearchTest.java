package io.stephenbrady.binarysearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    @Test
    public void testBinarySearch() {
        int[] arr1 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        int[] arr2 = {-37,-23,-10,2,34,46,69,73,99};
        int[] arr3 = {};
        int[] arr4 = {7};
        int[] arr5 = {22,25};
        int[] arr6 = {6,6,6,6,6,6};
        int[] arr7 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        int[] arr8 = {22,25};

        int ans1 = BinarySearch.search(arr1, 4);
        int ans2 = BinarySearch.search(arr2, 46);
        int ans3 = BinarySearch.search(arr3, 4);
        int ans4 = BinarySearch.search(arr4, 7);
        int ans5 = BinarySearch.search(arr5, 25);
        int ans6 = BinarySearch.search(arr6, 6);
        int ans7 = BinarySearch.search(arr7, 26);
        int ans8 = BinarySearch.search(arr8, 22);

        assertEquals(3, ans1);
        assertEquals(5, ans2);
        assertEquals(-1, ans3);
        assertEquals(0, ans4);
        assertEquals(1, ans5);
        assertEquals(2, ans6);
        assertEquals(-1, ans7);
        assertEquals(0, ans8);

    }

}