package com.home.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/sis")
public class SisController 
{

	@RequestMapping("/makeupkit")
	//@ResponseBody
	public String getMakeUp() {
		//return "here is your makeup kit";
		//return "/WEB-INF/view/LakmeMakeupKit.jsp";
		return "LakmeMakeupKit";
	}
}
