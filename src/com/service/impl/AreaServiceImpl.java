package com.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mapper.AreaMapper;
import com.model.Area;
import com.service.AreaService;

@Service
@Transactional
public class AreaServiceImpl implements AreaService{
	
	@Resource
	public AreaMapper areaMapper;
	@Override
	public List<Area> findQu() {
		// TODO Auto-generated method stub
		List<Area> findQu = areaMapper.findQu();
		System.out.println(findQu);
		
		return findQu;
	}
	@Override
	public List<Area> findJiedao(String  id) {
		List<Area> findJiedao = areaMapper.findJiedao(id);
		return findJiedao;
	}

}
