package com.yuanhui.tutorial.simplerpc.serialization;

public interface Encoder {
    byte[] encode(Object obj);
}
