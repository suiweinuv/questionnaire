package com.service;

import java.util.List;

import com.model.Xzl;

public interface XzlService {
	List<Xzl> findXzl(String id,String name);
	
}
