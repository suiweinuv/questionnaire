package com.service.impl;



import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mapper.IntentionXzlMapper;
import com.model.IntentionXzl;
import com.service.IntentionXzlService;

@Service
@Transactional
public class IntentionXzlServiceImpl implements IntentionXzlService{
	
	@Resource
	public IntentionXzlMapper IntentionXzlMapper;

	@Override
	public void insertIntentionXzl(IntentionXzl IntentionXzl) {
		IntentionXzlMapper.insertIntentionXzl(IntentionXzl);
		
	}
	

}
