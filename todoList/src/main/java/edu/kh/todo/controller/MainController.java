package edu.kh.todo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Slf4j // 로그 객체 자동 생성
@Controller // 요청/응답 제어 역할 명시 + Bean 등록
public class MainController {

	@RequestMapping("/")
	public String mainPage() {
		
		// 접두사 : classpath:/templates
		// 접미사 : .html
		return "common/main";
	}
}