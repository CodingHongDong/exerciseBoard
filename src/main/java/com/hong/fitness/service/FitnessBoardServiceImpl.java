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
	
	// List
	@Override
	public List<FitnessBoardVO> list() throws Exception {
		
		log.info("fitness 게시판 리스트");
		
		return mapper.list();
	}

}
