package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Departament;
import com.example.demo.dto.DepartamentDTO;
import com.example.demo.manager.DepartamentManager;

@RestController
public class DepartamentController {
	
	@Autowired
	DepartamentManager departamentManager;
	
	@PostMapping("/addDepartament")
	public void addDepartament(@RequestBody DepartamentDTO departament) throws Exception {
		departamentManager.addDepartament(departament);
	}
	
	@GetMapping("/getDepartament")
	public Departament getDepartament(Integer id) {
		return departamentManager.getDepartament(id);
	}

}
