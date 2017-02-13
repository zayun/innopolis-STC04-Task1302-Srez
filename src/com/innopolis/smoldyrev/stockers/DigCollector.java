package com.innopolis.smoldyrev.stockers;

import java.util.HashSet;

/**
 * Created by smoldyrev on 13.02.17.
 */
public class DigCollector {
    private static volatile HashSet<Integer> arr = new HashSet<>(100);
    private static volatile boolean enough;

    public static synchronized HashSet<Integer> getArr() {
        return arr;
    }

    public static boolean isEnough() {
        return enough;
    }

    public static synchronized void put(Integer value) {

        if (!(arr.contains(value))) {
            System.out.println("add: " + value);
            arr.add(value);
            if (arr.size() >= 100) {
                enough = true;
            }

        }

    }
}
