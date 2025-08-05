package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

import com.example.demo.form.ChangePasswordForm;
import com.example.demo.service.SignupService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class ChangePasswordController {

	private final SignupService services;
	
	@GetMapping("/ChangePassword/{loginId}")
	public String view(@PathVariable String loginId, Model model) {
	    ChangePasswordForm form =  new ChangePasswordForm(); 
	    form.setLoginId(loginId);
        model.addAttribute("changePasswordForm", form);
        model.addAttribute("loginId", loginId);
        return "ChangePassword";
    }
	  @PutMapping("/ChangePassword/{loginId}")
	  public String ChangePassword(ChangePasswordForm form) {
		    services.changePassword(form.getLoginId(), form.getPassword());
		    return "redirect:/login";
	    }
}
