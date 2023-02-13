package org.example;

public class MyThread extends Thread{
    public MyThread(ThreadGroup threadGroup, String myThread) {
        super(threadGroup, myThread);
    }

    @Override
    public void run() {
        try {
            while(!isInterrupted()) {
                Thread.sleep(2500);
                System.out.println("Я поток " + Thread.currentThread().getName() + ". Всем привет!");
            }
        } catch (InterruptedException err) {

        } finally{
            System.out.printf("%s завершен\n", getName());
        }
    }
}
