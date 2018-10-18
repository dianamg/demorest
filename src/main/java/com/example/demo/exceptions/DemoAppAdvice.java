package com.example.demo.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class DemoAppAdvice {

	@ResponseBody
	@ExceptionHandler(DemoAppException.class)
	@ResponseStatus(HttpStatus.EXPECTATION_FAILED)
	String demoAppExceptionHandler(DemoAppException ex) {
		return ex.getMessage();
	}
}
