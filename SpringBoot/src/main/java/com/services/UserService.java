package com.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.model.User;

@Service
public class UserService {
	 static List<User> list = new ArrayList<User>();
	 
	public List<User> getUserList() { 
		 list.add(new User(1,"Atul","Mumbai",30));
		 list.add(new User(2,"Amit","Pune",65));
		 list.add(new User(3,"Eric","Orlando",42));
		return list;
	}

	public List<User> getUserById(int id) { 
		 
		return null;
	}

}
