package com.model;

public class Questionnaire {
	private String id;
	private String company_name;
	private String  company_people_num ;
	private String   company_add;
	private String   company_tel;
	private String  contact_name ;
	private String  contact_phone ;
	private String  remarks ;
	private String   create_time;
	private String   inviter;
	private String   ip;
	private int   status;
	
	private String [] service_area;
	private String [] intention_xzl;
	
	
	
	public Questionnaire() {
		super();
	}

	public Questionnaire(String id, String company_name,
			String company_people_num, String company_add, String company_tel,
			String contact_name, String contact_phone, String remarks,
			String create_time, String inviter, String ip, int status,
			String[] service_area, String[] intention_xzl) {
		super();
		this.id = id;
		this.company_name = company_name;
		this.company_people_num = company_people_num;
		this.company_add = company_add;
		this.company_tel = company_tel;
		this.contact_name = contact_name;
		this.contact_phone = contact_phone;
		this.remarks = remarks;
		this.create_time = create_time;
		this.inviter = inviter;
		this.ip = ip;
		this.status = status;
		this.service_area = service_area;
		this.intention_xzl = intention_xzl;
	}

	public String[] getService_area() {
		return service_area;
	}

	public void setService_area(String[] service_area) {
		this.service_area = service_area;
	}

	public String getInviter() {
		return inviter;
	}

	public void setInviter(String inviter) {
		this.inviter = inviter;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String[] getIntention_xzl() {
		return intention_xzl;
	}


	public void setIntention_xzl(String[] intention_xzl) {
		this.intention_xzl = intention_xzl;
	}







	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getCompany_name() {
		return company_name;
	}



	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}



	public String getCompany_people_num() {
		return company_people_num;
	}



	public void setCompany_people_num(String company_people_num) {
		this.company_people_num = company_people_num;
	}



	public String getCompany_add() {
		return company_add;
	}



	public void setCompany_add(String company_add) {
		this.company_add = company_add;
	}



	public String getCompany_tel() {
		return company_tel;
	}



	public void setCompany_tel(String company_tel) {
		this.company_tel = company_tel;
	}



	public String getContact_name() {
		return contact_name;
	}



	public void setContact_name(String contact_name) {
		this.contact_name = contact_name;
	}



	public String getContact_phone() {
		return contact_phone;
	}



	public void setContact_phone(String contact_phone) {
		this.contact_phone = contact_phone;
	}



	public String getRemarks() {
		return remarks;
	}



	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}



	public String getCreate_time() {
		return create_time;
	}



	public void setCreate_time(String create_time) {
		this.create_time = create_time;
	}



	public int getStatus() {
		return status;
	}



	public void setStatus(int status) {
		this.status = status;
	}
	
	
	


	
	
}
