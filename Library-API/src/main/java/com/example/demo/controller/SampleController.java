
package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.service.SampleService;

@RestController
public class SampleController {
	@Autowired
	SampleService sampleservice;
	
	@RequestMapping(value = "/getData", method = RequestMethod.GET)
    public List<Employee> custom() {
        return sampleservice.getdata();
    }
	@RequestMapping(value = "/getCust", method = RequestMethod.GET)
    public String custom1() {
        return "hello";
    }
	@RequestMapping(value = "/getCust1", method = RequestMethod.GET)
    public String custom2() {
        return "hello";
    }
}