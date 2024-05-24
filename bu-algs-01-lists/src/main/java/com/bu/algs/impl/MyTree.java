package com.bu.algs.impl;

import com.bu.algs.BuTree;

public class MyTree<T extends Comparable<T>> implements BuTree<T> {

    private class Node{
        T value;

        Node left, right;

        public Node(T value){
            this.value = value;
        }
    }

    Node root;

    @Override
    public int size() {
        return sizeRecursive(root);
    }

    private int sizeRecursive(Node current) {
        if (current == null) {
            return 0;
        }
        return sizeRecursive(current.left) + sizeRecursive(current.right) + 1;
    }

    @Override
    public boolean isEmpty() {
        return root == null;
    }

    @Override
    public boolean contains(T elem) {
        return containsRecursive(root, elem);
    }
    private boolean containsRecursive(Node current, T value) {
        if (current == null) {
            return false;
        }
        if (value == current.value) {
            return true;
        }
        return value.compareTo(current.value) < 0
                ? containsRecursive(current.left, value)
                : containsRecursive(current.right, value);
    }

    @Override
    public void clear() {
        root = null;
    }

    @Override
    public void add(T value) {
            root = addRecorse(root, value);
    }

    public Node addRecorse(Node node, T value){
        if(node == null){
            return new Node(value);
        }

        if(value.compareTo(node.value) < 0){
            node.left = addRecorse(node.left, value);
        }
        else if (value.compareTo(node.value) > 0) {
            node.right = addRecorse(node.right, value);
        }
        else {
            return node;
        }
        return node;
    }

    @Override
    public T delete(T value) {
        root = deleteRecursive(root, value);
        return value;
    }

    private Node deleteRecursive(Node node, T value) {
        if (node == null) {
            return null;
        }

        if (value.compareTo(node.value) < 0) {
            node.left = deleteRecursive(node.left, value);
        } else if (value.compareTo(node.value) > 0) {
            node.right = deleteRecursive(node.right, value);
        } else {
            if (node.left == null){
                return node.right;}
            else if (node.right == null){
                return node.left;}

            node.value = findMinValue(node.right);
            node.right = deleteRecursive(node.right, node.value);
        }

        return node;
    }

    private T findMinValue(Node node) {
        T minValue = node.value;
        while (node.left != null) {
            minValue = node.left.value;
            node = node.left;
        }
        return minValue;
    }

    @Override
    public void print() {
        print(root, 1);
    }

    private void print(Node root, int space) {
        if (root == null)
            return;
        space += 5;
        print(root.right, space);

        System.out.print("\n");
        for (int i = 5; i < space; i++)
            System.out.print(" ");
        System.out.print(root.value + "\n");

        // Process left child
        print(root.left, space);
    }
}
