package com.spring.mvc1.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class CountryController {

	public CountryController() {
		System.out.println("created\t"+this.getClass().getSimpleName());
	}
	@RequestMapping("/count.do")
	public String participateInOlympic(HttpServletRequest req) {
		String Name = req.getParameter("name");
		System.out.println(Name);
		String Population = req.getParameter("populastion");
		System.out.println(Population);
		String Continent = req.getParameter("cont");
		System.out.println(Continent);
		
		req.setAttribute("Population", Population);
		
		return "/Final.jsp";
		
	}
}
