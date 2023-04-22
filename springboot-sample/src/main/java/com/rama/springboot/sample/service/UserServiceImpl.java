package com.rama.springboot.sample.service;

import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rama.springboot.sample.request.UserRequest;
import com.rama.springboot.sample.response.UserResponse;
import com.rama.springboot.sample.utils.Util;

@Service
public class UserServiceImpl implements UserService {

	Map<String, UserResponse> userDB;
	Util util;
	
	public UserServiceImpl() {
	}
	
	@Autowired
	public UserServiceImpl(Util util) {
		this.util = util;
	}
	
	@Override
	public UserResponse getUser(String userId) {
		if(userDB.containsKey(userId)) {
			return userDB.get(userId);
		} else {
			return null;
		}
	}
	
	@Override
	public UserResponse createUser(UserRequest userRequest) {
		UserResponse userResponse = new UserResponse();
		userResponse.setFirstName(userRequest.getFirstName());
		userResponse.setLastName(userRequest.getLastName());
		userResponse.setEmail(userRequest.getEmail());
		userResponse.setUserDate(Calendar.getInstance());
		
		String userId = util.generateUserId();
		userResponse.setUserId(userId);
		
		if(userDB == null) userDB = new HashMap<String, UserResponse>();
		
		userDB.put(userId, userResponse);
		
		return userResponse;
	}

	@Override
	public UserResponse updateUser(String userId, UserRequest userRequest) {
		if(userDB.containsKey(userId)) {
			UserResponse userResponse = userDB.get(userId);
			userResponse.setFirstName(userRequest.getFirstName());
			userResponse.setLastName(userRequest.getLastName());
			userResponse.setEmail(userRequest.getEmail());
			userDB.put(userId, userResponse);
			return userResponse;
		} else {
			return null;
		}
	}

	@Override
	public boolean deleteUser(String userId) {
		if(userDB.containsKey(userId)) {
			userDB.remove(userId);
			return true;
		} else {
			return false;
		}
		
	}

	@Override
	public List<UserResponse> getUsers() {
		
		List<UserResponse> userList = userDB.values().stream()
				.collect(Collectors.toList());
		
		return userList;
	}

}
