package com.yuanhui.tutorial.example;

import com.yuanhui.tutorial.simplerpc.client.RpcClient;

public class Client {
    public static void main(String[] args) {
        RpcClient client = new RpcClient();
        CalcService service = client.getProxy(CalcService.class);

        int r1 = service.add(1, 2);
        int r2 = service.subtract(10, 8);

        System.out.println(r1);
        System.out.println(r2);
    }
}
