package com.example.demo.Controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController3 {
	
	@Value("${color}")
	private String yourFavColor;
	
	@GetMapping("/sc")
	public String getMyFav()
	{
		return "My favorite color is "+yourFavColor;
	}
	
	

}
