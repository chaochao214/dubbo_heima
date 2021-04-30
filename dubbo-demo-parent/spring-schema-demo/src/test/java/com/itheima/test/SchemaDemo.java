package com.itheima.test;

import com.itheima.schema.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SchemaDemo {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("/spring/applicationContext.xml");
		User user = (User)ctx.getBean("user");
		System.out.println(user);
	}
}
