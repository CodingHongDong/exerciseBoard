package com.hong.fitness.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hong.fitness.service.FitnessBoardService;
import com.hong.fitness.vo.FitnessBoardVO;
import com.hong.util.domain.Criteria;
import com.hong.util.domain.Pagenation;

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
	public String list(Model model, Criteria criteria) throws Exception {
		
		List<FitnessBoardVO> list = fitnessBoardServiceImpl.list(criteria);
		
		log.info(list.size());
		
		Pagenation pagenation = new Pagenation();
		
		pagenation.setCriteria(criteria);
		pagenation.setTotalCount(fitnessBoardServiceImpl.totalCount());
		
		model.addAttribute("vo", list);
		model.addAttribute("pagenation", pagenation);
		
		return "hong/fitnessboard/list";
	}
	
	// 게시판 글보기
	@GetMapping("/view.do")
	public String view(long no, Model model) throws Exception {
		
		log.info("fitness board 글보기 no : " + no);
		
		model.addAttribute("vo", fitnessBoardServiceImpl.view(no));
		
		fitnessBoardServiceImpl.increase(no);
		
		return "hong/fitnessboard/view";
	}
	
	
	// 게시판 글쓰기 폼
	@GetMapping("/write.do")
	public String writeForm() throws Exception {
		
		log.info("게시판 글쓰기 폼");
		
		return "hong/fitnessboard/write";
	}
	
	// 게시판 글쓰기 처리
	@PostMapping("/write.do")
	public String write(FitnessBoardVO vo) throws Exception {
		
		log.info("게시판 글쓰기 처리 vo : " + vo);
		
		fitnessBoardServiceImpl.write(vo);
		
		return "redirect:list.do";
	}
	
	// 게시판 글수정 폼
	@GetMapping("/update.do")
	public String updateForm(long no, Model model) throws Exception{
		model.addAttribute("vo", fitnessBoardServiceImpl.view(no));
		
		log.info("게시판 수정 폼 no : " + no);		
		
		return "hong/fitnessboard/update";
	}
	
	// 게시판 글수정 처리
	@PostMapping("/update.do")
	public String update(FitnessBoardVO vo) throws Exception {
		
		log.info("게시판 글 수정 처리 vo : " + vo);
		
		fitnessBoardServiceImpl.update(vo);
		
		return "redirect:view.do?no=" + vo.getNo();
	}
	
	// 게시판 글삭제
	@GetMapping("/delete.do")
	public String delete(FitnessBoardVO vo) throws Exception {
		
		log.info("게시판 삭제 : " + vo);
		
		fitnessBoardServiceImpl.delete(vo.getNo());
		
		return "redirect:list.do";
	}
}
