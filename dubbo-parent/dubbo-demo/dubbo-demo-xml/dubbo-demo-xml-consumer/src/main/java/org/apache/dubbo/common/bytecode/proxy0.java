package org.apache.dubbo.common.bytecode;


import com.alibaba.dubbo.rpc.service.EchoService;
import org.apache.dubbo.demo.DemoService;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.List;

public class proxy0 implements ClassGenerator.DC, EchoService, DemoService {
	// 方法数组
	public static Method[] methods;
	private InvocationHandler handler;

	public proxy0(InvocationHandler invocationHandler) {
		this.handler = invocationHandler;
	}

	public proxy0() {
	}

	public String sayHello(String string) {
		// 将参数存储到 Object 数组中
		Object[] arrobject = new Object[]{string};
		// 调用 InvocationHandler 实现类的 invoke 方法得到调用结果
		try {
			Object object = this.handler.invoke(this, methods[0], arrobject);
			return (String) object;
		} catch (Throwable throwable) {
			throw new RuntimeException(throwable);
		}
		// 返回调用结果
	}

	/** 回声测试方法 */
	public Object $echo(Object object) {
		Object[] arrobject = new Object[]{object};
		try {
			Object object2 = this.handler.invoke(this, methods[1], arrobject);
			return object2;
		} catch (Throwable throwable) {
			throw new RuntimeException(throwable);
		}
	}
}