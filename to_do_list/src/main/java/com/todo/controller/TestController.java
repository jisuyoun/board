package com.todo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//@Controller
public class TestController {
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String test() {
		System.out.println("테스트 인덱스 호출");
		return "test";
	}
	
}
