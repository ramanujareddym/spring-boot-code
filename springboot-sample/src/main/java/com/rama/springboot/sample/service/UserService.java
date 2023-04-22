package com.rama.springboot.sample.service;

import java.util.List;

import com.rama.springboot.sample.request.UserRequest;
import com.rama.springboot.sample.response.UserResponse;

public interface UserService {
	
	public List<UserResponse> getUsers();
	public UserResponse getUser(String userId);
	public UserResponse createUser(UserRequest userRequest);
	public UserResponse updateUser(String userId, UserRequest userRequest);
	public boolean deleteUser(String userId);
}
