package com.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mapper.ServiceAreaMapper;
import com.model.ServiceArea;
import com.service.ServiceAreaService;

@Service
@Transactional
public class ServiceArealServiceImpl implements ServiceAreaService{
	
	@Resource
	public ServiceAreaMapper ServiceAreaMapper;

	@Override
	public void insertServiceArea(ServiceArea ServiceArea) {
		ServiceAreaMapper.insertServiceArea(ServiceArea);
		
	}
	

}
