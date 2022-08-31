package com.hong.fitness.mapper;

import java.util.List;

import com.hong.fitness.vo.FitnessBoardVO;

public interface FitnessBoardMapper {

	// 게시판 리스트
	public List<FitnessBoardVO> list() throws Exception;
	
	// 게시판 글보기
	public FitnessBoardVO view(long no) throws Exception;
	
	// 게시판 글쓰기
	public int write(FitnessBoardVO vo) throws Exception;
	
	// 게시판 글 수정
	public int update(FitnessBoardVO vo) throws Exception;
}
