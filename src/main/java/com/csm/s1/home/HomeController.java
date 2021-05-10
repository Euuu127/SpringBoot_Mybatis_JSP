package com.csm.s1.home;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
========================================
jsp project JSP JSP JSP JSP JSP JSP JSP
========================================
**/



@Controller
public class HomeController {
	
	@GetMapping("/")	//model = 데이터를 jsp로 보내줄 때 쓰는거
	public String home(Model model) {
		model.addAttribute("message", "JSP Project");
		return "index";
	}


}
