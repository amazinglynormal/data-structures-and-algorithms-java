package io.stephenbrady.datastructures.trees;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NodeTest {

    @Test
    public void testConstructor() {
        Node<Integer> node = new Node<>(1);

        assertEquals(1, node.val);
        assertEquals(0, node.children.size());
    }

    @Test
    public void testChildrenList() {
        Node<Integer> node = new Node<>(1);

        assertEquals(0, node.children.size());

        Node<Integer> childNode1 = new Node<>(2);
        Node<Integer> childNode2 = new Node<>(3);
        Node<Integer> childNode3 = new Node<>(4);
        Node<Integer> childNode4 = new Node<>(5);


        node.children.add(childNode1);
        node.children.add(childNode2);
        node.children.add(childNode3);
        node.children.add(childNode4);

        assertEquals(4, node.children.size());
    }
}