package com.hong.free.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.hong.free.mapper.FreeBoardMapper;
import com.hong.free.vo.FreeBoardVO;

@Service
public class FreeBoardServiceImpl implements FreeBoardService {

	@Inject
	private FreeBoardMapper mapper;
	
	@Override
	public List<FreeBoardVO> list() throws Exception {
		// TODO Auto-generated method stub
		return mapper.list();
	}

	@Override
	public FreeBoardVO view(long no) throws Exception {
		// TODO Auto-generated method stub
		return mapper.view(no);
	}

	@Override
	public int write(FreeBoardVO vo) throws Exception {
		// TODO Auto-generated method stub
		return mapper.write(vo);
	}

	@Override
	public int update(FreeBoardVO vo) throws Exception {
		// TODO Auto-generated method stub
		return mapper.update(vo);
	}

	@Override
	public int delete(long no) throws Exception {
		// TODO Auto-generated method stub
		return mapper.delete(no);
	}

	@Override
	public int increase(long no) throws Exception {
		// TODO Auto-generated method stub
		return mapper.increase(no);
	}

}