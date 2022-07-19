package com.model;

public class Area {
	private int id;
	private String name;
	private String style;
	private String pid;
	private String key_id;
	
	public Area() {
		super();
	}
	
	

	
	public Area(int id, String name, String style, String pid, String key_id) {
		super();
		this.id = id;
		this.name = name;
		this.style = style;
		this.pid = pid;
		this.key_id = key_id;
	}




	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getKey_id() {
		return key_id;
	}

	public void setKey_id(String key_id) {
		this.key_id = key_id;
	}
	
	
	
	
}
