package com.hong.util.interceptor;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import lombok.extern.log4j.Log4j;

@Log4j
public class HongInterceptor extends HandlerInterceptorAdapter{

	@SuppressWarnings("rawtypes")
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		log.info("======interceptor start ======");
		log.info(" URL [{}], " + request.getRequestURI());
		
		Enumeration paramsNames = request.getParameterNames();
		while (paramsNames.hasMoreElements()) {
			String key = (String) paramsNames.nextElement();
			String value = request.getParameter(key);
			log.info(" RequestParameter Data ==> " + key + " : " + value + "");
		}
		return super.preHandle(request, response, handler);
	}
	
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		
		log.info("====== interceptor end ======");
		
	}
	
	
}
