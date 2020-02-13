package xworkz.spring.mvc2.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class ThirdServlet {

	public ThirdServlet() {
		System.out.println("created\t"+this.getClass().getSimpleName());
	}
	@RequestMapping("/aptitude.do")
	public String writingAptitude(HttpServletRequest req) {
		System.out.println("invoking writingAptitude\t");
		String Message = req.getParameter("message");
		System.out.println(Message);
		String Email = req.getParameter("fathername");
		System.out.println(Email);
		String Password = req.getParameter("password");
		System.out.println(Password);
		String file = req.getParameter("file");
		System.out.println(file);
		return "/index.jsp";
	}
	
}
