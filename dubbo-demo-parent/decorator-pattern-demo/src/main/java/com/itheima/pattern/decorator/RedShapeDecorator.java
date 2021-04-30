package com.itheima.pattern.decorator;

import com.itheima.pattern.component.Shape;


/**
 * 装饰者
 *  对Circle增强
 *      1、执行增强逻辑
 *      2、执行被装饰者对象的方法
 *   前提条件，调用时，装饰者中需要持有被装饰者对象
 *   构造方法：
 *      赋值
 */
public class RedShapeDecorator implements Shape {

	private Shape shape;

	public RedShapeDecorator(Shape shape) {
		this.shape = shape;
	}

	private void setRedBorder(){
		System.out.println("红色，粗体");
	}

	public void draw(){
		//增强逻辑
		setRedBorder();
		//调用被装饰者内部方法，完成业务
		shape.draw();
	}
}
