package com.samco.impl;

import java.util.List;

import com.samco.model.User;

public interface UserService {
	List<User> getAllUsers();
	User getUser(Integer userId); 
	void createUser(Integer userId, String userName, String userEmail, String userDob);
	void updateUser(Integer userId, String userName, String userEmail, String userDob);
	void deleteUser(Integer userId);
}
