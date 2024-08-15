package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@GetMapping("/")
	public String cicd() {
		return "welcome to cicd learning abuHurera";
	}
	@GetMapping("/abu")
	public String abu()
	{
		return "abuhurera";
}
