package com.zaojiao.core.utils;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class CookieUtil {
	public String getCityCookie(HttpServletResponse resp,HttpServletRequest req
			,HttpSession session){
		Cookie myCookie[] = req.getCookies();
		String cityId = null;
		for(Cookie cookie:myCookie){
			if(cookie.getName().equals("cityId")){
				cityId = cookie.getValue();
			}
			System.out.println("cookie:"+cookie.getName()+";value:"+cookie.getValue());
		}
		return cityId;
	}
	/**
	 * 获取cookie中的cityId
	 */
	public String getCityCookie(HttpServletResponse resp,HttpServletRequest req
						,HttpSession session,String cityId){
		Cookie myCookie[] = req.getCookies();
		String cityIdTemp = null;
		String cityNameTemp = null;
		for(Cookie cookie:myCookie){
			if(cookie.getName().equals("cityId")){
				cityIdTemp = cookie.getValue();
				cookie.setValue(cityId);
				cookie.setPath("/");
				resp.addCookie(cookie);
			}else if(cookie.getName().equals("cityName")){
				cityNameTemp = getCityName(cityId);
				cookie.setValue(cityNameTemp);
				cookie.setPath("/");
				resp.addCookie(setCityName(cityId));
			}
//			System.out.println("cookie:"+cookie.getName()+";value:"+cookie.getValue());
		}
		if(cityIdTemp == null){
			resp.addCookie(setCityId(cityId));
		}
		if(cityNameTemp == null){
			resp.addCookie(setCityName(cityId));
		}
		cityIdTemp = cityId;
		return cityIdTemp;
	}
	
	private Cookie setCityId(String cityId){
		Cookie cityCookie = new Cookie("cityId", cityId);
		cityCookie.setPath("/");
		cityCookie.setMaxAge(3600*24*100);//100days
		return cityCookie;
	}	
	private Cookie setCityName(String cityId){
		Cookie cityCookie = null;
		try {
			cityCookie = new Cookie("cityName", URLEncoder.encode(getCityName(cityId),"UTF-8"));
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		cityCookie.setPath("/");
		cityCookie.setMaxAge(3600*24*100);//100days
		return cityCookie;
	}
	
	public String getCityName(String cityId){
		if(cityId == null){
			return null;
		}
		String cityName = null;
		switch (Integer.parseInt(cityId)) {
		case 110000:
			cityName = "北京";
			break;
		case 310000:
			cityName = "上海";
			break;
		case 440100:
			cityName = "广州";
			break;
		case 440300:
			cityName = "深圳";
			break;
		case 330100:
			cityName = "杭州";
			break;
		case 320100:
			cityName = "南京";
			break;
		default:
			break;
		}
		return cityName;
	}
}
