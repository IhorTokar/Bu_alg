package com.bu.algs.impl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// TODO: add test cases for BuList methods
public class BuArrayListTest {

    @Test
    void isEmpty() {
        BuArrayList<String> buArrayList = new BuArrayList<>();

        Assertions.assertTrue(buArrayList.isEmpty());

        buArrayList.add("Some elem");

        Assertions.assertFalse(buArrayList.isEmpty());

        buArrayList.remove("Some elem");

        Assertions.assertTrue(buArrayList.isEmpty());
    }

    @Test
    void size() {
        BuArrayList<String> buArrayList = new BuArrayList<>();
        buArrayList.add("first elem");
        buArrayList.add("second elem");

        Assertions.assertEquals(2, buArrayList.size());

        buArrayList.add("third elem");

        Assertions.assertEquals(3, buArrayList.size());

        buArrayList.remove(0);
        buArrayList.remove(0);

        Assertions.assertEquals(1, buArrayList.size());
    }

    @Test
    void clear() {
        BuArrayList<String> buArrayList = new BuArrayList<>();
        buArrayList.add("first elem");
        buArrayList.add("second elem");

        buArrayList.clear();

        Assertions.assertTrue(buArrayList.isEmpty());
    }

    @Test
    void contains() {
        BuArrayList<String> buArrayList = new BuArrayList<>();
        buArrayList.add("first elem");
        buArrayList.add("second elem");

        Assertions.assertTrue(buArrayList.contains("first elem"));
        Assertions.assertTrue(buArrayList.contains("second elem"));
    }
}
