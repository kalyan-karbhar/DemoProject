package com.servicerequest.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;  
import org.springframework.web.bind.annotation.ModelAttribute;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RequestMethod;  
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;
//import org.springframework.web.servlet.mvc.Controller;

import com.servicerequest.beans.Login;
@Controller
public class LoginController {
	
	@RequestMapping(value="/login",method = RequestMethod.POST)
	public ModelAndView showLogin(HttpServletRequest req,
			HttpServletResponse res,@ModelAttribute("login") Login login) 
	{
		
		//Login login=new Login();
	
		
		//login.setUserName(req.getParameter("username"));
		//login.setPassword(req.getParameter("password"));
		Map m=new HashMap();
		m.put("msg", "hello  "+login.getUserName());
		System.out.println("  user name is"+login.getUserName());
		return new ModelAndView("success",m);
	}
	
	
    
}
