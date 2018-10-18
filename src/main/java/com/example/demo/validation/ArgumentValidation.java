package com.example.demo.validation;

public class ArgumentValidation {
	
	public static void validateNull(Object arg1) {
	  if (arg1 == null) {
		 throw new IllegalArgumentException("ArgumentValidation validateNull Error");
	  }
	}
	
	public static Integer initArgument(Integer arg1) {
		  if (arg1 == null) {
			 return 0;
		  }
		  return arg1;
	}

}
