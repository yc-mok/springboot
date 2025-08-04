package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 
 * MenuController
 * 
 */
@Controller
public class menuController {
	@GetMapping("/menu")
	public String view() {
		
		return "menu";
		
	}
	
	
}


