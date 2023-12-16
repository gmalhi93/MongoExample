package com.malhitech.MongoExample.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.malhitech.MongoExample.entity.Employee;

@Service
public class MongoService {
	@Autowired
	MongoRepository repository;
	
	public List<Employee> getAllEmployees(){
		return repository.findAll();
	}

	public Optional<Employee> getEmployeeById(@PathVariable String id){
	
	return repository.findById(id);
	}
	
	public Employee saveEmployee(Employee employee)
	{
		return (Employee) repository.save(employee);
	}
	
}
