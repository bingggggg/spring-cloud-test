package com.spring.cloud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {
	
	    RestTemplate restTemplate;
	    

	    public HelloService(RestTemplate restTemplate) {
			this.restTemplate = restTemplate;
		}


		public String hiService(String name) {
	        return restTemplate.getForObject("http://service-hi/hi?name="+name,String.class);
	    }

}
