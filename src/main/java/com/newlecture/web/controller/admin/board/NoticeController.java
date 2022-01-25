package com.newlecture.web.controller.admin.board;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/admin/board/notice")
@Controller("adminNoticeController")
public class NoticeController {
	
	@GetMapping("/list")
	public String list() {
		
		
		return "admin.board.notice.list";
	}
	
	@GetMapping("/detail")
	public String detail() {
		
		
		return "admin.board.notice.detail";
	}
	
	@GetMapping("/reg")
	public String reg() {
		
		
		return "admin.board.notice.reg";
	}
}
