package com.samco.controller;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.samco.impl.UserService;
import com.samco.model.User;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserService userService;
	
	//getAllUsers
	@ResponseBody
	@RequestMapping("/getAllUsers")
	public List<User> getAllUsers() {
		return userService.getAllUsers();
	}
	
	//getUser
	@ResponseBody
	@RequestMapping("/{id}")
	public User getUser(@PathVariable("id") Integer userId) {
		return userService.getUser(userId);
	}
	
	//createUser
	@ResponseBody
	@PostMapping
	public Map<String, Object> createUser(@RequestParam(value = "userId") Integer userId,
	@RequestParam(value = "userName") String userName,
	@RequestParam(value = "userEmail") String userEmail,
	@RequestParam(value = "userDob") String userDob) {
		Map<String, Object> map = new LinkedHashMap<>();
		userService.createUser(userId, userName, userEmail, userDob);
		map.put("result", "added");
		return map;
	}
	
	//updateUser
	@ResponseBody
	@PutMapping
	public Map<String, Object> updateUser(@RequestParam(value = "userId") Integer userId, @RequestParam(value = "userName") String userName, @RequestParam(value = "userEmail") String userEmail, @RequestParam(value = "userDob") String userDob){
		Map<String, Object> map = new LinkedHashMap<>();
		userService.updateUser(userId, userName, userEmail, userDob);
		map.put("result", "updated");
		return map;
	}
	
	//deleteUser
	@ResponseBody
	@RequestMapping(value = "/deleteUser/{id}", method = RequestMethod.DELETE)
	public Map<String, Object> deleteUser(@PathVariable("id") Integer userId){
		Map<String, Object> map = new LinkedHashMap<>();
		userService.deleteUser(userId);
		map.put("result", "deleted");
		return map;
	}
	
}
