package io.stephenbrady.datastructures.trees;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeNodeTest {
    @Test
    public void testBasicConstructor() {
        BinaryTreeNode<Integer> node = new BinaryTreeNode<>(1);

        assertEquals(1, node.val);
        assertNull(node.left);
        assertNull(node.right);
    }

    @Test
    public void testFullConstructor() {
        BinaryTreeNode<Integer> node = new BinaryTreeNode<>(1);

        node.left = new BinaryTreeNode<>(2);
        node.right = new BinaryTreeNode<>(3);

        assertEquals(1, node.val);
        assertEquals(2, node.left.val);
        assertEquals(3, node.right.val);
    }
}