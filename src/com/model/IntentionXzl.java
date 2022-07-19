package com.model;

public class IntentionXzl {
	private String id;
	private String questionnaire_id;
	private String xzl_id;
	private int status;
	
	
	public IntentionXzl() {
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


	public String getXzl_id() {
		return xzl_id;
	}


	public void setXzl_id(String xzl_id) {
		this.xzl_id = xzl_id;
	}


	public int getStatus() {
		return status;
	}


	public void setStatus(int status) {
		this.status = status;
	}


	public IntentionXzl(String id, String questionnaire_id, String xzl_id,
			int status) {
		super();
		this.id = id;
		this.questionnaire_id = questionnaire_id;
		this.xzl_id = xzl_id;
		this.status = status;
	}


	
	
}
