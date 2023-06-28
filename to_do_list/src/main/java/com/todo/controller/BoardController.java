package com.todo.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.todo.service.InterBoardService;

@Controller
@RequestMapping("/todo")
public class BoardController {

	@Autowired
	private InterBoardService service;
	
	@RequestMapping(value="/register")
	public String register(HttpServletRequest request) {
		
		
		return "register";
	}
	
	@RequestMapping(value="/registerMethod", method=RequestMethod.POST)
	public String registerMethod(HttpServletRequest request) {
		
		String userid = request.getParameter("userid");
		String passwd = request.getParameter("passwd");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String mobile = request.getParameter("mobile");
		
		Map<String, String> paraMap = new HashMap<>();
		paraMap.put("userid", userid);
		paraMap.put("passwd", passwd);
		paraMap.put("name", name);
		paraMap.put("email", email);
		paraMap.put("mobile", mobile);
		
		/*
		System.out.println(userid);
		System.out.println(name);
		System.out.println(mobile);
		*/
		
		service.registerMethod(paraMap);
		
		return "test";
	}
	
}
