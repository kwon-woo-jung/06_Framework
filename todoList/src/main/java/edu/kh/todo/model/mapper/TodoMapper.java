package edu.kh.todo.model.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import edu.kh.todo.model.dto.Todo;


/*
 * @Mapper
 * - MyBatis 제공 어노테이션
 * 
 * - MyBatis가 해당 인터페이스를 DAO로 인식하여 SQL 매핑을 처리
 * -> DAO : @Mapper 가 선언된 인터페이스는 MyBais에서 SQL 매핑과 데이터베이스 작업을 처리하는
 * 			DAO 역할을 합니다
 * 
 * - 해당 어노테이션이 작성된 인터페이스는
 * 	 namespace에 해당 인터페이스가 작성된
 * 	 mapper.xml 파일과 연결되어 SQL 호출/수행/결과 반환 가능
 * 
 * - Mybatis에서 제공하는 Mapper 상속 객체가 Bean으로 등록됨
 * -> 인터페이스와 동일한 네임스페이스를 가진 mapper.xml 파일과 연결됩니다.
 * -> XML 파일에 정의된 SQL 문을 호출하여 실행합니다.
 * 
 * - @Mapper 를 사용할 때 @Repository 는 필요하지 않음.
 * 		->	Mybatis가 DAO 객체로 Mapper 인터페이스를 관리하기 때문.
 * 
 * 	SQL 매핑 처리:
 * 	XML 또는 애노테이션 기반으로 SQL을 정의하고 실행할 수 있습니다.
 * 
 * 
 * 
 * 
 * 1. 인터페이스에 @Mapper를 선언합니다.
 * 2. 인터페이스와 동일한 네임스페이스를 가진 XML 파일을 작성합니다.
 * 3. 스프링 부트 애플리케이션에서는 @MapperScan으로 매퍼 패키지를 스캔합니다.
 * 
 * 
 *
 * */


/**
 * 
 */
/**
 * 
 */
@Mapper
public interface TodoMapper {
	
	// @Mapper라는 어노테이션이 붙어있는 interface를 내부적으로 상속받는 객체는 마이바티스 객체
	
	/* Mapper의 메서드명 == mapper.xml 파일 내 태그의 id
	 * 
	 * (메서드명과 id가 같은 태그가 서로 연결된다)
	 * 
	 * */
	
	
	/** (TEST) todoNo가 1인 할 일 제목 조회
	 * @return
	 * */
	String testTitle(); // 추상 메서드
	
	/** 할일 목록 조회
	 * @return todoList
	 */
	List<Todo> selectAll();
	
	/** 완료된 할 일 개수 조회
	 * @return completeCount
	 */
	int getCompleteCount();

	/** 할 일 추가
	 * @param todo
	 * @return result
	 */
	int addTodo(Todo todo);
	
	/** 할 일 상세 조회
	 * @param todoNo
	 * @return
	 */
	Todo todoDetail(int todoNo);
	
	/** 완료 여부 변경
	 * @param todo
	 * @return result
	 */
	int changeComplete(Todo todo);

	
	/** 할 일 삭제
	 * @param todoNo
	 * @return result
	 */
	int todoDelete(int todoNo);
	
	
	/** 할 일 수정
	 * @param todo
	 * @return result
	 */
	int todoUpdate(Todo todo);
	
	
	/** 전체 할 일 개수 조회
	 * @return totalCount
	 */
	int getTotalCount();
	
	
	/** 할 일 목록 조회
	 * @return totalCount
	 */
	
	List<Todo> selectList();
	
	
}











