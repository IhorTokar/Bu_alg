package com.bu.algs.impl;

import com.bu.algs.BuTree;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BuTreeTest {

    @Test
    void size() {
        MyTree<Integer> tree = new MyTree<>();
        Assertions.assertEquals(0, tree.size());

        tree.add(10);
        tree.add(5);
        tree.add(15);
        tree.add(3);
        tree.add(7);
        tree.add(12);
        tree.add(18);
        Assertions.assertEquals(7, tree.size());

        tree.delete(5);
        Assertions.assertEquals(6, tree.size());

        tree.clear();
        Assertions.assertEquals(0, tree.size());
    }

    @Test
    void isEmpty() {
        MyTree<Integer> tree = new MyTree<>();
        Assertions.assertTrue(tree.isEmpty());

        tree.add(10);
        Assertions.assertFalse(tree.isEmpty());

        tree.clear();
        Assertions.assertTrue(tree.isEmpty());
    }

    @Test
    void contains() {
        MyTree<Integer> tree = new MyTree<>();
        tree.add(10);
        tree.add(5);
        tree.add(15);
        tree.add(3);
        tree.add(7);
        tree.add(12);
        tree.add(18);

        Assertions.assertTrue(tree.contains(5));
        Assertions.assertTrue(tree.contains(15));
        Assertions.assertFalse(tree.contains(8));
    }

    @Test
    void delete() {
        MyTree<Integer> tree = new MyTree<>();
        tree.add(10);
        tree.add(5);
        tree.add(15);
        tree.add(3);
        tree.add(7);
        tree.add(12);
        tree.add(18);

        tree.delete(5);
        Assertions.assertFalse(tree.contains(5));
        Assertions.assertEquals(6, tree.size());

        tree.delete(15);
        Assertions.assertFalse(tree.contains(15));
        Assertions.assertEquals(5, tree.size());
    }

    @Test
    void clear() {
        MyTree<Integer> tree = new MyTree<>();
        tree.add(10);
        tree.add(5);
        tree.add(15);

        Assertions.assertFalse(tree.isEmpty());
        tree.clear();
        Assertions.assertTrue(tree.isEmpty());
    }
}
