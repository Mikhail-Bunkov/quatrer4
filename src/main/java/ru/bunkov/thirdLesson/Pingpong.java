package ru.bunkov.thirdLesson;

public class Pingpong {

    public void ping(){
        while (true) {
            synchronized (this) {
                System.out.println("ping");
                try {
                    this.notifyAll();
                    this.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void pong(){
        while (true) {
            synchronized (this) {
                System.out.println("pong");
                try {
                    this.notifyAll();
                    this.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
