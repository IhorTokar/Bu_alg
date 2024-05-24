package com.bu.algs.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HumanCompareApp {

    public static void main(String[] args) {

        Human h1 = new Human(150.0, 63.0, 16);
        Human h2 = new Human(150.0, 63.0, 6);
        Human h3 = new Human(195.0, 90.0, 26);

        List<Human> lh = new ArrayList<>();
        lh.add(h1);
        lh.add(h2);
        lh.add(h3);

        int older = h1.compareTo(h2);

        Collections.sort(lh);
        System.out.println(lh);
    }
}
