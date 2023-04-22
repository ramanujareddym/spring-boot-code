package com.rama.springboot.sample.response;

import java.util.Calendar;

import com.fasterxml.jackson.annotation.JsonView;

import lombok.Data;

@Data
public class UserResponse {
	private String firstName;
	private String lastName;
	private String email;
	private String userId;
	@JsonView
	private Calendar userDate;
}
