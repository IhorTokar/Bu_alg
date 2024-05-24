package com.bu.algs.impl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyStackImplTest {
    @Test
    void size() {
        MyStackImpl<Integer> stack = new MyStackImpl<>();
        Assertions.assertEquals(0, stack.size());

        stack.push(10);
        stack.push(20);
        stack.push(30);
        Assertions.assertEquals(3, stack.size());

        stack.pop();
        Assertions.assertEquals(2, stack.size());
    }

    @Test
    void isEmpty() {
        MyStackImpl<Integer> stack = new MyStackImpl<>();
        Assertions.assertTrue(stack.isEmpty());

        stack.push(10);
        Assertions.assertFalse(stack.isEmpty());

        stack.pop();
        Assertions.assertTrue(stack.isEmpty());
    }

    @Test
    void contains() {
        MyStackImpl<Integer> stack = new MyStackImpl<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        Assertions.assertTrue(stack.contains(20));
        Assertions.assertFalse(stack.contains(40));
    }

    @Test
    void clear() {
        MyStackImpl<Integer> stack = new MyStackImpl<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        Assertions.assertFalse(stack.isEmpty());
        stack.clear();
        Assertions.assertTrue(stack.isEmpty());
    }

    @Test
    void push() {
        MyStackImpl<Integer> stack = new MyStackImpl<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        Assertions.assertEquals(3, stack.size());
        Assertions.assertTrue(stack.contains(20));
    }

    @Test
    void pop() {
        MyStackImpl<Integer> stack = new MyStackImpl<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        int popped = stack.pop();
        Assertions.assertEquals(30, popped);
        Assertions.assertEquals(2, stack.size());
    }

    @Test
    void peek() {
        MyStackImpl<Integer> stack = new MyStackImpl<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        int top = stack.peek();
        Assertions.assertEquals(30, top);
        Assertions.assertEquals(3, stack.size());
    }

    @Test
    void search() {
        MyStackImpl<Integer> stack = new MyStackImpl<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        Assertions.assertEquals(1, stack.search(20));
        Assertions.assertEquals(-1, stack.search(40));
    }

}