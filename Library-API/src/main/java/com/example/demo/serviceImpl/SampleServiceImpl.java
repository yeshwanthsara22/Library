package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repo.EmployeeRepo;
import com.example.demo.service.SampleService;
@Service
public class SampleServiceImpl implements SampleService{
	@Autowired
	EmployeeRepo employeerepo;
	@Override
	public List<Employee> getdata() {
		return employeerepo.findAll();
		 
	}

	
}
