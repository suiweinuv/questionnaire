package com.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mapper.XzlMapper;
import com.model.Xzl;
import com.service.XzlService;

@Service
@Transactional
public class XzlServiceImpl implements XzlService{
	
	@Resource
	public XzlMapper XzlMapper;
	@Override
	public List<Xzl> findXzl(String id,String name) {
		// TODO Auto-generated method stub
		List<Xzl> findXzl = XzlMapper.findXzl(id,name);
		
		return findXzl;
	}
	

}
