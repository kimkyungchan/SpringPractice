package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
	
	
	//해당 문자열로 요청이오면 아래 메서드를 실행해라 + handlermapping에 해당 요청uri와 컨트롤러를 매핑
	@GetMapping("/hello") 
	public String hello(Model m) {
		m.addAttribute("hello","hello, spring"); //view에 전달되는 데이터(model, 결과값)
		return "hello"; 
		//요청 처리 메서드의 return값이 string이면 return값은 view정보 -> view resolve로 이동
	}
}
