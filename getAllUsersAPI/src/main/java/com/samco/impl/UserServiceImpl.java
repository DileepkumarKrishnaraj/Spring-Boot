package com.samco.impl;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.samco.model.User;

@Service
public class UserServiceImpl implements UserService {

	@Override
	public List<User> getAllUsers() { 
		return this.users;
	}
	public static List<User> users;
	public UserServiceImpl(){
		users = new LinkedList<>();
		users.add(new User(1, "Nitheesh", "nitheesh@gmail.com", "08-06-2000"));
		users.add(new User(2, "Kalai", "kalai@gmail.com", "08-03-2000"));
		users.add(new User(3, "Yamini", "yamini@gmail.com", "30-12-2000"));
		
	}
}
