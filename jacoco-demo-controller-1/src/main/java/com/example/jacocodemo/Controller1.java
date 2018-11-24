package com.example.jacocodemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller1 {

	@RequestMapping("/hello1")
	public String helloFrom1() {
		return "hello from 1";
	}
}
