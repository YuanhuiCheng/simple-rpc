package com.yuanhui.tutorial.simplerpc.serialization;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JSONDecoderTest {
    @Test
    public void decode() {
        Encoder encoder = new JSONEncoder();

        TestBean bean = new TestBean();
        bean.setName("dawn");
        bean.setAge(25);

        byte[] bytes = encoder.encode(bean);

        Decoder decoder = new JSONDecoder();
        TestBean decodedBean = decoder.decode(bytes, TestBean.class);

        assertEquals(bean.getName(), decodedBean.getName());
        assertEquals(bean.getAge(), decodedBean.getAge());
    }
}