package com.itheima.test;

import com.itheima.pattern.component.Circle;
import com.itheima.pattern.decorator.RedShapeDecorator;

public class DecoratorDemo {

	public static void main(String[] args) {
		//被装饰对象
		Circle circle = new Circle();
		//创建装饰者对象
		RedShapeDecorator rd = new RedShapeDecorator(circle);
		//调用方法
		rd.draw();
	}
}
