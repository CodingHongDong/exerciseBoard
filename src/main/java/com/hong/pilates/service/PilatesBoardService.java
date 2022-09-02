package com.hong.pilates.service;

import java.util.List;

import com.hong.pilates.vo.PilatesBoardVO;

public interface PilatesBoardService {

	// 게시판 리스트
	public List<PilatesBoardVO> list() throws Exception;
	
	// 게시판 글보기
	public PilatesBoardVO view(long no) throws Exception;
	
	// 게시판 글쓰기
	public int write(PilatesBoardVO vo) throws Exception;
	
	// 게시판 글 수정
	public int update(PilatesBoardVO vo) throws Exception;
	
	// 게시판 글 삭제
	public int delete(long no) throws Exception;
	
}
