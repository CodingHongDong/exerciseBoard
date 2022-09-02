package com.hong.pilates.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.hong.pilates.mapper.PilatesBoardMapper;
import com.hong.pilates.vo.PilatesBoardVO;

@Service
public class PilatesBoardServiceImpl implements PilatesBoardService {

	@Inject
	private PilatesBoardMapper mapper;
	
	@Override
	public List<PilatesBoardVO> list() throws Exception {
		// TODO Auto-generated method stub
		return mapper.list();
	}

	@Override
	public PilatesBoardVO view(long no) throws Exception {
		// TODO Auto-generated method stub
		return mapper.view(no);
	}

	@Override
	public int write(PilatesBoardVO vo) throws Exception {
		// TODO Auto-generated method stub
		return mapper.write(vo);
	}

	@Override
	public int update(PilatesBoardVO vo) throws Exception {
		// TODO Auto-generated method stub
		return mapper.update(vo);
	}

	@Override
	public int delete(long no) throws Exception {
		// TODO Auto-generated method stub
		return mapper.delete(no);
	}

}
