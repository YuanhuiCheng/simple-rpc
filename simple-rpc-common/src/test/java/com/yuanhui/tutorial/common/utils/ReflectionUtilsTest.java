package com.yuanhui.tutorial.common.utils;

import org.junit.Test;

import java.lang.reflect.Method;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ReflectionUtilsTest {
    @Test
    public void newInstance() {
        TestClass t = ReflectionUtils.newInstance(TestClass.class);
        assertNotNull(t);
    }

    @Test
    public void getPubicMethods() {
        Method[] methods = ReflectionUtils.getPubicMethods(TestClass.class);
        assertEquals(1, methods.length);

        String methodName = methods[0].getName();
        assertEquals("b", methodName);
    }

    @Test
    public void invoke() {
        Method[] methods = ReflectionUtils.getPubicMethods(TestClass.class);
        Method b = methods[0];

        TestClass t = new TestClass();
        Object r = ReflectionUtils.invoke(t, b);

        assertEquals("b", r);
    }
}