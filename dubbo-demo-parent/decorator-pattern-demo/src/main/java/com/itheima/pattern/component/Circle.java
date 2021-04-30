package com.itheima.pattern.component;

/**
 * 实现类
 *  被增强对象（被装饰）
 */
public class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println("绘制圆形");
	}

}
