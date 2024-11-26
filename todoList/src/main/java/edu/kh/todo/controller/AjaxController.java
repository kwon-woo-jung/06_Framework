package edu.kh.todo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequestMapping("ajax")
@Controller // 요청/응답 제어하는 역할 명시 + Bean 등록
public class AjaxController {
	
	@GetMapping("main") // 	/ajax/main GET 요청 매핑
	public String ajaxMain() {
		// 접두사 : classpath:/templates/
		// 접미사 : .html
		return "ajax/main";
	}
}