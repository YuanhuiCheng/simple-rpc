package com.yuanhui.tutorial.simplerpc.serialization;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class JSONEncoderTest {
    @Test
    public void encode() {
        Encoder encoder = new JSONEncoder();

        TestBean bean = new TestBean();
        bean.setName("dawn");
        bean.setAge(25);

        byte[] bytes = encoder.encode(bean);

        assertNotNull(bytes);
    }
}