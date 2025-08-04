package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.service.DeleteService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class DeleteController {

    private final DeleteService deleteService;

    @DeleteMapping("/delete")
    public String deleteUser(@RequestParam String loginId) {
        deleteService.deleteByLoginId(loginId);
        return "redirect:/login"; 
    }
}
