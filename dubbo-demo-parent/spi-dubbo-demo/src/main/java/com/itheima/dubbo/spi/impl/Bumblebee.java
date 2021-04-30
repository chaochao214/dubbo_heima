package com.itheima.dubbo.spi.impl;

import com.itheima.dubbo.spi.Robot;
import org.apache.dubbo.rpc.Protocol;

public class Bumblebee implements Robot {

	private Protocol protocol;

	public void setProtocol(Protocol protocol) {
		this.protocol = protocol;
	}

	@Override
	public void sayHello() {
		System.out.println(protocol);
		System.out.println("Hello, I am Bumblebee.");
	}
}