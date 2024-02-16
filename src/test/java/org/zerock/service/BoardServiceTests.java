package org.zerock.service;



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
public class BoardServiceTests {

	@Setter(onMethod_ = {@Autowired})
	private BoardService service;

/*	
	@Test
	public void testExist() {
		log.info(service);
		assertNotNull(service);
	}
	
	@Test
	public void testRegister() {
		
		BoardVO board = new BoardVO();
		board.setTitle("새로작성하는글");
		board.setContent("새로작성하는내용");
		board.setWriter("David~~~");
		
		service.register(board);
		
		log.info("생성된 게시물의 번호" + board.getBno());
	}
	
	
	@Test
	public void testGetList() {
		service.getList().forEach(board -> log.info(board));
	}

	
	@Test
	public void testGet() {
		log.info(service.get(1L));
	}
		*/
	
	@Test
	 public void testDelete() {
		log.info("Remove Result: " + service.remove(2L));
	}
	
	@Test
	 public void testUpdate() {
		BoardVO board = service.get(1L);
		
		if(board == null) {
			return;
		}
		
		board.setTitle("제목 수정합니다.");
		log.info("Modify result:" + service.modify(board));
	}
}
