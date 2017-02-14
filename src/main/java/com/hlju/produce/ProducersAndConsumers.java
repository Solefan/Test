package com.hlju.produce;

/**
 * Created by Sole on 2017/2/7.
 */
public class ProducersAndConsumers {

    public static void main(String[] args) {
        Storage storage = new Storage();

        Thread consumers = new Thread(new Consumers(storage));
        Thread producers = new Thread(new Producers(storage));
        consumers.start();
        producers.start();
    }

}

//消费者
class Consumers implements Runnable {

    private Storage storage;

    public Consumers(Storage storage) {
        this.storage = storage;
    }

    @Override
    public void run() {
        while (true) {
            storage.pop();
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}

//生产者
class Producers implements Runnable {

    private Storage storage;

    public Producers(Storage storage) {
        this.storage = storage;
    }

    @Override
    public void run() {
        while (true) {
            Product product = new Product("馒头");
            storage.push(product);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}

//仓库
class Storage {

    public Product[] products = new Product[10];

    public int num = 0;         //仓库容量

    public synchronized void push(Product product) {
        while (num == products.length) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.notifyAll();
        products[num++] = product;
        System.out.println(Thread.currentThread().getName() + "--生产了产品：" + product + " 剩余馒头：" + num);
    }

    public synchronized Product pop() {
        while (num == 0) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.notifyAll();
        Product product = products[--num];
        System.out.println(Thread.currentThread().getName() + "--消费了产品：" + product);
        return product;
    }

}

//产品
class Product {

    private String name;

    public Product(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                '}';
    }
}