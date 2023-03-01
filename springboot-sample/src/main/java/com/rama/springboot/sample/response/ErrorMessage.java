package com.rama.springboot.sample.response;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ErrorMessage {
	private Date timestamp;
	private String message;
}
