package xworkz.spring.mvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class FirstController {

	
	public FirstController() {
		System.out.println("created\t"+this.getClass().getSimpleName());
	}
	@RequestMapping("/added.do")
	public String onFirst(HttpServletRequest req) {
		System.out.println("invoked onFirst");
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
