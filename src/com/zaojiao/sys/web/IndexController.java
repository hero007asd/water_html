package com.zaojiao.sys.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
	@RequestMapping("/index/{cityId}")
	public ModelAndView index(HttpServletRequest req
							,HttpServletResponse resp
							,HttpSession session
							,@PathVariable("cityId")String cityId){
//		CookieUtil cu = new CookieUtil();
//		cu.getCityCookie(resp, req, session, cityId);
		return new ModelAndView("/index.jsp");
	}
	
	
	
	@ResponseBody
	@RequestMapping("map")
	public String mapList(HttpServletRequest req){
		
		
		
		return "";
	}
	
}
