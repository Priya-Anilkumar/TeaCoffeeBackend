package com.cogent.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends Exception{
	public ResourceNotFoundException(String msg) {
		super(msg);
	}

}
