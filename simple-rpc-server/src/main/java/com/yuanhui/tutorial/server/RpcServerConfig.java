package com.yuanhui.tutorial.server;

import com.yuanhui.tutorial.simplerpc.serialization.Decoder;
import com.yuanhui.tutorial.simplerpc.serialization.Encoder;
import com.yuanhui.tutorial.simplerpc.serialization.JSONDecoder;
import com.yuanhui.tutorial.simplerpc.serialization.JSONEncoder;
import com.yuanhui.tutorial.simplerpc.transport.HttpTransportServer;
import com.yuanhui.tutorial.simplerpc.transport.TransportServer;
import lombok.Data;

@Data
public class RpcServerConfig {
    private final Class<? extends TransportServer> transportClass = HttpTransportServer.class;
    private final Class<? extends Encoder> encoderClass = JSONEncoder.class;
    private final Class<? extends Decoder> decoderClass = JSONDecoder.class;
    private final int port = 3000;
}
