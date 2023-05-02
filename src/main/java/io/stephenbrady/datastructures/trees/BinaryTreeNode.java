package io.stephenbrady.datastructures.trees;

public class BinaryTreeNode<T> {

    public T val;

    public BinaryTreeNode<T> left;

    public BinaryTreeNode<T> right;

    public BinaryTreeNode(T val) {
        this(val, null, null);
    }

    public BinaryTreeNode(T val, BinaryTreeNode<T> left, BinaryTreeNode<T> right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
