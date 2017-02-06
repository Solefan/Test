package com.hlju.channel;

/**
 * Created by Sole on 2017/2/6.
 */
public class GateWayTest {

    public static void main(String[] args) {

        MappingFactory gateWay = new GateWayChannelMappingFactory();
        System.out.println(gateWay.getChannelBean().getClass());
        System.out.println("Hello World");

    }

}
