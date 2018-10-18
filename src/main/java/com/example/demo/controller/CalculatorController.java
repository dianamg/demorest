package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.manager.CalculatorManager;



@RestController
public class CalculatorController {
	
	@Autowired
	CalculatorManager calculatorService;
	
    @RequestMapping("/add")
	public Integer add(Integer opr1 , Integer opr2){
	  //url consumo get http://localhost:8080/add?opr1=10&opr2=9
    	return calculatorService.add(opr1, opr2);
	}

}
