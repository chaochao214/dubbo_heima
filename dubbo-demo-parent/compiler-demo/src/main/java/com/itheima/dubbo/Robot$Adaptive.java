package com.itheima.dubbo;

import org.apache.dubbo.common.extension.ExtensionLoader;
public class Robot$Adaptive implements com.itheima.dubbo.Robot {

	public void sayHello(org.apache.dubbo.common.URL arg0)  {
		if (arg0 == null) throw new IllegalArgumentException("url == null");
		org.apache.dubbo.common.URL url = arg0;
		String extName = url.getParameter("robot");
		if(extName == null) throw new IllegalStateException("Failed to get extension (com.itheima.dubbo.Robot) name from url (" + url.toString() + ") use keys([robot])");
		com.itheima.dubbo.Robot extension = (com.itheima.dubbo.Robot)ExtensionLoader.getExtensionLoader(com.itheima.dubbo.Robot.class).getExtension(extName);
		extension.sayHello(arg0);
	}

}
