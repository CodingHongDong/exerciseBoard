package com.hong.fitness.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hong.fitness.service.FitnessBoardReplyServiceImpl;
import com.hong.fitness.vo.FitnessBoardReplyVO;
import com.hong.util.domain.PageObject;

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
	public String postWrite(FitnessBoardReplyVO fbvo, PageObject pageObject) throws Exception {
		
		fbrservice.replyWrite(fbvo);
		
		log.info("댓글 작성 : " + fbvo);
		
		return "redirect:http://localhost/hong/fitnessboard/view.do?no=" + fbvo.getNo()
				+ "&inc=0"
				+ "&page=" + pageObject.getPage()
				+ "&perPageNum=" + pageObject.getPerPageNum();
	}
	
	
	// 댓글 수정
	
	
	// 댓글 삭제 폼
	@GetMapping("/delete.do")
	public String replyDeleteForm(FitnessBoardReplyVO fbvo, Model model, PageObject pageObject) throws Exception {
		
		log.info("댓글 삭제 폼");
		
		model.addAttribute("replyDelete", fbrservice.replyList(fbvo.getRno()));
		model.addAttribute("pageObject", pageObject);
		
		return "http://localhost/hong/fitnessboard/replyDelete";
	}
	
	// 댓글 삭제 처리
	@PostMapping("/delete.do")
	public String replyDelete(FitnessBoardReplyVO fbvo, Model model, PageObject pageObject) throws Exception {
		
		
		
		fbrservice.replyDelete(fbvo);
		
		
		model.addAttribute("pageObject", pageObject);
		
		log.info("댓글 삭제 fbvo.getRno() :" + fbvo.getRno() + ", fbvo.getNo() : " + fbvo.getNo());
		
		return "redirect:http://localhost/hong/fitnessboard/view.do?no=" + fbvo.getNo()
				+ "&inc=0"
				+ "&page=" + pageObject.getPage()
				+ "&perPageNum=" + pageObject.getPerPageNum();
	}
}
