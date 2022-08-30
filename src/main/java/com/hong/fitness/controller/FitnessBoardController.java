package com.hong.fitness.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hong.fitness.service.FitnessBoardService;
import com.hong.fitness.vo.FitnessBoardVO;

import lombok.extern.log4j.Log4j;

// fitness 게시판
@Controller
@Log4j
@RequestMapping("/hong/fitnessboard")
public class FitnessBoardController {
	
	@Autowired
	private FitnessBoardService fitnessBoardServiceImpl;
	
	// 게시판 리스트
	@GetMapping("/list.do")
	public String list(Model model) throws Exception {
		
		List<FitnessBoardVO> list = fitnessBoardServiceImpl.list();
		
		log.info("게시판 리스트");
		
		model.addAttribute("vo", list);
		
		return "hong/fitnessboard/list";
	}
	
	// 게시판 글보기
	@GetMapping("/view.do")
	public String view(long no, Model model) throws Exception {
		
		log.info("fitness board 글보기");
		
		return "hong/fitnessboard/view";
	}
	
	
	// 게시판 글쓰기 폼
	@GetMapping("/write.do")
	public String writeForm() throws Exception {
		
		log.info("게시판 글쓰기 폼");
		
		return "hong/fitnessboard/write";
	}
	
	// 게시판 글쓰기 처리
	
	// 게시판 글수정 폼
	
	// 게시판 글수정 처리
	
	// 게시판 글삭제
}
