1、定义接口，并且在接口上配置@SPI注解
2、定义接口的实现类
3、在META-INF/dubbo路径下，创建一个配置文件，文件名称：接口全路径
4、定义配置信息
    key（自定义名称）=value（实现类的全类名）
5、通过ExtensionLoader

定义默认实现类