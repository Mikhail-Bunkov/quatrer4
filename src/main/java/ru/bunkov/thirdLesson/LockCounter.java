package ru.bunkov.thirdLesson;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockCounter {
    private int count =0;
    private Lock lock = new ReentrantLock();
    public void increment(){
        lock.lock();
        count++;
        System.out.println(count + Thread.currentThread().getName());
        lock.unlock();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
