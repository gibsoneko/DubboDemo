package com.gust.dubbo.provider;

import com.gust.gate.DemoService;

/**
 * @ClassName: DemoServiceImpl
 * @Description: TODO
 * @author: gust
 * @date: 2018/7/18
 */
public class DemoServiceImpl implements DemoService {

	@Override
	public String sayHello(String name) {
		return "Hello " + name;
	}
}
