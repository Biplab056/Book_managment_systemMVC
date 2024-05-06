package com.jsp.CONTROLLER;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.jsp.DAO.AdminDao;
import com.jsp.DAO.BookDao;
import com.jsp.DAO.UserDao;
import com.jsp.DTO.Admin;
import com.jsp.DTO.Book;
import com.jsp.DTO.User;

@RestController
public class AdminController {
	@Autowired
	AdminDao admindao;
	
	
	//add admin
	
	@RequestMapping("/AdminSignin")
	public ModelAndView addAdmin() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("admin", new Admin());
		mv.setViewName("AdminSignin.jsp");
		return mv;
	}
	@RequestMapping("/saveadmin")
	public ModelAndView saveUser(@ModelAttribute Admin admin) {
		admindao.saveAdmin(admin);
		ModelAndView v  = new ModelAndView();
		v.setViewName("Admin.jsp");
		return v;
		
	}
	
	// validate admin email and password
	
	@RequestMapping("/Adminlogin")
	public ModelAndView validateUser() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("admin", new Admin());
		mv.setViewName("Admin.jsp");
		return mv;
	}
	@RequestMapping("/adminValidate")
	public ModelAndView chaeckUserLogin(@ModelAttribute Admin admin) {
		ModelAndView v  = new ModelAndView();
		if(admindao.checkAdminLogin(admin)) {
			
			v.setViewName("AdminHome.jsp");
			return v;
		}
		
		v.setViewName("AdminSignin.jsp");
		return v;
}
	
	  
   
	
	
	
}


