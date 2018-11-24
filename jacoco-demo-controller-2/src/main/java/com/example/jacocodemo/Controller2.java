package com.example.jacocodemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller2 {

	@RequestMapping("/hello2")
	public String helloFrom2() {
		return "hello from 2";
	}
}
