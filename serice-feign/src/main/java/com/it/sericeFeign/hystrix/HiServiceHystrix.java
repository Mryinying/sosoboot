package com.it.sericeFeign.hystrix;

import org.springframework.stereotype.Component;

import com.it.sericeFeign.service.HiServiceImpl;

/**
 * 断路器的配置
 * @author Mryinying
 *
 */
@Component
public class HiServiceHystrix implements HiServiceImpl {

	@Override
	public String sayHiFromClientOne(String name) {
		return "sorry "+name;
	}

}
