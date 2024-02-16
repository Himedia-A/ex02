package org.zerock.mapper;

import org.apache.ibatis.annotations.Select;

public interface TimeMapper {
	
	@Select("SELECT sysdate FROM dual") //연습용 우리는 XML을 주력으로 쓸 것이다.
	public String getTime();
	
	public String getTime2();
}
