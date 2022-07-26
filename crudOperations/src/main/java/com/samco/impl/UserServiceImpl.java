package com.samco.impl;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.samco.model.User;

@Service
public class UserServiceImpl implements UserService {
	public List<User> users = new ArrayList<User>();
	
	
	public UserServiceImpl(){
		users = new LinkedList<>();
		users.add(new User(1, "Dileep", "dileep@gmail.com", "14-03-2001"));
		users.add(new User(2, "Nitheesh", "nitheesh@gmail.com", "08-06-2000"));
		users.add(new User(3, "Kalai", "kalai@gmail.com", "08-03-2000"));
		users.add(new User(4, "Yamini", "yamini@gmail.com", "30-12-2000"));
	}
	
	//getAllUsers
	@Override
	public List<User> getAllUsers() {
		return this.users;
	}
	
	//getUser
	@Override
	public User getUser(Integer userId) {
		return users.stream().filter(x -> x.getUserId() == userId).findAny().orElse(new User(0, "Not Available", "Not Available", "Not Available"));
	}
	
	//createUser
	@Override
	public void createUser(Integer userId, String userName, String userEmail, String userDob) {
		User user = new User(userId, userName, userEmail, userDob);
		this.users.add(user);
	}
	
	//updateUser
	@Override
	public void updateUser(Integer userId, String userName, String userEmail, String userDob) {
		users.stream().filter(x -> x.getUserId() == userId).findAny().orElseThrow(() -> new RuntimeException("Item not found")).setUserName(userName);     
	}
	
	//deleteUser
	@Override
	public void deleteUser(Integer userId) {
		users.removeIf((User u) -> u.getUserId() == userId);
	}
	
}
