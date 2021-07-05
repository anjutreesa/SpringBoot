package com.example.restfuldemo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

	@ResponseStatus(HttpStatus.NOT_FOUND)
	public class UserNotFoundException extends RuntimeException {
		/**
		 * 
		 */
		private static final long serialVersionUID = -7350076603888437240L;

		public UserNotFoundException(String message) {
			super(message);
		}
	}

