package com.itheima.test;

import com.itheima.dubbo.IphoneX;
import com.itheima.dubbo.MusicPhone;
import com.itheima.dubbo.Phone;
import org.apache.dubbo.common.extension.ExtensionLoader;

public class PhoneDemo {

	public static void main(String[] args) {
		ExtensionLoader<Phone> extensionLoader =
				ExtensionLoader.getExtensionLoader(Phone.class);
		Phone phone = extensionLoader.getExtension("iphone");
		phone.call();
	}
}
