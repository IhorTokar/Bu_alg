package com.bu.algs.impl;

import com.bu.algs.BuHashable;
import com.bu.algs.BuMap;
import com.bu.algs.util.Objects;

public class MyMapIpl <K extends BuHashable , V> implements BuMap<K, V> {

    private static final int CAPACITY = 16;

    Object[] mapObjects = new Object[CAPACITY];
    int size = 0;

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void clear() {
        mapObjects = new Object[CAPACITY];
        size = 0;
    }

    @Override
    public V put(K key, V value) {
        int hash = key.hash();
        int mapObjNum = hash & CAPACITY;

        Object oldValue = mapObjects[mapObjNum];
        if (oldValue == null) {
            size++;
        } else {
            System.out.println("Данный элемент уже присутствует");
        }

        mapObjects[mapObjNum] = value;
        return (V) oldValue;
    }

    @Override
    public V get(K key) {
        int hash = key.hash();
        int maplObjNum = hash & CAPACITY;

        return (V) mapObjects[maplObjNum];
    }

    @Override
    public V remove(K key) {
        int hash = key.hash();
        int maplObjNum = hash & CAPACITY;

        Object value = mapObjects[maplObjNum];

        if(value != null){
            size--;

            mapObjects[maplObjNum] = null;
        }
        return (V) value;

    }

    @Override
    public boolean containsKey(K key) {
        int hash = key.hash();
        int maplObjNum = hash & CAPACITY;

        return mapObjects[maplObjNum] != null;
    }

    @Override
    public boolean containsValue(V value) {
        for (Object maplObj : mapObjects) {
            if (Objects.equals(maplObj, value)) {
                return true;
            }
        }
        return false;
    }
}
