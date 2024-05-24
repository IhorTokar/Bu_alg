package com.bu.algs;

public interface BuTree<T extends Comparable<T>> extends BuCollection<T> {

    void add(T value);

    T delete(T value);

    void print();
}
