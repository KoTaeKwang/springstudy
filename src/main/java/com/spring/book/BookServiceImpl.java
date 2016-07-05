package com.spring.book;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("bookService")
public class BookServiceImpl implements BookService {
	
	@Autowired
	private BookDao bookDao;
	
	
	@Override
	public List<Book> getBookList() {
		return bookDao.getBookList();
	}
}
