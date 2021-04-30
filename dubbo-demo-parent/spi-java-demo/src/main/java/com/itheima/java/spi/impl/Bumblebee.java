package com.itheima.java.spi.impl;

import com.itheima.java.spi.Robot;

public class Bumblebee implements Robot {

	@Override
	public void sayHello() {
		System.out.println("Hello, I am Bumblebee.");
	}
}