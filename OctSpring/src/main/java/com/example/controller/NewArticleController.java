package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.command.NewArticleCommand;
import com.example.service.ArticleService;

@Controller
@RequestMapping("/article/newArticle") // 공통의 부분은 클래스에 request로 매핑
public class NewArticleController {

		@Autowired
		private ArticleService articleService;
		
		@GetMapping //get방식으로 들어온다면 form메서드실행
		public String form() {
			return "article/newArticleForm";
		}
		
		@PostMapping //post방식으로 들어온다면 submit메서드 실행
		public String submit(@ModelAttribute("command") NewArticleCommand command) {
			//ModelAttribute("command")는 model에 command라는 이름으로 객체를 저장 
			articleService.writeArticle(command);
			return "article/newArticleSubmit";
		}
		/*mapping annotation들은 
		 * 1.DS가 매개변수의 객체 생성 후 전달 
		 * 2.PostMapping이 파라미터로 전달 받은 값을 이름이 같은 객체의 변수에 저장
		   3.파라미터가 저장된 값을 모델에 추가 ->ModelAttribute("이름")으로 이름을 지정
		     - 이름이 없다면 객체의 타입을 모델이름으로 지정(앞글자는 소문자로) ex)newArticleCommand
		*/ 
		
		public void setArticleService(ArticleService articleService) {
			this.articleService=articleService;
		}
}
