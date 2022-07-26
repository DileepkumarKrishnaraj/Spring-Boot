package com.samco.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.samco.impl.UserService;
import com.samco.model.User;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserService userService;
	@ResponseBody
	@RequestMapping("")
	public List<User> getAllUsers() {
		return userService.getAllUsers();

	}
}
	