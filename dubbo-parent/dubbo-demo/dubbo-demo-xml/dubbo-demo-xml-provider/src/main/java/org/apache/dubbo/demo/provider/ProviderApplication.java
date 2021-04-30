/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.dubbo.demo.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProviderApplication {
    /**
     * zookeeper注册中心，默认使用dubbo协议，底层借助netty服务
     * 1、服务暴露的入口
     *      -->ServiceBean#onApplicationEvent的方法
     *          -->doExport方法
     *              --doExportUrls方法
     *                  -->doExportUrlsFor1Protocol方法
     * 2、暴露本地服务
     *      -->serviceConfig#exportLocal方法
     * 3、暴露远程服务（invoker）
     *      -->proxyFactory#getProxy方法获取动态代理对象
     *          -->AbstractProxyInvoker
     *              --> 内部具有实现类（DemoServiceImpl）
     *          -->RegistryProtocol#export方法
     *              -->doLocalExport
     * 4、开启netty服务
     *                  -->DubboProtocol#export
     *                      -->openServer()
     *                          --> NettyServer
     * 5、服务注册
     *       register： 服务注册
     *       subscribe：节点订阅
     */
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/dubbo-provider.xml");
        context.start();
        System.in.read();
    }
}
