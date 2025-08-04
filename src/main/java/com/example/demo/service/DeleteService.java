package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.repository.UserInfoRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class DeleteService {
	private final UserInfoRepository repository;

	public void deleteByLoginId(String loginId) {
		repository.deleteByLoginId(loginId);
	}
	
}


