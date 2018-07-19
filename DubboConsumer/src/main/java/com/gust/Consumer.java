package com.gust;

import com.gust.gate.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName: Consumer
 * @Description: TODO
 * @author: gust
 * @date: 2018/7/18
 */
public class Consumer {

	public static void main(String[] args) {
//		ReferenceConfig<DemoService> referenceConfig = new ReferenceConfig<>();
//		referenceConfig.setApplication(new ApplicationConfig("first-dubbo-consumer"));
//		referenceConfig.setRegistry(new RegistryConfig("zookeeper://localhost:2181"));
//		referenceConfig.setInterface(DemoService.class);
//		DemoService greetingService = referenceConfig.get();

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		context.start();

		DemoService demoService = (DemoService)context.getBean("demoService");
		System.out.println(demoService.sayHello("world"));
	}
}
