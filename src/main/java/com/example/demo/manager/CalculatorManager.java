package com.example.demo.manager;

import org.springframework.stereotype.Service;

import com.example.demo.validation.ArgumentValidation;

@Service
public class CalculatorManager {
	
	public Integer add(Integer opr1 , Integer opr2) {
	  try {
  		  opr1 = ArgumentValidation.initArgument(opr1);
  		  opr2 = ArgumentValidation.initArgument(opr2);
  		  return opr1+opr2;
  		  
  	  } catch(Exception e) {
  		 System.out.println(e.getMessage()); 
  	  }
  	  return 0;
	}
}
