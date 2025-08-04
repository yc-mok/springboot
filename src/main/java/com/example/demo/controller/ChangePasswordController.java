package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.example.demo.form.ChangePasswordForm;
import com.example.demo.service.SignupService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class ChangePasswordController {

	private final SignupService services;
	
	@GetMapping("/ChangePassword")
	public String view(Model model) {
	    model.addAttribute("changePasswordForm", new ChangePasswordForm()); // ★追加
	    return "ChangePassword";
	}
	  @PutMapping("/ChangePassword")
	  public String ChangePassword(ChangePasswordForm form) {
		    services.changePassword(form.getLoginId(), form.getPassword());
		    return "redirect:/login";
	    }
}
