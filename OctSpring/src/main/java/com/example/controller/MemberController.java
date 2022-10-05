package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.command.Member;

@Controller
public class MemberController {

	@GetMapping("/memberform")
	public String form() {
		return "mem/memberform";
	}
	
	@PostMapping("/membersubmit")
	public String submit(Member m) {
		return "mem/member";
	}
	
}
