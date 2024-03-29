package com.spring.book;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller("bookcontroller")
public class BookController {

	@Autowired
	BookService bookService;
	
	@RequestMapping(value="/book", method=RequestMethod.GET)
	public String home(Model model){
		System.out.println("aaa");
		model.addAttribute("books",bookService.getBookList());
		return "/book/book";
	}

	
}
