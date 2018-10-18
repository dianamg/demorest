package com.example.demo.controller;

import java.util.List;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.validation.ArgumentValidation;



@RestController
public class Calculator {
	
    @RequestMapping("/add")
	public Integer add(Integer opr1 , Integer opr2){
	  //url consumo get http://localhost:8080/add?opr1=10&opr2=9
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
