package com.yuanhui.tutorial.simplerpc.serialization;

public interface Decoder {
    <T> T decode(byte[] bytes, Class<T> clazz);
}
