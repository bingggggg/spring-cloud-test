package com.spring.cloud.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.cloud.service.HelloService;
@RestController
public class HelloController {

	 @Autowired
	    HelloService helloService;
	    @RequestMapping(value = "/hi")
	    public String hi(@RequestParam String name){
	    	System.out.println("sssssssssssss/////////////");
	        return helloService.hiService(name);
	    }
}
