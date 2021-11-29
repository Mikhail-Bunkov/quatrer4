package ru.bunkov.thirdLesson;

public class Main {
    public static void main(String[] args) {
        LockCounter locker = new LockCounter();
        new Thread(()->
        {
            for (int i = 0; i < 5; i++) {
                locker.increment();
            }
        }
        ).start();

        new Thread(()->
        {
            for (int i = 0; i < 5; i++) {
                locker.increment();
            }
        }
        ).start();

        Pingpong p1 = new Pingpong();
        new Thread(
               p1::ping
               ).start();
        new Thread(
                p1::pong
                ).start();
    }
}
