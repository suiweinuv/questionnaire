package com.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.model.Area;
import com.model.IntentionXzl;
import com.model.Questionnaire;
import com.model.ServiceArea;
import com.model.Xzl;
import com.service.AreaService;
import com.service.IntentionXzlService;
import com.service.QuestionnaireService;
import com.service.ServiceAreaService;
import com.service.XzlService;
import com.utils.DateUtil;
import com.utils.SysUtil;



@Controller
@RequestMapping(value = "/questionnaire/")
public class QuestionnaireController {
	@Autowired
	private AreaService areaService; 
	@Autowired
	private XzlService xzlService; 
	@Autowired
	private QuestionnaireService questionnaireService; 
	@Autowired
	private IntentionXzlService IntentionXzlService; 
	@Autowired
	private ServiceAreaService serviceAreaService;
	
	
	@RequestMapping(value = "/index")
	public ModelAndView index(HttpServletRequest request)
			throws SQLException {
		ModelAndView view = new ModelAndView("questionnaire");
		List<Area> listArea =  areaService.findQu();
		request.setAttribute("listArea", listArea);
		
		return view;
	}
    @RequestMapping(value = "/jiedao")
	public void jiedao(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException{

    	List<Area> listArea =  areaService.findJiedao( request.getParameter("qu"));
		String str = "";
		for(Area con : listArea){
			str += "{ \"id\" : \"" + con.getId() + "\", \"name\" : \"" + con.getName() + "\"},";
		}
		
		if(str.endsWith(",")){
			str = str.substring(0, str.length() - 1);
		}
		str = "[" + str + "]";
		response.getWriter().write(str);
		response.getWriter().close();
	}
    //搜索意向管理楼宇
    @RequestMapping(value = "/xzl")
    public void xzl(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException{
    	String id = request.getParameter("jiedao_value");
    	String xzl = request.getParameter("xzl_input");
    	if (id.equals("-1")||!xzl.equals("")) {
			id="";
		}
    	id="%"+id+"%";
    	xzl="%"+xzl+"%";
    	List<Xzl> listXzl =  xzlService.findXzl(id,xzl);
    	String str = "";
    	for(Xzl con : listXzl){
    		str += "{ \"id\" : \"" + con.getId() + "\", \"name\" : \"" + con.getTitle() + "\"},";
    	}
    	
    	if(str.endsWith(",")){
    		str = str.substring(0, str.length() - 1);
    	}
    	str = "[" + str + "]";
    	response.getWriter().write(str);
    	response.getWriter().close();
    }
    //保存
    @RequestMapping(value = "/save", method = RequestMethod.POST)
	public String add(HttpServletRequest request,
			HttpServletResponse response, Questionnaire questionnaire) {
		
		//保存questionnaire
		questionnaire.setCreate_time(DateUtil.getCurrentTime());
		questionnaire.setId(SysUtil.getUUID());
		questionnaire.setStatus(0);
		questionnaireService.insertQuestionnaire(questionnaire);
		//保存intention_xzl
		IntentionXzl intentionXzl = new IntentionXzl();
		intentionXzl.setQuestionnaire_id(questionnaire.getId());
		intentionXzl.setStatus(0);
		for (String s : questionnaire.getIntention_xzl()) {
			intentionXzl.setXzl_id(s);
			intentionXzl.setId(SysUtil.getUUID());
			IntentionXzlService.insertIntentionXzl(intentionXzl);
		}
		//保存service_area
		ServiceArea sa = new ServiceArea();
		sa.setQuestionnaire_id(questionnaire.getId());
		sa.setStatus(0);
		for (String s : questionnaire.getService_area()) {
			sa.setId(SysUtil.getUUID());
			sa.setarea_id(s);
			serviceAreaService.insertServiceArea(sa);	
		}
		
		ModelAndView view = new ModelAndView("questionnaire");
		List<Area> listArea =  areaService.findQu();
		request.setAttribute("listArea", listArea);
		
		return "redirect:/questionnaire/index";
    }
	
}
