package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserRepository repository;

	@Override
	public void registerUser(User user) {
		repository.save(user);
		
	}

	@Override
	public void registerUser() {
		// TODO Auto-generated method stub
		
	}

}
