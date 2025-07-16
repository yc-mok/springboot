package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.form.SignupForm;
import com.example.demo.service.SignupService;

import lombok.RequiredArgsConstructor;


@Controller
@RequiredArgsConstructor 
public class SignupController {
	
	private final SignupService service;
	
	
    @GetMapping("/signup")
    public String view(Model model, SignupForm form) {
        return "signup";
    }

    @PostMapping("/signup")
    public void signup(Model model, SignupForm form) {
       var userInfo = service.resistUserInfo(form);
    }
}
