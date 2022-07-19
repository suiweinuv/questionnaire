package com.model;

public class ServiceArea {
	private String id;
	private String questionnaire_id;
	private String area_id;
	private int status;
	
	
	public ServiceArea() {
		super();
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getQuestionnaire_id() {
		return questionnaire_id;
	}


	public void setQuestionnaire_id(String questionnaire_id) {
		this.questionnaire_id = questionnaire_id;
	}


	public String getarea_id() {
		return area_id;
	}


	public void setarea_id(String area_id) {
		this.area_id = area_id;
	}


	public int getStatus() {
		return status;
	}


	public void setStatus(int status) {
		this.status = status;
	}


	public ServiceArea(String id, String questionnaire_id, String area_id,
			int status) {
		super();
		this.id = id;
		this.questionnaire_id = questionnaire_id;
		this.area_id = area_id;
		this.status = status;
	}


	
	
}
