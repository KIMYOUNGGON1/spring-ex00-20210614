package org.zerock.mapper;

import org.zerock.domain.MemberVO;

public interface MemberMapper {
	
	public int insert(MemberVO vo);
	
	public int insertAuth(MemberVO vo);
}
