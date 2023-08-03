package com.mongo.MongoDB;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
	@Autowired
	BookRepository brepo;
	
	@RequestMapping("/test")
	public String test()
	{
		return"this is for mongodb test";
	}
	@RequestMapping("/save")
	public String save()
	{
		Book b=new Book();
		b.setBookname("Arthashastra");
		b.setAuthor("Kautilya");
		
		 brepo.save(b).subscribe();
		 return "data saved";
	}
	
	@RequestMapping("/saveall")
	public String all()
	{
		Book b1=new Book();
		b1.setBookname("Engg maths");
		b1.setAuthor("Nirali");
		
		
		Book b2=new Book();
		b2.setBookname("Anandmath");
		b2.setAuthor("B.C.Chatterjee");
		
		
		Book b4=new Book();
		b4.setBookname("Chitra");
		b4.setAuthor("Rabindranath Tagore");
		
		
		Book b5=new Book();
		b5.setBookname("Dharmashastra");
		b5.setAuthor("Manu");
		
		List<Book>data=Arrays.asList(b1,b2,b4,b5);
		brepo.saveAll(data).subscribe();
		return"all data saved";
		
	}

}
