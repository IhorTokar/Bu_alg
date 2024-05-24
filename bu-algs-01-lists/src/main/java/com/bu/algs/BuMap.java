package com.bu.algs;

public interface BuMap<K extends BuHashable, V> {

    int size();

    boolean isEmpty();

    void clear();

    V put(K key, V value);

    V get(K key);

    V remove(K key);

    boolean containsKey(K key);

    boolean containsValue(V value);
}
