package io.stephenbrady.datastructures.trees;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NodeTest {

    @Test
    public void testBasicConstructor() {
        Node<Integer> node = new Node<>(1);

        assertEquals(1, node.val);
        assertNull(node.left);
        assertNull(node.right);
    }

    @Test
    public void testFullConstructor() {
        Node<Integer> left = new Node<>(2);
        Node<Integer> right = new Node<>(3);
        Node<Integer> node = new Node<>(1, left, right);


        assertEquals(1, node.val);
        assertEquals(2, node.left.val);
        assertEquals(3, node.right.val);
    }

}