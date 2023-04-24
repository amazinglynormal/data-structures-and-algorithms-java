package io.stephenbrady.binarysearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstTrueInSortedBooleanArrayTest {

    @Test
    public void testFirstTrueInSortedBooleanArray() {
        boolean[] arr1 = {false,false,true,true,true};
        boolean[] arr2 = {true};
        boolean[] arr3 = {false,false,false};
        boolean[] arr4 = {true,true,true,true,true};
        boolean[] arr5 = {false,true};
        boolean[] arr6 = {false,false,false,false,false,false,false,false, false, true};

        int ans1 = FirstTrueInSortedBooleanArray.search(arr1);
        int ans2 = FirstTrueInSortedBooleanArray.search(arr2);
        int ans3 = FirstTrueInSortedBooleanArray.search(arr3);
        int ans4 = FirstTrueInSortedBooleanArray.search(arr4);
        int ans5 = FirstTrueInSortedBooleanArray.search(arr5);
        int ans6 = FirstTrueInSortedBooleanArray.search(arr6);

        assertEquals(2, ans1);
        assertEquals(0, ans2);
        assertEquals(-1, ans3);
        assertEquals(0, ans4);
        assertEquals(1, ans5);
        assertEquals(9, ans6);

    }
}