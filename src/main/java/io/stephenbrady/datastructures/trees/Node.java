package io.stephenbrady.datastructures.trees;

import java.util.ArrayList;
import java.util.List;

public class Node<T> {

    public T val;
    public List<Node<T>> children;

    public Node(T val) {
        this.val = val;
        this.children = new ArrayList<>();
    }
}
