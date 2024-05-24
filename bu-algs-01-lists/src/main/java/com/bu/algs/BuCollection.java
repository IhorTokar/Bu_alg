package com.bu.algs;

public interface BuCollection<T> {

    int size();

    boolean isEmpty();

    boolean contains(T elem);

    void clear();
}
