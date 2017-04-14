package com.servicerequest.controller;

import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class SecondForm implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest req,
			HttpServletResponse res) throws Exception {
		String name=req.getParameter("userName");
		Map m=new HashMap();
		m.put("msg", "hello from second form  "+name);
		
		return new ModelAndView("success",m);
	}
	

}



