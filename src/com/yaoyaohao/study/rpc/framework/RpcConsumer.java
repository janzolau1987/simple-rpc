package com.yaoyaohao.study.rpc.framework;

import com.yaoyaohao.study.rpc.test.HelloService;

public class RpcConsumer {
	public static void main(String[] args) throws Exception{
		HelloService service = RpcFramework.refer(HelloService.class, "172.16.9.64", 1234);
		//
		for(int i = 0;i < Integer.MAX_VALUE; i++) {
			String hello = service.hello("World" + i);
			System.out.println(hello);
			//
			Thread.sleep(1000);
		}
	}
}
