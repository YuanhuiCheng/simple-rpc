package com.yuanhui.tutorial.simplerpc.client;

import com.yuanhui.tutorial.simplerpc.protocol.Peer;
import com.yuanhui.tutorial.simplerpc.serialization.Decoder;
import com.yuanhui.tutorial.simplerpc.serialization.Encoder;
import com.yuanhui.tutorial.simplerpc.serialization.JSONDecoder;
import com.yuanhui.tutorial.simplerpc.serialization.JSONEncoder;
import com.yuanhui.tutorial.simplerpc.transport.HTTPTransportClient;
import com.yuanhui.tutorial.simplerpc.transport.TransportClient;
import lombok.Data;

import java.util.Arrays;
import java.util.List;

@Data
public class RpcClientConfig {
    private Class<? extends TransportClient> transportClass = HTTPTransportClient.class;
    private Class<? extends Encoder> encoderClass = JSONEncoder.class;
    private Class<? extends Decoder> decoderClass = JSONDecoder.class;
    private Class<? extends TransportSelector> selectorClass = RandomTransportSelector.class;
    private int connectCount = 1;
    private List<Peer> servers = Arrays.asList(
            new Peer("127.0.0.1", 3000)
    );
}
