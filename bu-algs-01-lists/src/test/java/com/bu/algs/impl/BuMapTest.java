package com.bu.algs.impl;

import com.bu.algs.BuKey;
import com.bu.algs.BuMap;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BuMapTest {

    @Test
    void put() {
        MyMapIpl<BuKey, String> map = new MyMapIpl<>();
        map.put(new BuKey("foo"), "bar");

        Assertions.assertEquals("bar", map.get(new BuKey("foo")));
    }

    @Test
    void size() {
        MyMapIpl<BuKey, String> map = new MyMapIpl<>();
        Assertions.assertEquals(0, map.size());

        map.put(new BuKey("foo"), "bar");
        Assertions.assertEquals(1, map.size());

        map.remove(new BuKey("foo"));
        Assertions.assertEquals(0, map.size());
    }

    @Test
    void delete() {
        MyMapIpl<BuKey, String> map = new MyMapIpl<>();
        map.put(new BuKey("foo"), "bar");
        map.put(new BuKey("roar"), "drago");
        map.put(new BuKey("foo"), "ber");

        Assertions.assertTrue(map.containsKey(new BuKey("foo")));
        map.remove(new BuKey("foo"));
        Assertions.assertFalse(map.containsKey(new BuKey("foo")));
    }

    @Test
    void clear() {
        MyMapIpl<BuKey, String> map = new MyMapIpl<>();
        map.put(new BuKey("foo"), "bar");
        map.put(new BuKey("roar"), "drago");
        map.put(new BuKey("foo"), "ber");

        Assertions.assertFalse(map.isEmpty());

        map.clear();

        Assertions.assertTrue(map.isEmpty());
    }

    @Test
    void containsKey() {
        MyMapIpl<BuKey, String> map = new MyMapIpl<>();
        map.put(new BuKey("foo"), "bar");
        map.put(new BuKey("roar"), "drago");
        map.put(new BuKey("dev"), "mey");

        Assertions.assertTrue(map.containsKey(new BuKey("foo")));
    }

    @Test
    void containsValue() {
        MyMapIpl<BuKey, String> map = new MyMapIpl<>();
        map.put(new BuKey("foo"), "bar");
        map.put(new BuKey("roar"), "drago");
        map.put(new BuKey("dev"), "mey");

        Assertions.assertTrue(map.containsValue("bar"));
        Assertions.assertFalse(map.containsValue("missing"));
    }
}
