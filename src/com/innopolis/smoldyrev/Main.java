package com.innopolis.smoldyrev;

import com.innopolis.smoldyrev.stockers.DigCollector;
import com.innopolis.smoldyrev.threadsPack.ThreadGenerator;
import com.innopolis.smoldyrev.threadsPack.ThreadPrintCollection;

public class Main {

    public static void main(String[] args) {

        Thread t1 = new Thread(new ThreadGenerator());
        Thread t2 = new Thread(new ThreadPrintCollection());

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(DigCollector.getArr().toString());
    }


}
