package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.domain.Departament;

public interface DepartamentRepository extends JpaRepository<Departament, Integer> {
	
	
	public void createDepartament(Departament departament); 
	public Departament findDepartament(Integer primaryKey);

}
