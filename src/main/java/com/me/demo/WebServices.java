package com.me.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebServices {
	@RequestMapping(value = "/")
	public String hello() {
		return "Hello World";
	}
}
