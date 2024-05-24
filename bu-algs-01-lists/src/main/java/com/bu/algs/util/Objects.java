package com.bu.algs.util;

public final class Objects {

    // empty constructor to make sure that instance of util class is impossible to create
    private Objects() {}

    public static <T> boolean equals(T a, T b) {
        // check if links are pointed to the same memory address
        if (a == b) {
            return true;
        }

        // plain equals check for non-null objects
        if (a != null && b != null) {
            return a.equals(b);
        }

        return false;
    }

    public static <T> int compare(T first, T second){
        String s1 = first.toString();
        String s2 = second.toString();
        return s1.compareTo(s2);
    }
}
