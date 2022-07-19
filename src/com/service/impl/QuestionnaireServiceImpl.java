package com.service.impl;



import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mapper.QuestionnaireMapper;
import com.model.Questionnaire;
import com.service.QuestionnaireService;

@Service
@Transactional
public class QuestionnaireServiceImpl implements QuestionnaireService{
	
	@Resource
	public QuestionnaireMapper questionnaireMapper;

	@Override
	public void insertQuestionnaire(Questionnaire questionnaire) {
		questionnaireMapper.insertQuestionnaire(questionnaire);
		
	}
	

}
