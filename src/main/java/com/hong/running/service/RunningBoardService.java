package com.hong.running.service;

import java.util.List;

import com.hong.running.vo.RunningBoardVO;

public interface RunningBoardService {

	// 게시판 리스트
	public List<RunningBoardVO> list() throws Exception;
	
	// 게시판 글보기
	public RunningBoardVO view(long no) throws Exception;
	
	// 게시판 글쓰기
	public int write(RunningBoardVO vo) throws Exception;
	
	// 게시판 글 수정
	public int update(RunningBoardVO vo) throws Exception;
	
	// 게시판 글 삭제
	public int delete(long no) throws Exception;
	
}
