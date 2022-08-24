package com.hong.member.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.hong.member.mapper.MemberMapper;
import com.hong.member.vo.LoginVO;

@Service
public class MemberServiceImpl implements MemberService {

	@Inject
	private MemberMapper mapper;
	
	// 로그인 처리
	@Override
	public LoginVO login(LoginVO invo) throws Exception {
		
		return mapper.login(invo);
	}

}
