package com.spring.cloud.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class HelloService {
	
	    RestTemplate restTemplate;
	    
	   
	    public HelloService(RestTemplate restTemplate) {
			this.restTemplate = restTemplate;
		}

	    @HystrixCommand(fallbackMethod = "hiError")
		public String hiService(String name) {
	        return restTemplate.getForObject("http://service-hi/hi?name="+name,String.class);
	    }
	    
	    public String hiError(String name) {
	        return "hi,"+name+",sorry,error!";
	    }

}
