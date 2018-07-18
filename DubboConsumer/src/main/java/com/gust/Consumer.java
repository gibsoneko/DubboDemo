package com.gust;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ReferenceConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.gust.gate.DemoService;

/**
 * @ClassName: Consumer
 * @Description: TODO
 * @author: gust
 * @date: 2018/7/18
 */
public class Consumer {

	public static void main(String[] args) {
		ReferenceConfig<DemoService> referenceConfig = new ReferenceConfig<>();
		referenceConfig.setApplication(new ApplicationConfig("first-dubbo-consumer"));
		referenceConfig.setRegistry(new RegistryConfig("zookeeper://localhost:2181"));
		referenceConfig.setInterface(DemoService.class);
		DemoService greetingService = referenceConfig.get();
		System.out.println(greetingService.sayHello("world"));
	}
}
