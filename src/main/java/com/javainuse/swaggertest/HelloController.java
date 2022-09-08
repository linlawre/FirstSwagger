package com.javainuse.swaggertest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping(method = RequestMethod.GET, value = "/helloSwagger")
	public String sayHello() {
		return "Swagger Hello World";
	}


	@RequestMapping(method = RequestMethod.GET, value = "/helloSwagger2")
	public String sayHello2() {
		return "Swagger Hello World 2";
	}
}
