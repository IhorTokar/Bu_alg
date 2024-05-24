package com.bu.algs.impl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyLinkedListTest {
    @Test
    public void isEmptyZero(){
        MyLinkedList list = new MyLinkedList();
        assert list.isEmpty();
    }
    @Test
    public void addList(){
        MyLinkedList testList = new MyLinkedList();
        testList.add(1);
        assert !testList.isEmpty();
    }
    @Test
    public void clearList(){
        MyLinkedList testList = new MyLinkedList();
        testList.add(12);
        testList.add(17);
        testList.add(33);
        testList.clear();
        assert testList.isEmpty();
    }
    @Test
    public void indexFinder(){
        MyLinkedList testList = new MyLinkedList();
        testList.add(12);
        testList.add(17);
        testList.add(33);
        Assertions.assertEquals(12, testList.get(0));
        Assertions.assertEquals(17, testList.get(1));
       Assertions.assertEquals(33, testList.get(2));}
    @Test
    public void Deletere(){
        MyLinkedList testList = new MyLinkedList();
        testList.add(12);
        testList.add(17);
        testList.add(33);

        testList.remove(0);
        Assertions.assertEquals(17, testList.get(0));
        testList.clear();
        testList.add(12);
        testList.add(12);
        testList.add(34);
        testList.add(90);
        testList.add(6);
        testList.add(5);

        testList.remove(0);
        testList.remove(1);
        testList.remove(2);
        Assertions.assertEquals(6, testList.get(2));
    }

    @Test
    public void AddingIndex(){
        MyLinkedList testList = new MyLinkedList();
        testList.add(2, 0);
        testList.add(5, 1);
        testList.add(9, 2);
        Assertions.assertEquals(2, testList.get(0));
        Assertions.assertEquals(5, testList.get(1));
        Assertions.assertEquals(9, testList.get(2));
    }

    @Test
    public void TestType(){
        MyLinkedList<Integer> testList = new MyLinkedList();
        testList.add(2, 0);
        testList.add(5, 1);
        testList.add(0, 2);
        Assertions.assertEquals(2, testList.get(0));
        Assertions.assertEquals(5, testList.get(1));
        Assertions.assertEquals(0, testList.get(2));
    }
}