package com.it.sericeFeign.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.it.sericeFeign.hystrix.HiServiceHystrix;

@FeignClient(value = "service-hi",fallback = HiServiceHystrix.class)//fallback配置断路器
public interface HiServiceImpl {
	
	@RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);

}
