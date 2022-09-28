package com.hong.fitness.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.hong.fitness.mapper.FitnessBoardReplyMapper;
import com.hong.fitness.vo.FitnessBoardReplyVO;
import com.hong.fitness.vo.FitnessBoardVO;
import com.hong.util.domain.PageObject;

import lombok.extern.log4j.Log4j;

@Service
@Log4j
public class FitnessBoardReplyServiceImpl implements FitnessBoardReplyMapper {

	@Inject
	private FitnessBoardReplyMapper mapper;

	@Override
	public List<FitnessBoardReplyVO> replyList(long no) throws Exception {
		
		return mapper.replyList(no);
	}

	@Override
	public void replyWrite(FitnessBoardReplyVO fbvo) throws Exception {
		mapper.replyWrite(fbvo);		
	}

	@Override
	public void replyModify(FitnessBoardReplyVO fbvo) throws Exception {
		mapper.replyModify(fbvo);		
	}
	
	@Override
	public void replyDelete(int rno) throws Exception {
		log.info("rno값 : " + rno);
		mapper.replyDelete(rno);		
	}

}
