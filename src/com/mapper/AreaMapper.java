package com.mapper;

import java.util.List;

import com.model.Area;

public interface AreaMapper {
	List<Area> findQu();
	List<Area> findJiedao( String id);
}
