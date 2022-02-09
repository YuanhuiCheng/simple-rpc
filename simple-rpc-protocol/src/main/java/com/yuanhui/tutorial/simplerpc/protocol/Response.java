package com.yuanhui.tutorial.simplerpc.protocol;

import lombok.Data;

/**
 * RPC的返回
 */
@Data
public class Response {
    // 0 -> success; 1 -> failure
    private int code = 0;
    private String message = "";
    private Object data;
}
