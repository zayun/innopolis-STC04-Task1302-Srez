package com.innopolis.smoldyrev.threadsPack;

import com.innopolis.smoldyrev.stockers.DigCollector;

import java.util.Random;

/**
 * Created by smoldyrev on 13.02.17.
 */
public class ThreadGenerator implements Runnable {
    @Override
    public void run() {

        Random r = new Random();

        try {
            while (!DigCollector.isEnough()) {
                Thread.sleep(1000);
                DigCollector.put(r.nextInt(100));
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
