package com.yuanhui.tutorial.server;

import com.yuanhui.tutorial.common.utils.ReflectionUtils;
import com.yuanhui.tutorial.simplerpc.protocol.Request;

/**
 * 调用具体服务
 */
public class ServiceInvoker {
    public Object invoke(ServiceInstance service, Request request) {
        return ReflectionUtils.invoke(service.getTarget(),
                service.getMethod(),
                request.getParameters());
    }
}
