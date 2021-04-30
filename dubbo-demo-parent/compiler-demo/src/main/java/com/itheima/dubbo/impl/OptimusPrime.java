package com.itheima.dubbo.impl;


import com.itheima.dubbo.Robot;
import org.apache.dubbo.common.URL;

public class OptimusPrime implements Robot {


	public void sayHello(URL url) {
		System.out.println("Hello, I am Optimus Prime.");
	}
}