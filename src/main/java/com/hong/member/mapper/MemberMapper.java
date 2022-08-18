package com.hong.member.mapper;

import com.hong.member.vo.LoginVO;

public interface MemberMapper {

	// 로그인처리
	public LoginVO login(LoginVO invo) throws Exception;
	
	// 아이디 중복 체크
	public String idCheck(String id) throws Exception;
	
}
