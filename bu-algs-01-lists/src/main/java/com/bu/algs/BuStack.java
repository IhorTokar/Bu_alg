package com.bu.algs;

public interface BuStack<T> extends BuCollection<T> {

    T push(T item);

    T pop();

    T peek();

    int search(T elem);
}
