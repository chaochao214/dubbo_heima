package com.itheima.dubbo.spi;

import org.apache.dubbo.common.extension.SPI;

@SPI("optimusPrime")
public interface Robot {
	void sayHello();
}
