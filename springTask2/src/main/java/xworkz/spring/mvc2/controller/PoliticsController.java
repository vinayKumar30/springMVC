package xworkz.spring.mvc2.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class PoliticsController {

	public PoliticsController() {
		System.out.println("created\t"+this.getClass().getSimpleName());
	}
	
	@RequestMapping("/politics.do")
	public String rulling(HttpServletRequest req) {
		System.out.println("invoked rulling");
		String PartyName = req.getParameter("partyname");
		System.out.println(PartyName);
		String Age = req.getParameter("age");
		System.out.println(Age);
		String Status = req.getParameter("Status");
		System.out.println(Status);
		String RullingYear = req.getParameter("pol");
		System.out.println(Status);
	
		req.setAttribute("Age",30);
		return "/Confirmation.jsp";
		
		
	}
}
