package xworkz.spring.mvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class ProtestController {

	public ProtestController() {
		System.out.println("created\t"+this.getClass().getSimpleName());
	}
	@RequestMapping("/protest.do")
	public String onApply(HttpServletRequest req) {
		System.out.println("invoked onApply");
		
		String organisation = req.getParameter("organisation");
		System.out.println(organisation);
		String date = req.getParameter("date");
		System.out.println(date);
		String reason = req.getParameter("reason");
		System.out.println(reason);
		String location = req.getParameter("location");
		System.out.println(location);
	
		req.setAttribute("reason",reason);
		return "/Success.jsp";
		
	}
}
