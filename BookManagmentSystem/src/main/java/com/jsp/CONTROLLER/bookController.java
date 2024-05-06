package com.jsp.CONTROLLER;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.jsp.DAO.BookDao;
import com.jsp.DTO.Book;
import com.jsp.DTO.User;


@RestController
public class bookController {
       @Autowired
		BookDao bookDao;
       
       @RequestMapping("/addbook")
       public ModelAndView addBook(Book book) {
    	   ModelAndView mv = new ModelAndView();
    	   mv.addObject("book", new Book());
   			mv.setViewName("addBook.jsp");
   			return mv;
       }
       
       @RequestMapping("/savebook")
       public ModelAndView saveBook(Book book) {
    	   ModelAndView mv = new ModelAndView();
    	   bookDao.saveBook(book);
    	   mv.setViewName("AdminHome.jsp");
    	   
   			return mv;
       }
       
       //Displat all books
       

		@RequestMapping("/displayBook")
		public ModelAndView getAllBooks() {
			ModelAndView mv = new ModelAndView();
			List<Book> booklist = bookDao.getAllbooks();
			mv.addObject("book",booklist);
			mv.setViewName("DisplayBook.jsp");
			return mv;
		}
		//delete book by id
		
		 @RequestMapping("/deletebook")
		 public ModelAndView deletebook(@RequestParam("id") int bookId) {
			 bookDao.deletebook(bookId);
			 
			 ModelAndView mv = new ModelAndView();
			 mv.setViewName("AdminHome.jsp");
			 return mv;
			 
		    }	 
		 //update book by id
		 
		 @RequestMapping("/updatebook")
		 public ModelAndView updatebook(@RequestParam("id") int bookId) {
			 ModelAndView mv = new ModelAndView();
			 Book book = bookDao.findById(bookId);
			 mv.addObject("book",book);
			 mv.setViewName("UpdateBook.jsp");
			 return mv;			 
		 }	
		 
		 @RequestMapping("/update")
	       public ModelAndView updateBook(@ModelAttribute Book book) {
			 ModelAndView mv = new ModelAndView();
			 bookDao.updatebookdetails(book);
			 mv.setViewName("AdminHome.jsp");
			 return mv;
	    	   
	   			
	       }
		
     
       
}
