package com.bu.algs.impl;
import com.bu.algs.*;
public class Main {
    public static void main(String[] args) {
        MyTree<Integer> myTree = new MyTree<>();

        myTree.add(20);
        myTree.add(5);
        myTree.add(6);
        myTree.add(1);
        myTree.add(9);
        myTree.add(4);

        myTree.print();
        System.out.println("");
        myTree.delete(20);
        myTree.delete(1);
        myTree.print();
    }
}