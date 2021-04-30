package com.itheima.dubbo;

//被增强类（被装饰类）
public class IphoneX implements Phone {

	@Override
	public void call() {
		System.out.println("iphone正在拨打电话");
	}
}
