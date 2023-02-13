package org.example;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Создаю потоки...");
        ThreadGroup threadGroup = new ThreadGroup("MyThreadGroup");
        MyThread myThread = new MyThread(threadGroup, "MyThread");
        MyThread myThread2 = new MyThread(threadGroup, "MyThread2");
        MyThread myThread3 = new MyThread(threadGroup, "MyThread3");
        MyThread myThread4 = new MyThread(threadGroup, "MyThread4");
        myThread.start();
        myThread2.start();
        myThread3.start();
        myThread4.start();
        Thread.sleep(15000);
        threadGroup.interrupt();
        System.out.println("Завершаю все потоки...");
    }
}