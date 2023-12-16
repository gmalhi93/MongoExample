package com.malhitech.MongoExample.repository;

import com.malhitech.MongoExample.entity.Employee;

public interface MongoRepository extends org.springframework.data.mongodb.repository.MongoRepository<Employee, String>{

}
