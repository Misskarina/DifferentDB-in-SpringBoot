package com.briz.springbootdb;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CollegeController {
	@RequestMapping("/heyy")
	
	public String karina()
	{
		
	return "its me";
}
}
