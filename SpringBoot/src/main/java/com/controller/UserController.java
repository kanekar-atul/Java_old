package com.controller;
 

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.model.User;
import com.services.UserService;

@RestController
public class UserController {

	@Autowired
	UserService userService;

	@RequestMapping(method = RequestMethod.GET, value = "/getUsersList")
	public List<User> getUserList() {
		return this.userService.getUserList();
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/getUserById/{id}")
	public List<User> getUserById(@PathVariable int id) {
		return this.userService.getUserById(id);
	}
}
