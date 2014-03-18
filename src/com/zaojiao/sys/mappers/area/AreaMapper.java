package com.zaojiao.sys.mappers.area;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zaojiao.sys.pojo.Area;
import com.zaojiao.sys.pojo.City;

public interface AreaMapper {
	public List<City> listArea(@Param("cityId")String cityId);
	public List<Area> listSubArea(@Param("cityId")String cityId);
}
