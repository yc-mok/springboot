package com.example.demo.service;


import org.dozer.Mapper;
import org.springframework.stereotype.Service;

import com.example.demo.entity.UserInfo;
import com.example.demo.form.SignupForm;
import com.example.demo.repository.UserInfoRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SignupService {

	private final UserInfoRepository repository;
	
	private final Mapper mapper;
	
	
	public UserInfo resistUserInfo(SignupForm form){
		var userInfo = mapper.map(form, UserInfo.class);

		return repository.save(userInfo);
	}
}
