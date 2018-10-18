package com.example.demo.mappers;

import com.example.demo.domain.Departament;
import com.example.demo.dto.DepartamentDTO;

public class DepartamentMapper {
	 
	private DepartamentDTO dto;
	
	public DepartamentMapper(DepartamentDTO dto) {
		this.dto = dto;
	}
	
	
	public Departament mapEntity() {
		Departament departament = new Departament();
		departament.setId(this.dto.getId());
		departament.setName(this.dto.getName());
		return departament;
	}

}
