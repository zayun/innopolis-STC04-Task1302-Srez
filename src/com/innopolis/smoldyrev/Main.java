package com.innopolis.smoldyrev;

public class Main {

    public static void main(String[] args) {
        Thread t1 = new Thread(new ThreadGenerator());
        t1.start();

        Thread t2 = new Thread(new ThreadPrintCollection());
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        DigCollector dc = new DigCollector();
        System.out.println(dc.getArr().toString());
    }


}
