package com.example.blog.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.blog.Model.user;
import com.example.blog.Repository.userRepository;

@Service
public class UserService {

	@Autowired
	private userRepository userRepository;
	
	// 1. user를 저장하는 기능
	public void save(user user) {
		userRepository.save(user);
	}
}
