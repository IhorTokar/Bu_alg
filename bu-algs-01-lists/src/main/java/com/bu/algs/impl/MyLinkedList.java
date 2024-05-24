package com.bu.algs.impl;

import com.bu.algs.BuList;
import com.bu.algs.Reversible;
import com.bu.algs.Sortable;

public class MyLinkedList<T> implements BuList<T>, Reversible, Sortable {

    Realization<T> first;
    public static class Realization<T>{
        public T object;

        public Realization(T object, Realization<T> next) {
            this.next = next;
            this.object = object;
        }
        public Realization<T> next;
    }
    public MyLinkedList() {
        super();
    }

    @Override
    public int size() {
        Realization<T> current = first;
        int count = 1;
        if (isEmpty()){
            return 0;
        }
            while (current.next != null) {
                count++;
                current = current.next;
            }
        return count;
    }

    @Override
    public boolean isEmpty() {
        return first == null;
    }

    @Override
    public boolean contains(Object elem) {
        Realization<T> current = first;
        while (current != null) {
            if (current.object.equals(elem)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    @Override
    public void clear() {
        first = null;
    }

    @Override
    public boolean add(T elem) {
        if(isEmpty()){
            first = new Realization<T>(elem, null);
            return true;}
        Realization<T> current = first;
        while (current.next != null){
            current = current.next;
        }
        current.next = new Realization<T>(elem, null);
        return true;
    }

    @Override
    public boolean add(T elem, int index) {
        if(index > size() || index < 0 ){
            throw new RuntimeException("index is out of bounds");
        }

        if (index == 0){
            Realization<T> newElem = new Realization<T>(elem, first);
            first = newElem;
            return true;
        }
        int counter = 0;
        Realization<T> current = first;
        while (counter < index - 1){
            counter++;
            current = current.next;
        }
        Realization<T> newElem = new Realization<T>(elem, current.next);
        current.next = newElem;
        return true;
    }

    @Override
    public T get(int index) {
        if(index > size() || index < 0 ){
            throw new RuntimeException("index is out of bounds");
        }
        if (index == 0){
            return first.object;
        }
        int counter = 0;
        Realization<T> current = first;
        while (counter < index){
            counter++;
            current = current.next;
        }
        return current.object;
    }

    @Override
    public boolean remove(Object elem) {
        Realization<T> current = first;
        Realization<T> previous = null;
        while (current != null) {
            if (current.object.equals(elem)) {
                if (previous == null) {

                    first = current.next;
                } else {

                    previous.next = current.next;
                }
                return true;
            }
            previous = current;
            current = current.next;
        }
        return false;
    }

    @Override
    public T remove(int index) {

        T result;
        if(index >= size() - 1 || index < 0 ){
            throw new RuntimeException("index is out of bounds");
        }
        Realization<T> current = first.next;
        Realization<T> previos = first;
        if (index == 0){
            result = first.object;
            first = first.next;
            return result;
        }
        int counter = 0;

        while (counter < index){
            counter++;
            previos = current;
            current = current.next;
    }
        result = current.object;
        previos.next = current.next;
        return result;
    }

    @Override
    public void reverse() {
        Realization<T> current = first;
        Realization<T> reversed = null;

        while (current != null) {
            Realization<T> nextNode = current.next;

            current.next = reversed;
            reversed = current;

            current = nextNode;
        }

        first = reversed;
        }


    @Override
    public void sort() {
        Realization<T> current = first;

        Realization<T> sortedHead = null;
        while (current != null){

            Realization<T> nextNode = current.next;

            sortedHead = insertInSortedOrder(sortedHead, current);

            current = nextNode;
        }
        first = sortedHead;
    }

    private Realization<T> insertInSortedOrder(Realization<T> sortedHead, Realization<T> newNode) {
        if (sortedHead == null || ((Comparable) newNode.object).compareTo(sortedHead.object) <= 0) {
            newNode.next = sortedHead;
            return newNode;
        } else {
            Realization<T> current = sortedHead;
            while (current.next != null && ((Comparable) newNode.object).compareTo(current.next.object) > 0) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
            return sortedHead;
        }
    }
}
