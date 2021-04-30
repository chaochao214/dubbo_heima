package com.itheima.dubbo;

import org.apache.dubbo.common.extension.SPI;

@SPI("iphone")
public interface Phone {

	void call();
}
