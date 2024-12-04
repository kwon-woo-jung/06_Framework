package edu.kh.todo.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.kh.todo.model.dto.Todo;
import edu.kh.todo.model.service.TodoService;
import lombok.extern.slf4j.Slf4j;

@Slf4j // 로그 객체 자동 생성 
@Controller // 요청/응답 제어 역할 명시 + Bean 등록
public class MainController {
		// @Controller: 이 클래스가 Spring MVC의 컨트롤러 역할을 한다는 것을 명시
		// 이 클라이언트의 요청을 받고, 뷰(View)에 데이터를 전달하거나 다른 처리를 담당
		
		//@slf4j
		// Lombok 어노테이션으로, 자동 log 객체를 생성.
		// log.debug() 등을 사용해 디버그 로그를 쉽게 기록할 수 있음.
	
	
	@Autowired // 등록된 Bean 중 같은 타입이거나 상속관계 DI (의존성 주입)
	private TodoService service;
	// Spring의 의존성 주입(DI) 어노테이션.
	// TodoService 타입의 Bean을 자동으로 주입.
	// TodoService는 인터페이스로, 실제 구현체인 TodoServiceImpl이 주입됨.
	
	
	@RequestMapping("/")
	public String mainPage(Model model) {
		
		// Model : Spring에서 제공하는 객체로, 컨트롤러렝서 뷰로 데이터를 전달하는 데 사용.
		// model.addAttribute("key", value)로 데이터를 추가하면, 뷰에서 해당 데이터를 사용할 수 있음.
		
		
		log.debug("service : " + service);
		// edu.kh.todo.model.service.TodoServiceImpl@7aeb84e6
		
		// todoNo 가 1인 todo의 제목 조회하여 request scope에 추가
		String testTitle = service.testTitle(); // 크리에이트 메서드 (create method)
		
//		TodoService의 testTitle() 메서드를 호출하여 todoNo가 1인 항목의 제목을 조회.
		
		model.addAttribute("testTitle", testTitle);
//		조화된 제목(testTitle)을 Model 객체에 추가하여, 뷰에서 사용 가능하게 만듦.
		
		// --------------------------------------------------------------
		
		// TB_TODO 테이블에 저장된 전체 할 일 목록 조회하기
		// + 완료된 할 일 갯수
		
		
		// Service 메서드 호출 후 결과 반환 받기
		Map<String, Object> map = service.selectAll();
		
		// map에 담김 내용 추출
		List<Todo> todoList = (List<Todo>)map.get("todoList");
		int completeCount = (int)map.get("completeCount");
		
		
		
		
		
		
		// Model을 이용해서 조회 결과 request scope에 추가
		model.addAttribute("todoList", todoList);
		model.addAttribute("completeCount", completeCount);
		
		// 접두사 : classpath:/templates/
		// 접미사 : .html
		return "common/main"; // forward
		
		
		// Controller -> Service -> ServiceImpl -> DAO -> *Mapper* -> m.xml
		
		
	}
}




















