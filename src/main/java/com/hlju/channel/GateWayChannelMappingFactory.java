package com.hlju.channel;

/**
 * Created by Sole on 2017/2/6.
 */
public class GateWayChannelMappingFactory implements MappingFactory<GateWayChannel> {

    @Override
    public GateWayChannel getChannelBean() {
        return new GateWayChannel("John", 20);
    }
}
