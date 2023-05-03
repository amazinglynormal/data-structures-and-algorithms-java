package io.stephenbrady.datastructures.trees;

import org.junit.jupiter.api.Test;

import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTreeTest {

    @Test
    public void testConstructorWithNoRoot() {
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();

        assertTrue(bst.isEmpty());
        assertEquals(0, bst.size());
    }

    @Test
    public void testConstructorWithInitialRoot() {
        BinarySearchTree<Integer> bst = new BinarySearchTree<>(1);

        assertTrue(bst.contains(1));
    }

    @Test
    public void testContains() {
        BinarySearchTree<Integer> bst = constructTestTree();

        assertTrue(bst.contains(89));
        assertFalse(bst.contains(69));
    }

    @Test
    public void testSize() {
        BinarySearchTree<Integer> bst = constructTestTree();

        assertEquals(11, bst.size());

        bst.delete(89);
        assertEquals(10, bst.size());

        bst.delete(17);
        assertEquals(9, bst.size());
    }

    @Test
    public void testInsert() {
        BinarySearchTree<Integer> bst = constructTestTree();

        Iterator<Integer> iter = bst.preOrderIterator();

        int[] array = new int[bst.size()];

        int i = 0;
        while (iter.hasNext()) {
            array[i] = iter.next();
            i++;
        }

        int[] expectedArray = new int[]{50,42,23,17,30,43,78,64,53,89,99};

        assertArrayEquals(expectedArray, array);
    }

    @Test
    public void testDelete() {
        BinarySearchTree<Integer> bst = constructTestTree();

        assertTrue(bst.contains(23));
        bst.delete(23);

        assertFalse(bst.contains(23));

        assertEquals(10, bst.size());

        Iterator<Integer> iter = bst.preOrderIterator();

        int[] array = new int[bst.size() + 1];

        int i = 0;
        while (iter.hasNext()) {
            array[i] = iter.next();
            i++;
        }

        int[] expectedArray = new int[]{50,42,30,17,43,78,64,53,89,99,0};

        assertArrayEquals(expectedArray, array);

    }



    private BinarySearchTree<Integer> constructTestTree() {
        BinarySearchTree<Integer> bst = new BinarySearchTree<>(50);
        bst.insert(78);
        bst.insert(42);
        bst.insert(23);
        bst.insert(43);
        bst.insert(17);
        bst.insert(64);
        bst.insert(53);
        bst.insert(89);
        bst.insert(99);
        bst.insert(30);
        return bst;
    }

}