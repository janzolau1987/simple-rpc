package com.yaoyaohao.study.rpc.framework;

import com.yaoyaohao.study.rpc.test.HelloService;
import com.yaoyaohao.study.rpc.test.HelloServiceImpl;

public class RpcProvider {
	public static void main(String[] args) throws Exception {
		HelloService service = new HelloServiceImpl();
		//
		RpcFramework.export(service, 1234);
	}
}
