package com.yuanhui.tutorial.simplerpc.transport;

import com.yuanhui.tutorial.simplerpc.protocol.Peer;

import java.io.InputStream;

/**
 * 1. 创建连接
 * 2. 发送数据，且等待响应
 * 3. 关闭连接
 */
public interface TransportClient {
    void connect(Peer peer);

    InputStream write(InputStream data);

    void close();
}
