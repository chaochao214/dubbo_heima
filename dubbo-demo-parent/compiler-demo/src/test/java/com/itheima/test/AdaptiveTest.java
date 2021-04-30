package com.itheima.test;


import com.itheima.dubbo.Robot;
import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.ExtensionLoader;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AdaptiveTest {



	public static void main(String[] args) {

		//1.获取自适应实现类
		/**
		 * 创建一个动态代理类
		 *      在动态构造的实现中(Javassist技术将字符串，动态转化为java对象)
		 *          根据传入的调用参数
		 *              1、加载真正的实现类
		 *              2、执行实现类的响应方法
		 */
		Robot robot = ExtensionLoader.getExtensionLoader(Robot.class).getAdaptiveExtension();

		//2.构造请求参数（URL对象）
		Map<String, String> map = new HashMap<>();

		map.put("robot","optimusPrime");

		URL url = new URL("dobbo","localhost",8081, map);   // dobbo://localhost:8081?robot=bumblebee

		//调用测试
		robot.sayHello(url);

	}
}
