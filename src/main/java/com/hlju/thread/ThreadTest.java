package com.hlju.thread;

/**
 * Created by Sole on 2017/2/6.
 */
public class ThreadTest {

    public static void main(String[] args) {
        Ticket t = new Ticket();

        Thread t1 = new Thread(t);
        Thread t2 = new Thread(t);
        Thread t3 = new Thread(t);
        Thread t4 = new Thread(t);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}

class Ticket implements Runnable{
    private int num = 100;
    Object obj = new Object();
    @Override
    public void run() {
        while(true){
            synchronized (obj) {
                if(num>0){
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+"...sale"+num--);
                }else{
                    break;
                }
            }

        }
    }
}
