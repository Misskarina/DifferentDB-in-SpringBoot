package com.karina.springbook;+

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
	@Autowired
	BookRepository brepo;
	@RequestMapping("/book")
	public String saveAll()
	{
		Book b=new Book();
		b.setBookname("Panchtantra");
		b.setWriter("Vishnu Sharma");
		b.setPrice(1500);
		
		Book b2=new Book();
		b2.setBookname("Arthashastra");
		b2.setWriter("Kautilya");
		b2.setPrice(2000);
		
		Book b3=new Book();
		b3.setBookname("Akbarnama");
		b3.setWriter("Abul fazal");
		b3.setPrice(2500);
		
		List<Book>list=Arrays.asList(b,b2,b3);
		brepo.saveAll(list);
				
		return "famous books of india";
	}
	

}
