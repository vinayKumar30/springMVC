package com.spring.mvc1.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;


@Component
@RequestMapping("/")
public class SecondController {


	public SecondController() {
		System.out.println("created\t"+this.getClass().getSimpleName());
	}
	@RequestMapping("/first.do")
	public String onSecond(HttpServletRequest req) {
		System.out.println("invoked onSecond");
		String Message = req.getParameter("message");
		System.out.println(Message);
		String Email = req.getParameter("email");
		System.out.println(Email);
		String Password = req.getParameter("password");
		System.out.println(Password);
		String file = req.getParameter("file");
		System.out.println(file);
		return "/index.jsp";

	}
}
