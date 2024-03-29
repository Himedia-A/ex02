package org.zerock.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.BoardVO;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardMapperTests {
	
	@Setter(onMethod_=@Autowired)// 타입인잭션
	private BoardMapper mapper; // = new
	
	/*
	 * @Test public void testInsert() {
	 * 
	 * BoardVO board = new BoardVO();
	 * 
	 * board.setTitle("새로작성한 글 "); board.setContent("테스트이번엔 성공");
	 * board.setWriter("David");
	 * 
	 * mapper.insert(board); log.info(board); }
	 */
/*	
	@Test
	public void testInsertSelect() {
		
		BoardVO board = new BoardVO();
	
		board.setTitle("새로작성한 글 select ");
		board.setContent("테스트이번엔 성공 select");
		board.setWriter("David--");
		
		mapper.insertSelectKey(board);
		log.info(board);
	}

	@Test 
	public void testRead() {
		 //서버에 존재(입력)된  게시물 번호로 테스트
		BoardVO board = mapper.read(5L);
		
		log.info(board);
	}
		
	@Test
	public void testDelete() {
		log.info("DELETE COUNT: " + mapper.delete(3L));
	}

	
	@Test
	public void testUpdate() {
		BoardVO board = new BoardVO();
		//실행하기전 서버에 입력된 번호인지 확인
		board.setBno(5L);
		board.setTitle("수정한사항");
		board.setContent("테스트 신기하네");
		board.setWriter("Davvvvvid");
		
		int count = mapper.update(board);
		log.info("Update count: " + count);
	}
	
		*/
	
	
}

