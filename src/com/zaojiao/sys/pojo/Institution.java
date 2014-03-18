package com.zaojiao.sys.pojo;

import java.util.List;

/**
 * @author William
 *description:{机构pojo}
 */
public class Institution {
	private int _id;
	private int totalCount;
	private int insId;
	private String insName;
	private String address;
	private String addressFlag;
	private String telNo;
	private City city;
	private City area;
	private SubArea subArea;
	private List<InsType> insType;
	private String webSite;
	private String trafficInfo;
	private TimeType timeType;
	private Age ageType;
	private PriceType priceType;
	private String logoPath;
	private String bannerPath;
	private String insContent;
	private String urlPath;
	public int get_id() {
		return _id;
	}
	public void set_id(int _id) {
		this._id = _id;
	}
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	public int getInsId() {
		return insId;
	}
	public void setInsId(int insId) {
		this.insId = insId;
	}
	public String getInsName() {
		return insName;
	}
	public void setInsName(String insName) {
		this.insName = insName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddressFlag() {
		return addressFlag;
	}
	public void setAddressFlag(String addressFlag) {
		this.addressFlag = addressFlag;
	}
	public String getTelNo() {
		return telNo;
	}
	public void setTelNo(String telNo) {
		this.telNo = telNo;
	}
	public City getCity() {
		return city;
	}
	public void setCity(City city) {
		this.city = city;
	}
	public City getArea() {
		return area;
	}
	public void setArea(City area) {
		this.area = area;
	}
	public SubArea getSubArea() {
		return subArea;
	}
	public void setSubArea(SubArea subArea) {
		this.subArea = subArea;
	}
	public List<InsType> getInsType() {
		return insType;
	}
	public void setInsType(List<InsType> insType) {
		this.insType = insType;
	}
	public String getWebSite() {
		return webSite;
	}
	public void setWebSite(String webSite) {
		this.webSite = webSite;
	}
	public String getTrafficInfo() {
		return trafficInfo;
	}
	public void setTrafficInfo(String trafficInfo) {
		this.trafficInfo = trafficInfo;
	}
	public TimeType getTimeType() {
		return timeType;
	}
	public void setTimeType(TimeType timeType) {
		this.timeType = timeType;
	}
	public Age getAgeType() {
		return ageType;
	}
	public void setAgeType(Age ageType) {
		this.ageType = ageType;
	}
	public PriceType getPriceType() {
		return priceType;
	}
	public void setPriceType(PriceType priceType) {
		this.priceType = priceType;
	}
	public String getLogoPath() {
		return logoPath;
	}
	public void setLogoPath(String logoPath) {
		this.logoPath = logoPath;
	}
	public String getInsContent() {
		return insContent;
	}
	public void setInsContent(String insContent) {
		this.insContent = insContent;
	}
	public String getUrlPath() {
		return urlPath;
	}
	public void setUrlPath(String urlPath) {
		this.urlPath = urlPath;
	}
	public String getBannerPath() {
		return bannerPath;
	}
	public void setBannerPath(String bannerPath) {
		this.bannerPath = bannerPath;
	}

}
