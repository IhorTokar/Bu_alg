package com.bu.algs.impl;

import com.bu.algs.BuHashable;
import com.bu.algs.BuMap;
import com.bu.algs.BuStack;
import com.bu.algs.util.Objects;

public class MyStackImpl <T> implements BuStack<T> {

    public class TopNode<T>{

        public T elem;

        public TopNode<T> next;

        public TopNode(T elem, TopNode next){
            this.elem = elem;
            this.next = next;
        }
    }

    private TopNode<T> top;

    @Override
    public int size() {
        int count = 0;
        TopNode current = top;

        while (current != null){
            count++;
            current = current.next;
        }
        return count;
    }

    @Override
    public boolean isEmpty() {
        return top == null;
    }

    @Override
    public boolean contains(T elem) {

        TopNode current = top;

        while (current != null){
            if(Objects.equals(current.elem, elem)){
                return true;
            }
            current = current.next;
        }
        return false;
    }

    @Override
    public void clear() {
        top = null;
    }

    @Override
    public T push(T item) {
        top = new TopNode<> (item, top);
        return item;
    }

    @Override
    public T pop() {
        if(top == null){
            return null;
        }
        T result = top.elem;
        top = top.next;
        return result;
    }

    @Override
    public T peek() {
        if(top == null){
            return null;
        }
        return top.elem;
    }

    @Override
    public int search(T elem) {
        TopNode current = top;
        int index = 0;
        while (current != null){
            if (Objects.equals(elem, current.elem)) {
                return index;
            }
            index++;
            current = current.next;
        }
        return -1;
    }
}
