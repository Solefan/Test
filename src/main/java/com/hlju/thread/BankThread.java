package com.hlju.thread;

/**
 * Created by Sole on 2017/2/6.
 */
public class BankThread {

    public static void main(String[] args) {
        Customer c = new Customer();

        Thread t1 = new Thread(c);
        Thread t2 = new Thread(c);

        t1.start();
        t2.start();
    }

}


class Bank {

    public int sum = 0;

    public void add(int num) {
        sum += num;
        System.out.println(Thread.currentThread().getName() + "...sum=" + sum);
    }

}

class Customer implements Runnable {

    Bank b = new Bank();

    @Override
    public synchronized void run() {
        for (int i = 0; i < 3; i++) {
            b.add(100);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
