package com.hong.member.service;

import com.hong.member.vo.LoginVO;

public interface MemberService {

//	// 회원가입
//	public int write(MemberVO vo) throws Exception {
//		return mapper.write(vo);
//	}
	
	
	// 로그인
	public LoginVO login(LoginVO invo) throws Exception;


//	// 아이디 중복 체크
//	public String idCheck(String id) throws Exception{
//		
//		return mapper.idCheck(id);
//	}
	
	
}
