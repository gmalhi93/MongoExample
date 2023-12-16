package com.malhitech.MongoExample.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.malhitech.MongoExample.entity.Employee;
import com.malhitech.MongoExample.service.MongoService;

@RestController
@RequestMapping("/MongoExample1")
public class MongoController {
	@Autowired
	MongoService myService;
	
	
	@PostMapping("/employee")
	public Employee saveEmployee(@RequestBody Employee  employee)
	{
		return myService.saveEmployee(employee);
	}
	
	@GetMapping("/employee")
	public List<Employee> getAllEmployees(){
		
		return myService.getAllEmployees();
	}
	
	@GetMapping("/employee/{id}")
	public Optional<Employee> getEmployeeById(@PathVariable String id){
		
		return myService.getEmployeeById(id);
	}
	
}
