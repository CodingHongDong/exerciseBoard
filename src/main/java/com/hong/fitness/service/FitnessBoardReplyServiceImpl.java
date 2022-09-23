package com.hong.fitness.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.hong.fitness.mapper.FitnessBoardReplyMapper;
import com.hong.fitness.vo.FitnessBoardReplyVO;
import com.hong.fitness.vo.FitnessBoardVO;
import com.hong.util.domain.PageObject;

@Service
public class FitnessBoardReplyServiceImpl implements FitnessBoardReplyMapper {

	@Inject
	private FitnessBoardReplyMapper mapper;

	@Override
	public List<FitnessBoardReplyVO> replyList(long no) throws Exception {
		
		return mapper.replyList(no);
	}

	@Override
	public void replyWrite(FitnessBoardReplyVO frvo) throws Exception {
		mapper.replyWrite(frvo);		
	}

	@Override
	public void replyModify(FitnessBoardReplyVO frvo) throws Exception {
		mapper.replyModify(frvo);		
	}
	
	@Override
	public void replyDelete(FitnessBoardReplyVO frvo) throws Exception {
		mapper.replyDelete(frvo);		
	}

}
