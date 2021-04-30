package com.itheima.test;

import com.itheima.java.spi.Robot;
import org.junit.Test;

import java.util.Iterator;
import java.util.ServiceLoader;

public class JavaSPITest {

	@Test
	public void sayHello() throws Exception {
		//1.根据接口的字节码对象，调用SPI机制创建对象
		ServiceLoader<Robot> serviceLoader = ServiceLoader.load(Robot.class);
		System.out.println("Java SPI");
		//2.循环调用每个对象中的sayHello方法
		Iterator<Robot> iterator = serviceLoader.iterator();
		for (Robot robot : serviceLoader) {
			robot.sayHello();
		}


		//serviceLoader.forEach(Robot::sayHello);
	}
}
