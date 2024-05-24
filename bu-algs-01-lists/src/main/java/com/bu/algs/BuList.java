package com.bu.algs;

public interface BuList<T> extends BuCollection<T> {

    boolean add(T elem);

    boolean add(T elem, int index);

    T get(int index);

    boolean remove(T elem);

    T remove(int index);
}
