package com.itheima.dubbo.impl;

import com.itheima.dubbo.Robot;
import org.apache.dubbo.common.URL;
import org.apache.dubbo.rpc.Protocol;

public class Bumblebee implements Robot {


	@Override
	public void sayHello(URL url) {
		System.out.println("Hello, I am Bumblebee.");
	}
}