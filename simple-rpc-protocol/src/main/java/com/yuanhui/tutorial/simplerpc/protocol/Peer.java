package com.yuanhui.tutorial.simplerpc.protocol;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 网络传输的一个端口
 */
@Data
@AllArgsConstructor
public class Peer {
    private String host;
    private int port;
}
