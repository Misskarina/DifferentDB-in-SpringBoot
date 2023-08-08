package com.briz.ValidationHibernate;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Validated
@RestController
@RequestMapping("/testapi")
public class BookController 
{
	@Autowired
	BookRepository brepo;
	
	@PostMapping("/save")
	public Book save(@RequestBody Book bk)
	{
		return brepo.save(bk);
	}
	@GetMapping ("/showall")
	public List<Book> show()
	{
		return brepo.findAll();
	}
	
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable int id)
	{
		 brepo.deleteById(id);
	}
}
