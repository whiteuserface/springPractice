package com.newlecture.web.controller.customer;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/customer/notice")
@Controller
public class NoticeController {
	
	@GetMapping("/list")
	public String list(Model model) {
		
		model.addAttribute("test","Hello Spring!");
		
		return "customer.notice.list";
	}
	
	@GetMapping("/detail")
	public String detail() {
		
		
		return "customer.notice.detail";
	}
}
