package com.zaojiao.sys.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zaojiao.sys.mappers.area.AreaMapper;
import com.zaojiao.sys.pojo.Area;
import com.zaojiao.sys.pojo.City;

@Service("areaService")
public class AreaService {
	@Resource
	private AreaMapper areaMapper;
	
	public List<City> listArea(String cityId){
		return areaMapper.listArea(cityId);
	}
	
	public List<Area> listSubArea(String cityId){
		return areaMapper.listSubArea(cityId);
	}

}
