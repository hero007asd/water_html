package com.zaojiao.sys.pojo;

/**
 * 区域、子区域pojo
 * @author William
 *2013年10月21日下午3:42:06
 */
public class Area {
	private int _id;
	private String areaName;
	private SubArea subArea;
	public int getId() {
		return _id;
	}
	public void setId(int _id) {
		this._id = _id;
	}
	public String getAreaName() {
		return areaName;
	}
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}
	public SubArea getSubArea() {
		return subArea;
	}
	public void setSubArea(SubArea subArea) {
		this.subArea = subArea;
	}
	
}
