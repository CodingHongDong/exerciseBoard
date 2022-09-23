package com.hong.fitness.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hong.fitness.service.FitnessBoardReplyServiceImpl;
import com.hong.fitness.vo.FitnessBoardReplyVO;

import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/reply/*")
@Log4j
public class FitnessBoardReplyController {

	@Autowired
	private FitnessBoardReplyServiceImpl fbrservice;
	
	// 댓글 조회
	
	// 댓글 작성
	@PostMapping("/write.do")
	public String postWrite(FitnessBoardReplyVO fbvo) throws Exception {
		
		fbrservice.replyWrite(fbvo);
		
		log.info(fbvo);
		
		return "redirect:hong/fitnessboard/view?no=?" + fbvo.getNo();
	}
	
	
	// 댓글 수정
	
	// 댓글 삭제
	
}
