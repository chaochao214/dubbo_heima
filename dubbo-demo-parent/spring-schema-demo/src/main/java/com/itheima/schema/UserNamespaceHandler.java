package com.itheima.schema;


import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

public class UserNamespaceHandler extends NamespaceHandlerSupport {
	public void init() {
		registerBeanDefinitionParser("user", new UserBeanDefinitionParser());
	}
}