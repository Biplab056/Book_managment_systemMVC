package com.jsp.CONTROLLER;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import com.jsp.DAO.UserDao;
import com.jsp.DTO.Book;
import com.jsp.DTO.User;


@RestController
public class UserController {
	@Autowired
	UserDao dao;
	
	
	
	
	
	//insert users details
	
		@RequestMapping("/Signin")
		public ModelAndView addUser() {
			ModelAndView mv = new ModelAndView();
			mv.addObject("user", new User());
			mv.setViewName("UserSignin.jsp");
			return mv;
		}
		@RequestMapping("/saveuser")
		public ModelAndView saveUser(@ModelAttribute User user) {
			dao.saveUser(user);
			ModelAndView v  = new ModelAndView();
			v.setViewName("User.jsp");
			return v;
			
		}
		//--------------------------------------------
		@RequestMapping("/SigninUserAdmin")
		public ModelAndView addUserAdmin() {
			ModelAndView mv = new ModelAndView();
			mv.addObject("user", new User());
			mv.setViewName("AdminUserRegister.jsp");
			return mv;
		}
		@RequestMapping("/saveuserAdmin")
		public ModelAndView saveUserAdmin(@ModelAttribute User user) {
			dao.saveUser(user);
			ModelAndView v  = new ModelAndView();
			v.setViewName("AdminHome.jsp");
			return v;
			
		}
		//validation user email and password
		
		@RequestMapping("/userlogin")
		public ModelAndView validateUser() {
			ModelAndView mv = new ModelAndView();
			mv.addObject("user", new User());
			mv.setViewName("User.jsp");
			return mv;
		}
		@RequestMapping("/validateUser")
		public ModelAndView chaeckUserLogin(@ModelAttribute User user) {
			ModelAndView v  = new ModelAndView();
			if(dao.checkLogin(user)) {
				
				v.setViewName("userHome.jsp");
				return v;
			}
			
			v.setViewName("UserSignin.jsp");
			return v;
					
		}
		
		//Display all the users from admin
		
		@RequestMapping("/displayUser")
		public ModelAndView getAllEmployee() {
			ModelAndView mv = new ModelAndView();
			List<User> userlist = dao.getAlluser();
			mv.addObject("user",userlist);
			mv.setViewName("DisplayUser.jsp");
			return mv;
		}
		
		//Delete user by id
		
		 @RequestMapping("/deleteUser")
		 public ModelAndView deleteUser(@RequestParam("id") int userId) {
			 dao.deleteUser(userId);
			 
			 ModelAndView mv = new ModelAndView();
			 mv.setViewName("AdminHome.jsp");
			 return mv;
			 
		    }
		//Display book
		 

			@RequestMapping("/displayBookUser")
			public ModelAndView getAllBooks() {
				ModelAndView mv = new ModelAndView();
				List<Book> booklist = dao.getAllbooks();
				mv.addObject("book",booklist);
				mv.setViewName("DisplayBookUser.jsp");
				return mv;
			}
	
		
		
		
		
		
		         

}
