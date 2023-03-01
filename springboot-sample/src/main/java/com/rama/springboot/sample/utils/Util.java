package com.rama.springboot.sample.utils;

import java.util.UUID;

import org.springframework.stereotype.Service;

@Service
public class Util {
	public String generateUserId() {
		return UUID.randomUUID().toString();
	}
}
