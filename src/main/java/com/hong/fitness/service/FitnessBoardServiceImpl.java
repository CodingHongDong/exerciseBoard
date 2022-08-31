package com.hong.fitness.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.hong.fitness.mapper.FitnessBoardMapper;
import com.hong.fitness.vo.FitnessBoardVO;

import lombok.extern.log4j.Log4j;

@Service
@Log4j
public class FitnessBoardServiceImpl implements FitnessBoardService {

	@Inject
	private FitnessBoardMapper mapper;
	
	// 게시판 리스트
	@Override
	public List<FitnessBoardVO> list() throws Exception {
		
		log.info("fitness 게시판 리스트");
		
		return mapper.list();
	}

	// 게시판 글보기
	@Override
	public FitnessBoardVO view(long no) throws Exception {
		
		
		return mapper.view(no);
	}

	// 게시판 글 등록
	@Override
	public int write(FitnessBoardVO vo) throws Exception {
		
		
		return mapper.write(vo);
	}

	// 게시판 글 수정
	@Override
	public int update(FitnessBoardVO vo) throws Exception {
		// TODO Auto-generated method stub
		return mapper.update(vo);
	}

	// 게시판 글 삭제
	
}
