package com.spring.cloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@FeignClient(value = "service-hi")
public interface Feign {

	@RequestMapping(value = "/hi", method = RequestMethod.GET)
	public String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
