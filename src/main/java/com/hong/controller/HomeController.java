package com.hong.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.hong.member.service.MemberService;
import com.hong.member.vo.LoginVO;

import lombok.extern.log4j.Log4j;

// 메인페이지 컨트롤러
@Controller
@Log4j
@RequestMapping("/hong")
public class HomeController {
	
	@Autowired
	private MemberService service;
	
	// 메인 페이지
	@GetMapping("/home.do")
	public String homeView() {
		log.info("메인 페이지");
		
		return "hong/home";
	}
	
	// 로그인 폼
	@GetMapping("/login.do")
	public String loginForm() throws Exception{
		
		log.info("login 폼으로 이동");
		return "hong/login";
	}
	
	// 로그인 처리
	@PostMapping("/login.do")
	// 사용자가 아이디와 비밀번호를 입력해서 보낸다. -> 받는다.
	public String login(LoginVO invo, HttpSession session, RedirectAttributes rttr) throws Exception{
		log.info("로그인 처리 - invo : " + invo);
		invo = service.login(invo);
		
		if(invo==null) {
			log.info("일치하는 정보 없음.");
			rttr.addFlashAttribute("msg", "일치하는 정보가 없습니다.");
			return "redirect:/hong/login.do";
		}
		
		session.setAttribute("login", service.login(invo));
	
		// 원래는 main으로 보내야하나 main을 안 만들어서 만들어진 게시판으로 임시로 보낸다.
		return "redirect:/hong/home.do";
	}
	
	// 로그아웃 처리
	@GetMapping("/logout.do")
	public String logout(HttpSession session) throws Exception{
		// 로그아웃 처리 - session의 정보를 지운다.
		session.removeAttribute("login");
		
		log.info("로그아웃 처리됨");
		
		return "redirect:/hong/home.do";
	}
	
}
