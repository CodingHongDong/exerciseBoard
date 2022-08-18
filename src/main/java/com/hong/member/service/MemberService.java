package com.hong.member.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.hong.member.mapper.MemberMapper;
import com.hong.member.vo.LoginVO;
import com.hong.member.vo.MemberVO;

@Service
public class MemberService {

	@Inject
	private MemberMapper mapper;	
	
//	// 회원가입
//	public int write(MemberVO vo) throws Exception {
//		return mapper.write(vo);
//	}
	
	
	// 로그인
	public LoginVO login(LoginVO invo) throws Exception{
		return mapper.login(invo);
	}

//	// 아이디 중복 체크
//	public String idCheck(String id) throws Exception{
//		
//		return mapper.idCheck(id);
//	}
	
	
}
