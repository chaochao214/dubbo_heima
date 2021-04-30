package com.itheima.test;

import com.itheima.dubbo.spi.Robot;
import org.apache.dubbo.common.extension.ExtensionLoader;
import org.junit.Test;

public class DubboSPITest {

	//测试dubbo spi机制
	@Test
	public void sayHello() throws Exception {
		//1、创建ExtensionLoader
		ExtensionLoader<Robot> extensionLoader =
				ExtensionLoader.getExtensionLoader(Robot.class);
		//2、根据key获取实现类
//		Robot optimusPrime = extensionLoader.getExtension("optimusPrime");
//		optimusPrime.sayHello();

		Robot bumblebee = extensionLoader.getExtension("bumblebee");
		bumblebee.sayHello();

		//获取默认实现
//		Robot robot = extensionLoader.getDefaultExtension();
//		robot.sayHello();
	}
}
