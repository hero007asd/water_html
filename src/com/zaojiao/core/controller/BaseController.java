package com.zaojiao.core.controller;

import java.util.Map;

import org.springframework.web.servlet.ModelAndView;

public class BaseController {
//	public final static String JSON_RESULT_URL = "/jsonString";
	public final static String JSON_RESULT = "jsonString";
	
	public static ModelAndView forwardJson(){
		ModelAndView mv = new ModelAndView();
		System.out.println("mv"+mv);
//		mv.setViewName("/jsonString");
		mv.setViewName("/jsp/jsonString.jsp");
		return mv;
	}
	
	public static ModelAndView forwardView(String url){
		ModelAndView mv = new ModelAndView();
		mv.setViewName(url);
		return mv;
	}
	
	public static ModelAndView redirectView(String url,Map<String, String> map){
		ModelAndView mv = new ModelAndView(url,map);
		return mv;
	}
}
