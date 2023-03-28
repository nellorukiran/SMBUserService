package com.smb.advise;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.smb.exceptions.EmptyInputException;

@ControllerAdvice
public class MyControllerAdvise {

	@ExceptionHandler(EmptyInputException.class)
	public ResponseEntity<String> handleEmptyException(EmptyInputException emptyInputException){
		return new ResponseEntity<String>("Input fields are empty, Please look into it!",HttpStatus.BAD_REQUEST);
	}
}
