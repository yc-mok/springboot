package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * 
 * MenuController
 * 
 */
@Controller
public class menuController {
	@GetMapping("/menu/{loginId}")
	public String view(@PathVariable String loginId, Model model) {
		model.addAttribute("loginId", loginId);
		return "menu";
		
	}
	
	
}


