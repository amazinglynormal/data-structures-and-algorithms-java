package io.stephenbrady.datastructures.trees;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Stack;

public class BinarySearchTree<T extends Comparable<T>> {

    private class Node {
        T data;
        Node left;
        Node right;

        public Node(T data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    private Node root;
    private int numOfNodes = 0;

    public BinarySearchTree() {
        this.root = null;
    }

    public BinarySearchTree(T rootData) {
        this.root = new Node(rootData);
        numOfNodes++;
    }

    public void insert(T data) {
        if (isEmpty()) {
            root = new Node(data);
        }

        Node currentNode = root;

        while (currentNode != null) {
            int compareResult = data.compareTo(currentNode.data);

            if (compareResult == 0) {
                return;
            }

            if (compareResult < 0) {
                if (currentNode.left == null) {
                    currentNode.left = new Node(data);
                    break;
                }
                currentNode = currentNode.left;
            } else {
                if (currentNode.right == null) {
                    currentNode.right = new Node(data);
                    break;
                }
                currentNode = currentNode.right;
            }
        }

        numOfNodes++;
    }

    public boolean contains(T data) {
        Node currentNode = root;

        while (currentNode != null) {
            int compareResult = data.compareTo(currentNode.data);

            if (compareResult == 0) {
                return true;
            }

            if (compareResult < 0) {
                currentNode = currentNode.left;
            } else {
                currentNode = currentNode.right;
            }
        }

        return false;
    }

    public void delete(T data) {
        if (contains(data)) {
            root = delete(root, data);
            numOfNodes--;
        }
    }

    private Node delete(Node node, T data) {
        if (node == null) {
            return null;
        }

        int compareResult = data.compareTo(node.data);

        if (compareResult < 0) {
            node.left = delete(node.left, data);
        } else if (compareResult > 0) {
            node.right = delete(node.right, data);
        } else {
            if (node.left == null) {
                return node.right;
            } else if (node.right == null) {
                return node.left;
            } else {
                Node minNode = findMin(node.right);

                node.data = minNode.data;

                node.right = delete(node.right, minNode.data);
            }
        }

        return node;
    }

    private Node findMin(Node node) {
        while (node.left != null) {
            node = node.left;
        }

        return node;
    }

    public int size() {
        return numOfNodes;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public Iterator<T> preOrderIterator() {

        final int expectedNumOfNodes = numOfNodes;
        final Stack<Node> stack = new Stack<>();
        stack.push(root);

        return new Iterator<>() {
            @Override
            public boolean hasNext() {
                if (expectedNumOfNodes != numOfNodes) {
                    throw new ConcurrentModificationException();
                }

                return root != null && !stack.isEmpty();
            }

            @Override
            public T next() {
                if (expectedNumOfNodes != numOfNodes) {
                    throw new ConcurrentModificationException();
                }

                Node node = stack.pop();

                if (node.right != null) {
                    stack.push(node.right);
                }

                if (node.left != null) {
                    stack.push(node.left);
                }

                return node.data;
            }
        };

    }
}
