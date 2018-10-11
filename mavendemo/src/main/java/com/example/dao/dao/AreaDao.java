package com.example.dao.dao;

import java.util.List;

import com.example.dao.entity.Area;

public interface AreaDao {

	List<Area> queryArea();
	Area queryAreaById(int areaId);
	int insertArea(Area area);
	int updateArea(Area area);
	int deleteArea(int areaId);
}
