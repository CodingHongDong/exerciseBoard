package com.hong.fitness.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j;

// fitness 게시판
@Controller
@Log4j
@RequestMapping("/hong/fitnessboard")
public class FitnessBoardController {
	
	// 게시판 리스트
	@GetMapping("/list.do")
	public String list(Model model) throws Exception {
		
		log.info("게시판 리스트 처리");
		
		return "hong/fitnessboard/list";
	}
	
	// 게시판 글보기
	
	// 게시판 글쓰기 폼
	
	// 게시판 글쓰기 처리
	
	// 게시판 글수정 폼
	
	// 게시판 글수정 처리
	
	// 게시판 글삭제
}
