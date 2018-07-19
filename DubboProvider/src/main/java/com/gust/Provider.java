package com.gust;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @ClassName: Provider
 * @Description: TODO
 * @author: gust
 * @date: 2018/7/18
 */
public class Provider {

	public static void main(String[] args) throws IOException {
//		ServiceConfig<DemoService> serviceConfig = new ServiceConfig<>();
//		serviceConfig.setApplication(new ApplicationConfig("first-dubbo-provider"));
//		serviceConfig.setRegistry(new RegistryConfig("zookeeper://localhost:2181"));
//		serviceConfig.setInterface(DemoService.class);
//		serviceConfig.setRef(new DemoServiceImpl());
//		serviceConfig.export();
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		context.start();
		System.in.read();
	}
}
