package com.example.demo.manager;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Departament;
import com.example.demo.dto.DepartamentDTO;
import com.example.demo.exceptions.DemoAppException;
import com.example.demo.mappers.DepartamentMapper;
import com.example.demo.repository.DepartamentRepository;

@Service
@Transactional
public class DepartamentManager {
	
	@Autowired
	DepartamentRepository departamentRepository;
	
	public void addDepartament(DepartamentDTO departamentDTO) throws Exception {
		try {
			departamentDTO.setId(null);
			Departament aDepartament = new DepartamentMapper(departamentDTO).mapEntity();
			departamentRepository.createDepartament(aDepartament);
		} catch(Exception e){
		   System.out.println(e.getMessage());	
		   throw new DemoAppException(e.getMessage());
		}
	}
	
	public Departament getDepartament(Integer primaryKey) {
		return departamentRepository.findDepartament(primaryKey);
	}


}
