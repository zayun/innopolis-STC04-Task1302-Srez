package com.innopolis.smoldyrev.threadsPack;

import com.innopolis.smoldyrev.stockers.DigCollector;

/**
 * Created by smoldyrev on 13.02.17.
 */
public class ThreadPrintCollection implements Runnable {

    @Override
    public void run() {

        try {
            while (!DigCollector.isEnough()) {
                Thread.sleep(5000);
                System.out.println("Добавлено: " + DigCollector.getArr().size() + " чисел");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
