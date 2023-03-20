package com.home.mycafe;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyCafeController {
	
	@RequestMapping("/cafe")
	public String showWelcomePage(Model model) {
		
		String titleOfThePage = "Welcome to Mom's Cafe";
		model.addAttribute("titleOfThePage",titleOfThePage);
		return "welcome-page";
	}
	
	@RequestMapping("/processOrder")
	public String showOrderProcess(HttpServletRequest request,Model model) {
		
		String titleOfThePage = "Order Accepted";
		String valString =request.getParameter("foodtype");
		model.addAttribute("OrderConfirmation",titleOfThePage);
		model.addAttribute("userValue",valString);
		return "process-order";
	}

}
