package com.hlju.generic;

/**
 * Created by Sole on 17/2/4.
 */
public class Box<T> {

    private T data;

    public Box() {

    }

    public Box(T data) {
        this.data = data;
    }

    public T getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public <E> String getE(E e) {
        return "Hello World";
    }
}
