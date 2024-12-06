package edu.kh.todo.model.service;

import java.util.List;
import java.util.Map;

import edu.kh.todo.model.dto.Todo;

public interface TodoService {

	/** (TEST) todoNo 가 1인 할 일 제목 조회
	 * @return title
	 */
	String testTitle(); // 크리에이트 메서드
	
	/** 할일 목록 + 완료된 할 일 갯수 조회
	 * @return map
	 * */
	
	Map<String, Object> selectAll();
	
	/** 할 일 추가
	 * @param todoTtitle
	 * @param todoContent
	 * @return result
	 * */
	int addTodo(String todoTitle, String todoDetail);
	
	
	/** 할 일 상세조회
	 * @param todoNo
	 * @return todo
	 */
	Todo todoDetail(int todoNo);
	
	/** 완료 여부 변경
	 * @param todo
	 * @return result
	*/
	int changeComplete(Todo todo);
	
	
	
	/** 전체 할 일 개수 조회
	 * @return totalCount
	 */
	int getTotalCount();
	
	
	/** 완료된 할 일 개수 조회
	 * @return
	 */
	int getCompleteCount();
	
	
	/** 할 일 수정
	 * @param
	 * @return result
	 * */
	int todoUpdate(Todo todo);

	/** 할 일 목록 조회
	 * @return
	 */
	List<Todo> selectList();

	
	
	int todoDelete(int todoNo);
	
	
}














