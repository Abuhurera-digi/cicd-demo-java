package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@GetMapping("/")
	public String cicd() {
		return "welcome to cicd learning abuHurera 3rd day testing with https ok ok";
	}
	@GetMapping("/abu")
	public String abu()
	{
		return "abuhurera";
	}
	@GetMapping("/nisha")
	public String nisha()
	{
		return "harini";
	}
}
