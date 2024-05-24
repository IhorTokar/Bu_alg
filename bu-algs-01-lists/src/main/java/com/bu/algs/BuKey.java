package com.bu.algs;

public class BuKey implements BuHashable {

    private final String key;

    public BuKey(String key) {
        this.key = key;
    }

    @Override
    public int hash() {
        return key == null ? 0 : key.length();
    }
}
