package com.hlju.channel;


/**
 * Created by Sole on 2017/2/6.
 */
public class GateWayChannel {

    private String name;
    private int age;

    public GateWayChannel() {

    }

    public GateWayChannel(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
