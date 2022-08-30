package com.hong.fitness.mapper;

import java.util.List;

import com.hong.fitness.vo.FitnessBoardVO;

public interface FitnessBoardMapper {

	// 게시판 리스트
	public List<FitnessBoardVO> list() throws Exception;
	
}
