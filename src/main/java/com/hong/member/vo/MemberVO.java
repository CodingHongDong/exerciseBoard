package com.hong.member.vo;

import java.util.Date;

import lombok.Data;

@Data
public class MemberVO {
	
	private String id;
	private String pw;
	private String name;
	private Date birth;
	private String email;
	private String status;
}
